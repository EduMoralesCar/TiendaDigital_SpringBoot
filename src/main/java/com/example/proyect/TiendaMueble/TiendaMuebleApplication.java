package com.example.proyect.TiendaMueble;

import com.example.proyect.TiendaMueble.models.*;
import com.example.proyect.TiendaMueble.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TiendaMuebleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TiendaMuebleApplication.class, args);
	}

	// conectan los repositorios (JPA) automáticamente.
	@Autowired
	private ProductoRepository productoRepository;
	@Autowired
	private SeccionNosotrosRepository seccionNosotrosRepository;
	@Autowired
	private ArticuloBlogRepository articuloBlogRepository;
	@Autowired
	private CategoriaGaleriaRepository categoriaGaleriaRepository;

	@Override
	public void run(String... args) throws Exception {

		cargarProductos();
		cargarNosotros();
		cargarBlog();
		cargarGaleria();
	}

	private void cargarProductos() {
		List<Producto> productos = List.of(
				new Producto(
						"Mueble elegante y funcional",
						"Nuestro mueble de alta calidad ofrece dos compartimentos para exhibir y organizar tus objetos. Incluye un jarrón decorativo.",
						4000.00,
						"img/productos/producto1.jpg"),
				new Producto(
						"Decoración de Hogar",
						"Renueva tu hogar con este elegante conjunto. Incluye: sofá en forma de L con cojines estampados, mesa de centro con jarrón y tetera, cómoda blanca, reloj de péndulo, lámpara de pie, y plantas decorativas.",
						5500.00,
						"img/productos/producto2.jpg"),
				new Producto(
						"Sofá elegante y cómodo",
						"Disfruta del máximo confort con este elegante sofá gris con acolchado. Incluye dos cojines color teal y un cojín decorativo en el centro. Ideal para cualquier sala, este sofá combina estilo y funcionalidad.",
						3500.00,
						"img/productos/producto3.jpg"),
				new Producto(
						"Conjunto de Mesa y Sillas Elegante",
						"Añade un toque moderno a tu espacio con este conjunto. Incluye una mesa redonda blanca con pedestal central y dos sillas con patas de madera y asientos negros. Perfecto para cualquier rincón acogedor.",
						1200.00,
						"img/productos/producto4.jpg"),
				new Producto(
						"Conjunto de Dormitorio Moderno",
						"Completa tu dormitorio con este elegante conjunto. Incluye: una cama con cabecero tapizado, ropa de cama blanca, cortinas gris oscuro, una lámpara colgante y una mesita de noche de madera.",
						8000.00,
						"img/productos/producto5.jpg"),
				new Producto(
						"Conjunto de Dormitorio Minimalista",
						"Añade elegancia y funcionalidad a tu dormitorio con este conjunto. Incluye: cama con cabecero de madera, dos mesas de noche flotantes, varias decoraciones, y un elegante conjunto de ropa de cama gris.",
						7500.00,
						"img/productos/producto6.jpg"));

		productoRepository.saveAll(productos);
		System.out.println("Productos iniciales guardados en la base de datos");
	}

	private void cargarNosotros() {
		List<SeccionNosotros> secciones = List.of(
				new SeccionNosotros(
						"historia",
						"Nuestra Historia",
						"Bienvenidos a Tienda de Muebles, un lugar donde el diseño y la calidad se encuentran para transformar tu hogar. Nuestra historia comenzó hace más de 20 años cuando un apasionado artesano decidió compartir su amor por la creación de muebles únicos y elegantes con el mundo. Desde nuestros humildes comienzos en un pequeño taller, hemos crecido para convertirnos en una marca reconocida por la excelencia en el diseño y la artesanía.",
						"img/nosotros/nosotros1.jpg",
						false),
				new SeccionNosotros(
						"mision",
						"Misión, Visión y Valores",
						"Nuestra misión es proporcionar a nuestros clientes muebles y decoraciones que no solo embellezcan sus hogares, sino que también reflejen su personalidad y estilo de vida. Creemos que cada hogar cuenta una historia, y nuestros muebles son los protagonistas que aportan calidez y carácter a cada espacio. Nos enorgullecemos de ofrecer una amplia gama de productos que combinan estilo, comodidad y funcionalidad.",
						"img/nosotros/nosotros2.png",
						true),
				new SeccionNosotros(
						"carrera",
						"Carreras",
						"En Tienda de Muebles, valoramos el talento y la dedicación. Estamos constantemente buscando personas apasionadas y creativas que deseen unirse a nuestro equipo. Ofrecemos oportunidades de crecimiento y desarrollo profesional en un entorno dinámico y colaborativo. Si estás interesado en formar parte de nuestra familia, consulta nuestras vacantes disponibles y aplica hoy mismo.",
						"img/nosotros/nosotros3.png",
						true),
				new SeccionNosotros(
						"politica",
						"Política de Privacidad",
						"En Tienda de Muebles, nos comprometemos a proteger la privacidad de nuestros clientes. Respetamos y valoramos la confianza que depositan en nosotros, y nos aseguramos de manejar sus datos personales de manera segura y responsable. Para más detalles sobre cómo recopilamos, usamos y protegemos su información, consulte nuestra Política de Privacidad.",
						"img/nosotros/nosotros4.png",
						false),
				new SeccionNosotros(
						"servicio",
						"Términos del Servicio",
						"Al utilizar nuestros servicios, los clientes aceptan cumplir con nuestros términos y condiciones. Estos términos establecen las reglas y directrices para el uso de nuestro sitio web y la compra de nuestros productos. Nos esforzamos por proporcionar una experiencia de compra justa y transparente. Para obtener más información, lea nuestros Términos del Servicio completos.",
						"img/nosotros/nosotros5.png",
						true));

		seccionNosotrosRepository.saveAll(secciones);
		System.out.println("Secciones 'Nosotros' iniciales guardadas en la base de datos");
	}

	private void cargarBlog() {
		List<ArticuloBlog> articulos = List.of(
				new ArticuloBlog(
						"guia-colores",
						"Guía de Colores",
						"img/blog/guia_colores.jpg",
						"29 de enero de 2025",
						"TiendaMuebles",
						"El impacto del color en el diseño de interiores",
						"El color es una herramienta poderosa en la decoración del hogar. No solo influye en la estética, sino también en el estado de ánimo y la percepción del espacio. Elegir la paleta adecuada puede hacer que una habitación parezca más grande, más acogedora o más sofisticada.",
						"blog/guias_colores.html"),
				new ArticuloBlog(
						"nuevos-modelos",
						"Nuevos Modelos",
						"img/blog/nuevos_modelos.jpg",
						"29 de enero de 2025",
						"TiendaMuebles",
						"Innovación y diseño en muebles modernos",
						"Cada temporada trae nuevas propuestas en muebles que combinan funcionalidad y diseño. La evolución en la decoración del hogar nos permite encontrar piezas que optimizan el espacio, se adaptan a diferentes necesidades y mejoran el confort.",
						"blog/nuevos_modelos.html"),
				new ArticuloBlog(
						"diseños-interiores",
						"Guía para diseños de interiores",
						"img/blog/diseño_interiores.jpg",
						"29 de enero de 2025",
						"TiendaMuebles",
						"Principios básicos del diseño de interiores",
						"El diseño de interiores no se trata solo de estética; también busca crear espacios funcionales y armónicos. Para lograrlo, es esencial considerar la distribución del mobiliario, la iluminación, la paleta de colores y los accesorios decorativos.",
						"blog/diseños_interiores.html"),
				new ArticuloBlog(
						"diseños-exteriores",
						"Guía para diseños de exteriores",
						"img/blog/diseño_exteriores.jpg",
						"29 de enero de 2025",
						"TiendaMuebles",
						"Cómo transformar tu jardín, terraza o balcón",
						"El área exterior del hogar es un lugar perfecto para relajarse y disfrutar del aire libre. Ya sea un gran jardín o un pequeño balcón, con una buena distribución y muebles adecuados, puedes crear un espacio acogedor y funcional.",
						"blog/diseños_exteriores.html"));

		articuloBlogRepository.saveAll(articulos);
		System.out.println("Artículos del blog iniciales guardados en la base de datos");
	}

	private void cargarGaleria() {

		CategoriaGaleria cocina = new CategoriaGaleria("cocina", "Cocina");
		CategoriaGaleria oficina = new CategoriaGaleria("oficina", "Oficina");
		CategoriaGaleria jardin = new CategoriaGaleria("jardin", "Jardín");
		CategoriaGaleria sala = new CategoriaGaleria("sala", "Sala");
		CategoriaGaleria dormitorio = new CategoriaGaleria("dormitorio", "Dormitorios");

		// Guardar categorías primero
		categoriaGaleriaRepository.saveAll(Arrays.asList(cocina, oficina, jardin, sala, dormitorio));

		// Crear y guardar imágenes para cada categoría
		List<ImagenGaleria> imagenesCocina = Arrays.asList(
				new ImagenGaleria("cocina_01", "img/galeria/cocina_01.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_02", "img/galeria/cocina_02.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_03", "img/galeria/cocina_03.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_04", "img/galeria/cocina_04.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_05", "img/galeria/cocina_05.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_06", "img/galeria/cocina_06.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_07", "img/galeria/cocina_07.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_08", "img/galeria/cocina_08.jpg", "imagen cocina", cocina),
				new ImagenGaleria("cocina_09", "img/galeria/cocina_09.jpg", "imagen cocina", cocina));

		cocina.setImagenes(imagenesCocina);
		categoriaGaleriaRepository.save(cocina);

		List<ImagenGaleria> imagenesOficina = Arrays.asList(
				new ImagenGaleria("oficina_01", "img/galeria/oficina_01.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_02", "img/galeria/oficina_02.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_03", "img/galeria/oficina_03.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_04", "img/galeria/oficina_04.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_05", "img/galeria/oficina_05.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_06", "img/galeria/oficina_06.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_07", "img/galeria/oficina_07.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_08", "img/galeria/oficina_08.jpg", "imagen oficina", oficina),
				new ImagenGaleria("oficina_09", "img/galeria/oficina_09.jpg", "imagen oficina", oficina));

		oficina.setImagenes(imagenesOficina);
		categoriaGaleriaRepository.save(oficina);

		List<ImagenGaleria> imagenesJardin = Arrays.asList(
				new ImagenGaleria("jardin_01", "img/galeria/jardin_01.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_02", "img/galeria/jardin_02.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_03", "img/galeria/jardin_03.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_04", "img/galeria/jardin_04.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_05", "img/galeria/jardin_05.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_06", "img/galeria/jardin_06.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_07", "img/galeria/jardin_07.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_08", "img/galeria/jardin_08.jpg", "imagen jardín", jardin),
				new ImagenGaleria("jardin_09", "img/galeria/jardin_09.jpg", "imagen jardín", jardin));

		jardin.setImagenes(imagenesJardin);
		categoriaGaleriaRepository.save(jardin);

		List<ImagenGaleria> imagenesSalas = Arrays.asList(
				new ImagenGaleria("sala_01", "img/galeria/sala_01.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_02", "img/galeria/sala_02.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_03", "img/galeria/sala_03.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_04", "img/galeria/sala_04.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_05", "img/galeria/sala_05.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_06", "img/galeria/sala_06.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_07", "img/galeria/sala_07.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_08", "img/galeria/sala_08.jpg", "imagen sala", sala),
				new ImagenGaleria("sala_09", "img/galeria/sala_09.jpg", "imagen sala", sala));

		sala.setImagenes(imagenesSalas);
		categoriaGaleriaRepository.save(sala);

		List<ImagenGaleria> imagenesDormitorio = Arrays.asList(
				new ImagenGaleria("dormitorio_01", "img/galeria/dormitorio_01.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_02", "img/galeria/dormitorio_02.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_03", "img/galeria/dormitorio_03.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_04", "img/galeria/dormitorio_04.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_05", "img/galeria/dormitorio_05.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_06", "img/galeria/dormitorio_06.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_07", "img/galeria/dormitorio_07.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_08", "img/galeria/dormitorio_08.jpg", "imagen dormitorios", dormitorio),
				new ImagenGaleria("dormitorio_09", "img/galeria/dormitorio_09.jpg", "imagen dormitorios", dormitorio));

		dormitorio.setImagenes(imagenesDormitorio);
		categoriaGaleriaRepository.save(dormitorio);
	}

}
