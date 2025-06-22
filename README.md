# LiterAlura 📖

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

LiterAlura es una aplicación de línea de comandos que te permite explorar el catálogo de libros de dominio público del Proyecto Gutenberg, almacenando tus búsquedas en una base de datos MySQL.

## 🌟 Características principales

- 🔍 Búsqueda de libros por título
- 📚 Visualización de libros consultados
- ✍️ Listado completo de autores
- 🗓️ Filtrado de autores por año específico
- 🌍 Búsqueda por idioma (es/en/fr/pt/etc.)
- 💾 Almacenamiento local en MySQL
- 🔄 Historial persistente de consultas

## 🛠 Stack Tecnológico

| Componente       | Tecnología           |
|------------------|----------------------|
| Lenguaje         | Java 17              |
| Framework        | Spring Boot 3.5.0    |
| Persistencia     | Spring Data JPA + Hibernate |
| Base de datos    | MySQL 8.0+           |
| Fuente de datos  | API de Gutenberg     |

## 🚀 Configuración Inicial

### Requisitos previos
- Java JDK 17 o superior
- MySQL Server 8.0+
- Maven 3.6+
- Conexión a internet (para acceder a la API)

### 1. Configuración de la base de datos

```sql
-- Crear base de datos
CREATE DATABASE literalura CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Crear usuario (cambia 'password' por tu contraseña)
CREATE USER 'literalura_user'@'localhost' IDENTIFIED BY 'password';

-- Otorgar permisos
GRANT ALL PRIVILEGES ON literalura.* TO 'literalura_user'@'localhost';
FLUSH PRIVILEGES;

2. Configuración de la aplicación
Edita el archivo src/main/resources/application.properties:
# Configuración de MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/literalura?useSSL=false&serverTimezone=UTC
spring.datasource.username=literalura_user
spring.datasource.password=password

# Configuración de Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Configuración de la API
gutenberg.api.url=https://gutendex.com/books

3. Ejecutar la aplicación
# Compilar y ejecutar con Maven
mvn clean install
mvn spring-boot:run

# O ejecutar el JAR directamente
java -jar target/literalura-1.0.0.jar

🖥️ Manual de Uso
Al iniciar la aplicación, verás este menú interactivo:
==================================
      LITERALURA - MENÚ PRINCIPAL
==================================
1. Buscar libro por título
2. Mostrar todos los libros registrados
3. Mostrar todos los autores
4. Buscar autores vivos en año específico
5. Mostrar libros por idioma
6. Salir

Ejemplo de flujo completo:
1. Buscar un libro (Opción 1):
Ingrese el nombre del libro a buscar: Don Quijote

2. Resultados de búsqueda:
Libro encontrado: Don Quijote de la Mancha
Autor: Miguel de Cervantes Saavedra
Idioma: Español
Descargas: 15,672
¿Desea guardar este libro? (s/n): s

3. Consultar libros guardados (Opción 2):
Libros registrados:
1. Don Quijote de la Mancha - Cervantes (Español)
2. Cien años de soledad - García Márquez (Español)

🐛 Solución de Problemas Comunes
Error de conexión a MySQL
Cannot create connection to database server
Solución:

Verifica que MySQL esté corriendo (sudo systemctl status mysql)

Confirma usuario y contraseña en application.properties

Asegúrate de tener los permisos correctos

Error de API
Error al conectar con Gutenberg API

Solución:

Verifica tu conexión a internet

Revisa que la URL en application.properties sea correcta

Espera unos minutos y reintenta (puede haber límite de requests)
📌 Contexto del Proyecto
Este proyecto fue desarrollado como parte del Challenge One del programa Alura ONE (Oracle Next Education), que tiene como objetivo fortalecer habilidades en desarrollo backend con Java y Spring Boot.

📄 Licencia
Este proyecto está bajo licencia MIT. Ver el archivo LICENSE para más detalles.

<div align="center"> <sub>Creado para la comunidad de Alura ONE</sub> </div> ```