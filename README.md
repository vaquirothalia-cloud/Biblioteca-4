# Biblioteca-4
**Sistema De Gestión de Biblioteca**
- **Objetivo:** Aplicar Programación Orientada a Objetos en Java, desarrollando un CRUD básico con Spring Boot bajo  y gestionando el proyecto de forma colaborativa en GitHub.  


## Requerimiento del sistema
Se debe construir un **CRUD de Libros** con las siguientes características:  

### Entidad `Libro`
- `id` (autogenerado)  
- `titulo` (String)  
- `autor` (String)  
- `anioPublicacion` (int)  
- `disponible` (boolean)  

### Funcionalidades obligatorias
- `POST   /libros` → Crear libro  
- `GET    /libros` → Listar todos los libros  
- `GET    /libros/{id}` → Obtener libro por ID  
- `PUT    /libros/{id}` → Actualizar libro  
- `DELETE /libros/{id}` → Eliminar libro  

### Funcionalidad extra 
- `GET    /libros?autor=...` → Filtrar libros por autor  


## Stack
- Java 17+  
- Spring Boot (Web, Data JPA)  
- H2 (en memoria) ó PostgreSQL  
- Maven  
- Postman  


## Instrucciones de ejecución

### 1. Clonar el proyecto
```bash
git clone https://github.com/vaquirothalia/Biblioteca-4.git
cd Bibli9oteca-4
```


### 2. Compilar y Ejecutar 
```bash
mvn spring-boot:run
```

El servidor se levantará en:
http://localhost:8080


## Responsabilidades de cada integrante

### 1. Thalia Del Mar Manrique Vaquiro (Repo & Docs):

- Crear el repositorio en GitHub y añadir colaboradores.
- Configurar .gitignore.
- Mantener este README actualizado.
- Subir evidencias (capturas, colección Postman).

### 2. Integrante B (Modelo & Repositorio):

- Crear la entidad Libro con JPA.
- Implementar LibroRepository con JpaRepository.

### 3. Integrante C (Servicio):

- Implementar LibroService con la lógica del CRUD.
- Validaciones (título no vacío, año válido).

### 4. Integrante D (Controlador & Pruebas):

- Construir LibroController con los endpoints REST.
- Probar la API con Postman y subir capturas/colección.


## Evidencia de colaboración en GitHub

Cada integrante debe:

- Hacer commits con su propia cuenta.
- Crear ramas para sus tareas.
- Hacer pull requests y resolver issues en grupo.
