# 🛒 Tienda Online - Módulo de Productos (API REST con Spring Boot y MySQL)

Este proyecto es una API RESTful para gestionar productos en una tienda online. Actualmente solo implementa el módulo de productos, con operaciones CRUD, desarrollado con **Java 17**, **Spring Boot**, **Spring Data JPA** y **MySQL**. Está diseñado para ser escalable y permitir agregar más módulos en el futuro (clientes, órdenes, pagos, etc.).

## 🚀 Tecnologías usadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL Driver
- Maven
- Postman (para pruebas)

## 📦 Funcionalidades

- Listar todos los productos
- Crear un nuevo producto
- Actualizar un producto existente
- Eliminar un producto
- Validar nombre duplicado en creación

## 🔧 Endpoints

| Método | URL                     | Descripción                   |
|--------|--------------------------|-------------------------------|
| GET    | /api/v1/productos        | Listar todos los productos    |
| POST   | /api/v1/productos        | Crear un nuevo producto       |
| PUT    | /api/v1/productos        | Actualizar un producto        |
| DELETE | /api/v1/productos/{id}   | Eliminar un producto por ID   |

## 🧪 Ejemplo de JSON para POST y PUT

```json
{
  "id": 1,            // Solo requerido para PUT
  "nombre": "Mouse Logitech M720",
  "precio": 49.99
}
