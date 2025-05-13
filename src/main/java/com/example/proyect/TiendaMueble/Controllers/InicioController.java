package com.example.proyect.TiendaMueble.Controllers;


import com.example.proyect.TiendaMueble.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class InicioController {

    @GetMapping("/inicio")
    public String mostrarProductos(Model model) {
        List<Producto> productos = Arrays.asList(
                // Primer producto
                new Producto(
                        "Mueble elegante y funcional",
                        "Nuestro mueble de alta calidad ofrece dos compartimentos para exhibir y organizar tus objetos. Incluye un jarrón decorativo.",
                        4000.00,
                        "img/productos/producto1.jpg"
                ),
                // Productos para la primera fila (2 columnas)
                new Producto(
                        "Decoración de Hogar",
                        "Renueva tu hogar con este elegante conjunto. Incluye: sofá en forma de L con cojines estampados, mesa de centro con jarrón y tetera, cómoda blanca, reloj de péndulo, lámpara de pie, y plantas decorativas.",
                        5500.00,
                        "img/productos/producto2.jpg"
                ),
                new Producto(
                        "Sofá elegante y cómodo",
                        "Disfruta del máximo confort con este elegante sofá gris con acolchado. Incluye dos cojines color teal y un cojín decorativo en el centro. Ideal para cualquier sala, este sofá combina estilo y funcionalidad.",
                        3500.00,
                        "img/productos/producto3.jpg"
                ),
                // Productos para la segunda fila (3 columnas)
                new Producto(
                        "Conjunto de Mesa y Sillas Elegante",
                        "Añade un toque moderno a tu espacio con este conjunto. Incluye una mesa redonda blanca con pedestal central y dos sillas con patas de madera y asientos negros. Perfecto para cualquier rincón acogedor.",
                        1200.00,
                        "img/productos/producto4.jpg"
                ),
                new Producto(
                        "Conjunto de Dormitorio Moderno",
                        "Completa tu dormitorio con este elegante conjunto. Incluye: una cama con cabecero tapizado, ropa de cama blanca, cortinas gris oscuro, una lámpara colgante y una mesita de noche de madera.",
                        8000.00,
                        "img/productos/producto5.jpg"
                ),
                new Producto(
                        "Conjunto de Dormitorio Minimalista",
                        "Añade elegancia y funcionalidad a tu dormitorio con este conjunto. Incluye: cama con cabecero de madera, dos mesas de noche flotantes, varias decoraciones, y un elegante conjunto de ropa de cama gris.",
                        7500.00,
                        "img/productos/producto6.jpg"
                )
        );

        model.addAttribute("title", "Nuestros Productos");
        model.addAttribute("productos", productos);

        return "index";
    }


    @GetMapping("/nosotros")
    public String mostrarNosotros(Model model) {
        List<SeccionNosotros> secciones = Arrays.asList(
                new SeccionNosotros(
                        "historia",
                        "Nuestra Historia",
                        "Bienvenidos a Tienda de Muebles, un lugar donde el diseño y la calidad se encuentran para transformar tu hogar. Nuestra historia comenzó hace más de 20 años cuando un apasionado artesano decidió compartir su amor por la creación de muebles únicos y elegantes con el mundo. Desde nuestros humildes comienzos en un pequeño taller, hemos crecido para convertirnos en una marca reconocida por la excelencia en el diseño y la artesanía.",
                        "img/nosotros/nosotros1.jpg",
                        true
                ),
                new SeccionNosotros(
                        "mision",
                        "Misión, Visión y Valores",
                        "Nuestra misión es proporcionar a nuestros clientes muebles y decoraciones que no solo embellezcan sus hogares, sino que también reflejen su personalidad y estilo de vida. Creemos que cada hogar cuenta una historia, y nuestros muebles son los protagonistas que aportan calidez y carácter a cada espacio. Nos enorgullecemos de ofrecer una amplia gama de productos que combinan estilo, comodidad y funcionalidad.",
                        "img/nosotros/nosotros2.png",
                        false
                ),
                new SeccionNosotros(
                        "carrera",
                        "Carreras",
                        "En Tienda de Muebles, valoramos el talento y la dedicación. Estamos constantemente buscando personas apasionadas y creativas que deseen unirse a nuestro equipo. Ofrecemos oportunidades de crecimiento y desarrollo profesional en un entorno dinámico y colaborativo. Si estás interesado en formar parte de nuestra familia, consulta nuestras vacantes disponibles y aplica hoy mismo.",
                        "img/nosotros/nosotros3.png",
                        true
                ),
                new SeccionNosotros(
                        "politica",
                        "Política de Privacidad",
                        "En Tienda de Muebles, nos comprometemos a proteger la privacidad de nuestros clientes. Respetamos y valoramos la confianza que depositan en nosotros, y nos aseguramos de manejar sus datos personales de manera segura y responsable. Para más detalles sobre cómo recopilamos, usamos y protegemos su información, consulte nuestra Política de Privacidad.",
                        "img/nosotros/nosotros4.png",
                        false
                ),
                new SeccionNosotros(
                        "servicio",
                        "Términos del Servicio",
                        "Al utilizar nuestros servicios, los clientes aceptan cumplir con nuestros términos y condiciones. Estos términos establecen las reglas y directrices para el uso de nuestro sitio web y la compra de nuestros productos. Nos esforzamos por proporcionar una experiencia de compra justa y transparente. Para obtener más información, lea nuestros Términos del Servicio completos.",
                        "img/nosotros/nosotros5.png",
                        true
                )
        );

        model.addAttribute("tituloPagina", "Sobre Nosotros");
        model.addAttribute("secciones", secciones);

        return "nosotros";
    }


    @GetMapping("/tienda")
    public String mostrarProductosTienda(Model model) {
        List<Producto> productos = Arrays.asList(
                // Primer producto
                new Producto(
                        "Mueble elegante y funcional",
                        "Nuestro mueble de alta calidad ofrece dos compartimentos para exhibir y organizar tus objetos. Incluye un jarrón decorativo.",
                        4000.00,
                        "img/productos/producto1.jpg"
                ),
                // Productos para la primera fila (2 columnas)
                new Producto(
                        "Decoración de Hogar",
                        "Renueva tu hogar con este elegante conjunto. Incluye: sofá en forma de L con cojines estampados, mesa de centro con jarrón y tetera, cómoda blanca, reloj de péndulo, lámpara de pie, y plantas decorativas.",
                        5500.00,
                        "img/productos/producto2.jpg"
                ),
                new Producto(
                        "Sofá elegante y cómodo",
                        "Disfruta del máximo confort con este elegante sofá gris con acolchado. Incluye dos cojines color teal y un cojín decorativo en el centro. Ideal para cualquier sala, este sofá combina estilo y funcionalidad.",
                        3500.00,
                        "img/productos/producto3.jpg"
                ),
                // Productos para la segunda fila (3 columnas)
                new Producto(
                        "Conjunto de Mesa y Sillas Elegante",
                        "Añade un toque moderno a tu espacio con este conjunto. Incluye una mesa redonda blanca con pedestal central y dos sillas con patas de madera y asientos negros. Perfecto para cualquier rincón acogedor.",
                        1200.00,
                        "img/productos/producto4.jpg"
                ),
                new Producto(
                        "Conjunto de Dormitorio Moderno",
                        "Completa tu dormitorio con este elegante conjunto. Incluye: una cama con cabecero tapizado, ropa de cama blanca, cortinas gris oscuro, una lámpara colgante y una mesita de noche de madera.",
                        8000.00,
                        "img/productos/producto5.jpg"
                ),
                new Producto(
                        "Conjunto de Dormitorio Minimalista",
                        "Añade elegancia y funcionalidad a tu dormitorio con este conjunto. Incluye: cama con cabecero de madera, dos mesas de noche flotantes, varias decoraciones, y un elegante conjunto de ropa de cama gris.",
                        7500.00,
                        "img/productos/producto6.jpg"
                )
        );

        model.addAttribute("title", "Nuestros Productos");
        model.addAttribute("productos", productos);

        return "tienda";
    }

    @GetMapping("/blog")
    public String mostrarBlog(Model model) {
        List<ArticuloBlog> articulos = Arrays.asList(
                new ArticuloBlog(
                        "guia-colores",
                        "Guía de Colores",
                        "img/blog/guia_colores.jpg",
                        "29 de enero de 2025",
                        "TiendaMuebles",
                        "El impacto del color en el diseño de interiores",
                        "El color es una herramienta poderosa en la decoración del hogar. No solo influye en la estética, sino también en el estado de ánimo y la percepción del espacio. Elegir la paleta adecuada puede hacer que una habitación parezca más grande, más acogedora o más sofisticada.",
                        "blog/guias_colores.html"
                ),
                new ArticuloBlog(
                        "nuevos-modelos",
                        "Nuevos Modelos",
                        "img/blog/nuevos_modelos.jpg",
                        "29 de enero de 2025",
                        "TiendaMuebles",
                        "Innovación y diseño en muebles modernos",
                        "Cada temporada trae nuevas propuestas en muebles que combinan funcionalidad y diseño. La evolución en la decoración del hogar nos permite encontrar piezas que optimizan el espacio, se adaptan a diferentes necesidades y mejoran el confort.",
                        "blog/nuevos_modelos.html"
                ),
                new ArticuloBlog(
                        "diseños-interiores",
                        "Guía para diseños de interiores",
                        "img/blog/diseño_interiores.jpg",
                        "29 de enero de 2025",
                        "TiendaMuebles",
                        "Principios básicos del diseño de interiores",
                        "El diseño de interiores no se trata solo de estética; también busca crear espacios funcionales y armónicos. Para lograrlo, es esencial considerar la distribución del mobiliario, la iluminación, la paleta de colores y los accesorios decorativos.",
                        "blog/diseños_interiores.html"
                ),
                new ArticuloBlog(
                        "diseños-exteriores",
                        "Guía para diseños de exteriores",
                        "img/blog/diseño_exteriores.jpg",
                        "29 de enero de 2025",
                        "TiendaMuebles",
                        "Cómo transformar tu jardín, terraza o balcón",
                        "El área exterior del hogar es un lugar perfecto para relajarse y disfrutar del aire libre. Ya sea un gran jardín o un pequeño balcón, con una buena distribución y muebles adecuados, puedes crear un espacio acogedor y funcional.",
                        "blog/diseños_exteriores.html"
                )
        );

        model.addAttribute("tituloPagina", "Blog");
        model.addAttribute("articulos", articulos);

        return "blog";
    }


    @GetMapping("/galeria")
    public String mostrarGaleria(Model model) {
        List<CategoriaGaleria> categorias = Arrays.asList(
                new CategoriaGaleria(
                        "cocina",
                        "Cocina",
                        Arrays.asList(
                                new ImagenGaleria("cocina_01", "img/galeria/cocina_01.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_02", "img/galeria/cocina_02.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_03", "img/galeria/cocina_03.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_04", "img/galeria/cocina_04.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_05", "img/galeria/cocina_05.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_06", "img/galeria/cocina_06.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_07", "img/galeria/cocina_07.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_08", "img/galeria/cocina_08.jpg", "imagen cocina"),
                                new ImagenGaleria("cocina_09", "img/galeria/cocina_09.jpg", "imagen cocina")
                        )
                ),
                new CategoriaGaleria(
                        "oficina",
                        "Oficina",
                        Arrays.asList(
                                new ImagenGaleria("oficina_01", "img/galeria/oficina_01.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_02", "img/galeria/oficina_02.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_03", "img/galeria/oficina_03.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_04", "img/galeria/oficina_04.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_05", "img/galeria/oficina_05.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_06", "img/galeria/oficina_06.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_07", "img/galeria/oficina_07.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_08", "img/galeria/oficina_08.jpg", "imagen oficina"),
                                new ImagenGaleria("oficina_09", "img/galeria/oficina_09.jpg", "imagen oficina")
                        )
                ),
                new CategoriaGaleria(
                        "jardin",
                        "Jardín",
                        Arrays.asList(
                                new ImagenGaleria("jardin_01", "img/galeria/jardin_01.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_02", "img/galeria/jardin_02.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_03", "img/galeria/jardin_03.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_04", "img/galeria/jardin_04.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_05", "img/galeria/jardin_05.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_06", "img/galeria/jardin_06.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_07", "img/galeria/jardin_07.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_08", "img/galeria/jardin_08.jpg", "imagen jardín"),
                                new ImagenGaleria("jardin_09", "img/galeria/jardin_09.jpg", "imagen jardín")
                        )
                ),
                new CategoriaGaleria(
                        "sala",
                        "Sala",
                        Arrays.asList(
                                new ImagenGaleria("sala_01", "img/galeria/sala_01.jpg", "imagen sala"),
                                new ImagenGaleria("sala_02", "img/galeria/sala_02.jpg", "imagen sala"),
                                new ImagenGaleria("sala_03", "img/galeria/sala_03.jpg", "imagen sala"),
                                new ImagenGaleria("sala_04", "img/galeria/sala_04.jpg", "imagen sala"),
                                new ImagenGaleria("sala_05", "img/galeria/sala_05.jpg", "imagen sala"),
                                new ImagenGaleria("sala_06", "img/galeria/sala_06.jpg", "imagen sala"),
                                new ImagenGaleria("sala_07", "img/galeria/sala_07.jpg", "imagen sala"),
                                new ImagenGaleria("sala_08", "img/galeria/sala_08.jpg", "imagen sala"),
                                new ImagenGaleria("sala_09", "img/galeria/sala_09.jpg", "imagen sala")
                        )
                ),
                new CategoriaGaleria(
                        "dormitorio",
                        "Dormitorios",
                        Arrays.asList(
                                new ImagenGaleria("dormitorio_01", "img/galeria/dormitorio_01.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_02", "img/galeria/dormitorio_02.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_03", "img/galeria/dormitorio_03.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_04", "img/galeria/dormitorio_04.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_05", "img/galeria/dormitorio_05.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_06", "img/galeria/dormitorio_06.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_07", "img/galeria/dormitorio_07.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_08", "img/galeria/dormitorio_08.jpg", "imagen dormitorios"),
                                new ImagenGaleria("dormitorio_09", "img/galeria/dormitorio_09.jpg", "imagen dormitorios")
                        )
                )
        );

        model.addAttribute("tituloPagina", "Galería");
        model.addAttribute("categorias", categorias);

        return "galeria";
    }


    @GetMapping("/contacto")
    public String mostrarFormularioContacto(Model model) {
        // Lista de países para el dropdown
        List<Pais> paises = Arrays.asList(
                new Pais("", "--Seleccione--"),
                new Pais("AR", "Argentina"),
                new Pais("BO", "Bolivia"),
                new Pais("BR", "Brasil"),
                new Pais("CL", "Chile"),
                new Pais("CO", "Colombia"),
                new Pais("EC", "Ecuador"),
                new Pais("MX", "México"),
                new Pais("PE", "Perú"),
                new Pais("UY", "Uruguay"),
                new Pais("VE", "Venezuela")
        );

        model.addAttribute("tituloPagina", "Contacto");
        model.addAttribute("contacto", new Contacto());
        model.addAttribute("paises", paises);

        return "contacto";
    }

    @PostMapping("/contacto")
    public String procesarFormularioContacto(@ModelAttribute Contacto contacto) {
        // Aquí puedes procesar los datos del formulario (guardar en BD, enviar email, etc.)
        System.out.println("Datos del formulario:");
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Email: " + contacto.getEmail());
        System.out.println("Mensaje: " + contacto.getMensaje());
        // ... otros campos

        // Redirige a una página de confirmación
        return "contacto";
    }
}