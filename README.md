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
---

## 🖼️ Capturas de Pantalla
### Paso 1:
> Ejecutamos la aplicación en modo desarrollo utilizando Maven
<img width="935" height="187" alt="image" src="https://github.com/user-attachments/assets/bffd5ec2-b3c9-4a24-9eff-39bac13eeacb" />

> #### Resultado en la consola
<img width="1273" height="907" alt="image" src="https://github.com/user-attachments/assets/79f47663-a0a0-4c9f-b296-4a63e2146c5c" />

###  Paso 2:
> Abrimos nuestro navegador y escribimos:
 ```bash
http://localhost:login
```
> #### Resultado en el navegador
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/5de6e708-3140-4321-b8bd-feb6c908727d" />

### Paso 3: Iniciar sesión
> Si ya tienes una cuenta, ingresa tus credenciales en la pantalla de login para acceder a la plataforma.
<img width="1364" height="767" alt="image" src="https://github.com/user-attachments/assets/37a1ae7c-dcc3-44f6-86bf-01a3eab62886" />

> #### Una vez iniciada la sesión correctamente, serás redirigido automáticamente a la página principal de la tienda.
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/66c4e5f1-3d98-4f2a-a765-67cc78d6ab37" />

> #### 🏠 Aquí podrás navegar por los productos, acceder al blog, revisar tu perfil y explorar las distintas secciones disponibles.

### Paso 4: Registrarse
> Si es tu primera vez, haz clic en “Registrarse” y completa el formulario para crear tu cuenta.
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/7ed31529-156f-454e-a5a4-6f984e94a244" />

> #### Ingresamos nuestras Credenciales
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/3515fa4e-8487-4ba8-a706-135946e946ad" />

> #### Iniciamos Sesión
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/bf248049-971b-4c7b-b589-3ddb331cc4d0" />

> #### Una vez iniciada la sesión correctamente, serás redirigido automáticamente a la página principal de la tienda.
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/cff3b0ce-8ccf-4f83-a151-b1764c6f0469" />

> #### 🏠 Aquí podrás navegar por los productos, acceder al blog, revisar tu perfil y explorar las distintas secciones disponibles.

### Paso 5: Visualización de registros en MySQL
> Tras iniciar sesión o registrarse, puedes verificar que los datos del usuario han sido almacenados correctamente en la base de datos MySQL.
> 
> 🗃️ También se registran las secciones disponibles en la página, como el blog, galería, contacto, tienda, entre otras.
> 
> 📸 A continuación se muestra una captura de los registros en MySQL:
> <img width="1134" height="617" alt="Registros en MySQL" src="https://github.com/user-attachments/assets/1acd7eca-f69b-4e1b-b148-fd0d95af6782" />

### Paso 6: 👨‍💻 Créditos 
> A continuación se muestran los nombres de los colaboradores principales del proyecto:
> 
<img width="1365" height="767" alt="image" src="https://github.com/user-attachments/assets/8e62375f-a0cc-45fc-a96f-723c9fc9d74e" />


---
