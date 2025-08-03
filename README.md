# 🛋️ TiendaMueble - Proyecto de Digitalización

**TiendaMueble** es una tienda ficticia especializada en la venta de muebles para el hogar. Este proyecto representa la transformación digital de su sitio web: pasamos de una página estática hecha con Bootstrap a una aplicación web dinámica, escalable y profesional desarrollada con **Spring Boot** y **Thymeleaf**.

La finalidad del proyecto es gestionar productos, formularios de contacto, usuarios y otras entidades clave desde un backend robusto y un frontend elegante y funcional. Esto mejora la mantenibilidad del sistema y sienta las bases para escalar el negocio digitalmente.

## 🌐 Versión estática original del proyecto

Antes de la transformación digital, el sitio web de TiendaMueble fue desarrollado como una página estática utilizando **Bootstrap**. Si deseas revisar cómo era el proyecto antes de convertirse en una aplicación dinámica con Spring Boot y Thymeleaf, puedes visitar el siguiente repositorio:

🔗 [Repositorio de la versión estática](https://github.com/EduMoralesCar/TransformacionDigital_TiendaMuebles.git)

---

## 📖 Historia del Proyecto

Este sistema nació como una tienda básica estática y evolucionó hacia una aplicación dinámica mediante la integración de tecnologías modernas. La arquitectura ahora sigue el patrón MVC, permitiendo una gestión fluida de contenidos, validación en formularios, y operaciones CRUD completas sobre productos y usuarios.

El sitio ahora puede:

- Visualizar productos desde una base de datos.
- Validar formularios de contacto con retroalimentación al usuario.
- Administrar desde el backend distintos recursos (clientes, galerías, mensajes, etc.).
- Escalar funcionalmente con facilidad.

---

## 🚀 Tecnologías Implementadas

### 🧠 Backend

- **Java 23** — Lenguaje base del sistema.
- **Spring Boot v3.4.5** — Framework principal.
- **Spring MVC** — Control de rutas y peticiones.
- **Spring Data JPA + Hibernate** — Persistencia y ORM.
- **Spring Validator** — Validación de datos del lado servidor.
- **Spring Security** — Seguridad y autenticación (si aplica).
- **MySQL** — Base de datos relacional.

### 🎨 Frontend

- **Thymeleaf** — Motor de plantillas para vistas dinámicas.
- **Bootstrap 5.3** — Estética responsiva.
- **JavaScript** — Validaciones e interactividad.
- **CSS3** — Estilos personalizados.
- **HTML5** — Estructura de las páginas.

---

## 📦 Dependencias (pom.xml)

Incluidas en el archivo `pom.xml` del proyecto:

- `spring-boot-starter-web`
- `spring-boot-starter-thymeleaf`
- `spring-boot-starter-data-jpa`
- `spring-boot-devtools`
- `spring-boot-starter-security`
- `spring-boot-starter-test`
- `mysql-connector-java`
- `lombok`

---

## 🛠️ Configuración del Proyecto

### Requisitos Previos

- Java 23
- Maven 3.6.3
- MySQL Server

### Instalación y Ejecución

```bash
git clone https://github.com/EduMoralesCar/TiendaDigital_SpringBoot.git
cd TiendaDigital_SpringBoot

# Crear la base de datos en MySQL (usa el nombre del archivo application.properties)
# Asegúrate de editar src/main/resources/application.properties con tus credenciales (usuario, contraseña, URL, etc.)

# Ejecuta la aplicación en modo desarrollo utilizando Maven
mvn spring-boot:run
```

### 🌐 Acceso a la aplicación
📍 Abre tu navegador en:
```bash
http://localhost:login
```
## 🗂️ Estructura Completa del Proyecto
```bash
📁 TiendaDigital_SpringBoot/
├── 📄 pom.xml
├── 📄 README.md
└── 📁 src/
    └── 📁 main/
        ├── 📁 java/
        │   └── 📁 com/
        │       └── 📁 edu/
        │           └── 📁 tiendamueble/
        │               ├── 📁 controllers/
        │               │   ├── 📁 DEMO/
        │               │   │  ├── 📄 DemoController.java
        │               │   ├── 📁 JWT/
        │               │   │  ├── 📄 JwtAuthenticationFilter.java
        │               │   │  ├── 📄 JwtServicc.java
        │               │   ├── 📄 AuthController.java
        │               │   ├── 📄 AuthResponse.java
        │               │   ├── 📄 AuthService.java
        │               │   ├── 📄 AuthWebController.java
        │               │   ├── 📄 InicioController.java
        │               │   ├── 📄 LoginRequest.java
        │               │   ├── 📄 RegisterRequest.java
        │               │   └── 📄 UsuarioCoontrollers.java
        │               ├── 📁 model/
        │               │   ├── 📁 ENTITY/
        │               │   │  ├── 📄 Role.java
        │               │   │  ├── 📄 User.java
        │               │   ├── 📄 Producto.java
        │               │   ├── 📄 ArticuloBlog.java
        │               │   ├── 📄 CategoriaGaleria.java
        │               │   ├── 📄 Contacto.java
        │               │   ├── 📄 ImagenGaleria.java
        │               │   ├── 📄 SeccionNosotros.java
        │               │   └── 📄 Pais.java
        │               ├── 📁 repository/
        │               │   ├── 📄 ArticuloBlogRepository.java
        │               │   ├── 📄 CategoriaGaleriaRepository.java
        │               │   ├── 📄 ContactoRepository.java
        │               │   ├── 📄 ImagenGaleriaRepository.java
        │               │   ├── 📄 SeccionNosotrosRepository.java
        │               │   └── 📄 UserRepository.java
        │               ├── 📁 service/
        │               │   ├── 📄 AplicationConfig.java
        │               │   └── 📄 SecurityConfig.java
        │               └── 📄 TiendaMuebleApplication.java
        └── 📁 resources/
            ├── 📁 static/
            │   ├── 📁 blog/
            │   ├── 📄 diseño_exteriores.html
            │   ├── 📄 diseño_interiores.html
            │   ├── 📄 guias_colores.html
            │   ├── 📄 nuevos_modelos.html
            │   ├── 📁 css/
            │   │   └── 📄 app.css
            │   │   └── 📄 login.css
            │   ├── 📁 js/
            │   │   └── 📄 scripts.js
            │   └── 📁 images/
            │       ├── 🖼️ logo.png
            │       └── 📁 muebles/
            │           ├── 🪑 silla1.jpg
            │           └── 🛏️ mesa1.jpg
            ├── 📁 templates/
            │   ├── 📄 index.html
            │   ├── 📄 contacto.html
            │   ├── 📄 galeria.html
            │   ├── 📄 blog.html
            │   ├── 📄 nosotros.html
            │   ├── 📄 register.html
            │   ├── 📄 tienda.html
            │   └── 📄 login.html
            └── 📄 application.properties
```
