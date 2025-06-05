package com.example.TiendaOnline.Producto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@RestController // Consumir o consultar informacion desde este archivo
@RequestMapping(path = "api/v1/productos")

public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getProductos() {
        return productoService.getProductos();
    }

    @PostMapping
    public ResponseEntity<Object> registrarProducto(@RequestBody Producto producto) {
        return this.productoService.newProducto(producto);
    }

    @PutMapping
    public ResponseEntity<Object> actualizarProducto(@RequestBody Producto producto) {
        return this.productoService.newProducto(producto);
    }

    @DeleteMapping(path = "{productoId}")
    public ResponseEntity<Object> eliminar(@PathVariable("productoId") Long id){
        return this.productoService.deleteProducto(id);
    }
}
