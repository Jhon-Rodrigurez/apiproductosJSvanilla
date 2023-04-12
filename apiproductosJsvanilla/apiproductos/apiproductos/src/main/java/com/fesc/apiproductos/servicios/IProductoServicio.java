package com.fesc.apiproductos.servicios;

import java.util.List;

import com.fesc.apiproductos.modelos.ProductoDto;

public interface IProductoServicio {
    
    List<ProductoDto> obteneProductoDtos();

    ProductoDto creaProducto(ProductoDto productoDto);
}
