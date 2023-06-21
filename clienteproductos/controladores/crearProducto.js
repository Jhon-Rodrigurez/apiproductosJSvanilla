const API= "http://localhost:8080"
const CREARPRODUCTO_POST_ENDPOINT= API + "/producto"

const crear= async (producto)=>{

    console.log(producto)

    try {

        const respuesta= await fetch(CREARPRODUCTO_POST_ENDPOINT,
                                        {method: "POST",
                                        headers: {"Content-Type": "application/json"},
                                        body: JSON.stringify(producto)})

        return await respuesta.json()

    } catch(error){
        console.log("Error fetch", error)
    }
}

function crearProducto() {

    const idProducto= document.getElementById("id").value
    const nombre= document.getElementById("nombre").value
    const precio= document.getElementById("precio").value
    const iva= document.getElementById("iva").value

    crear({idProducto, nombre, precio, iva})
    .then(respuesta=>{
        document.location.href="../index.html"
    })

}