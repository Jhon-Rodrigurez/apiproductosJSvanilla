const API= "http://localhost:8080"
const OBTENERPRODUCTO_GET_ENDPOINT= API + "/producto";

const obtener= async (producto)=>{
    console.log(producto)

    try {
        const respuesta= await fetch(OBTENERPRODUCTO_GET_ENDPOINT)

        return await respuesta.json()

    } catch(error){
        console.log("Error fetch", error)
    }
}

async function obtenerProductos() {
    const main= document.querySelector("main")
    const cardProducto= document.getElementById("productoTemplate").content
    const fragment= document.createDocumentFragment()

    const productos = await obtener()

    productos.forEach(producto => {
        cardProducto.getElementById("nombre").textContent= producto.nombre
        cardProducto.getElementById("id").textContent= producto.idProducto
        cardProducto.getElementById("precio").textContent= producto.precio
        cardProducto.getElementById("iva").textContent= producto.iva
        cardProducto.getElementById("estado").textContent= producto.estado

        const clone= cardProducto.cloneNode(true)
        fragment.appendChild(clone)
    });

    main.appendChild(fragment)

}

obtenerProductos()
