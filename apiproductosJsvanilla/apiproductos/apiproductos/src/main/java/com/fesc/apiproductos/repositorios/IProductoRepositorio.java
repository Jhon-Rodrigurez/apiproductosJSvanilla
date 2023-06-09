package com.fesc.apiproductos.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fesc.apiproductos.modelos.ProductoEntidad;


@Repository
public interface IProductoRepositorio extends CrudRepository<ProductoEntidad, Long>{
    
    List<ProductoEntidad> findAll();
}
