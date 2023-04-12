package com.fesc.apiproductos.controladores;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.apiproductos.modelos.ProductoCrearModelo;
import com.fesc.apiproductos.modelos.ProductoDto;
import com.fesc.apiproductos.modelos.ProductoRespuestaModelo;
import com.fesc.apiproductos.servicios.IProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoControlador {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoServicio iProductoServicio;
    
    @GetMapping
    public List<ProductoRespuestaModelo> obtenerProductos() {

        List<ProductoDto> productoDtosList = iProductoServicio.obteneProductoDtos();

        List<ProductoRespuestaModelo> productoRespuestaModelosList = new ArrayList<>();

        for(ProductoDto productoDto: productoDtosList) {

            ProductoRespuestaModelo productoRespuestaModelo = modelMapper.map(productoDto, ProductoRespuestaModelo.class);
            productoRespuestaModelosList.add(productoRespuestaModelo);
        }

        return productoRespuestaModelosList;
       
    }

    @PostMapping
    public ProductoRespuestaModelo creaProducto(@RequestBody ProductoCrearModelo productoCrearModelo) {
        
        ProductoDto productoDto = modelMapper.map(productoCrearModelo, ProductoDto.class);

        ProductoDto productoDtoCreado = iProductoServicio.creaProducto(productoDto);

        ProductoRespuestaModelo productoRespuestaModelo = modelMapper.map(productoDtoCreado, ProductoRespuestaModelo.class);

        return productoRespuestaModelo;
    }
}
