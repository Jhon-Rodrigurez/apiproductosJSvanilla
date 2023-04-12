package com.fesc.apiproductos.servicios;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesc.apiproductos.modelos.ProductoDto;
import com.fesc.apiproductos.modelos.ProductoEntidad;
import com.fesc.apiproductos.repositorios.IProductoRepositorio;

@Service
public class ProductosServicio implements IProductoServicio{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoRepositorio iProductoRepositorio;

    @Override
    public List<ProductoDto> obteneProductoDtos() {

        List<ProductoEntidad> productoEntidadesList = iProductoRepositorio.findAll();

        List<ProductoDto> productoDtosList = new ArrayList<>();

            for (ProductoEntidad productoEntidad : productoEntidadesList) {
                
                ProductoDto productoDto = modelMapper.map(productoEntidad, ProductoDto.class);
                productoDtosList.add(productoDto);
            }
        
        return productoDtosList;

    }

    @Override
    public ProductoDto creaProducto(ProductoDto productoDto) {
        
        ProductoEntidad productoEntidad = modelMapper.map(productoDto, ProductoEntidad.class);
        productoEntidad.setEstado(false);

        ProductoEntidad productoEntidadCreado = iProductoRepositorio.save(productoEntidad);

        ProductoDto productoDtoCreado = modelMapper.map(productoEntidadCreado, ProductoDto.class);

        return productoDtoCreado;

    }
    
}
