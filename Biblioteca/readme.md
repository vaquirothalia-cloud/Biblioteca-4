# Biblioteca - CRUD de Libros con Spring Boot

Este proyecto es una aplicación de ejemplo desarrollada con **Spring Boot** que implementa un sistema básico de gestión de libros mediante un **CRUD (Create, Read, Update, Delete)**.

# Tecnologías utilizadas
- **Java 17+**
- **Spring Boot 3+**
- **Spring Web** (para exponer la API REST)
- **Spring Data JPA** (para acceso a la base de datos)
- **Maven** (gestión de dependencias)


#  Configuración
En el archivo `application.properties` se define la configuración básica de la aplicación, como la conexión a la base de datos (por defecto H2).


## Ejecución

Clonar el repositorio:

git clone https://github.com/usuario/demo1.git
cd demo1


Compilar y ejecutar con Maven:

./mvnw spring-boot:run


La aplicación quedará disponible en:
 http://localhost:8080

 Endpoints principales

El controlador LibroController expone endpoints REST para gestionar libros:

GET /libros → listar todos los libros

GET /libros/{id} → obtener un libro por ID

POST /libros → crear un nuevo libro

PUT /libros/{id} → actualizar un libro existente

DELETE /libros/{id} → eliminar un libro

# Pruebas

Ejecutar las pruebas unitarias:

./mvnw test

# Autores 

Jeferson Rueda

Thalia Vaquiro

David Burgos
