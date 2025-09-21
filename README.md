Biblioteca - CRUD de Libros con Spring Boot
Este proyecto es una aplicación de ejemplo desarrollada con Spring Boot que implementa un sistema básico de gestión de libros mediante un CRUD (Create, Read, Update, Delete) .

Tecnologías utilizadas
Java 17+
Bota de primavera 3+
Spring Web (para exponer la API REST)
Spring Data JPA (para acceder a la base de datos)
Maven (gestión de dependencias)
Configuración
En el archivo application.propertiesse define la configuración básica de la aplicación, como la conexión a la base de datos.

Ejecución
Clonar el repositorio:

clon git https://github.com/usuario/demo1.git cd demo1

Compilar y ejecutar con Maven:

./mvnw spring-boot:ejecutar

La aplicación quedará disponible en: http://localhost:8080

Puntos finales principales

El controlador LibroController expone endpoints REST para gestionar libros:

GET /libros → listar todos los libros

GET /libros/{id} → obtener un libro por ID

POST /libros → crear un nuevo libro

PUT /libros/{id} → actualizar un libro existente

DELETE /libros/{id} → eliminar un libro

Pruebas
Ejecutar las pruebas unitarias:

prueba ./mvnw

Autores
Jefferson Rueda

Thalía Vaquiro

David Burgos
