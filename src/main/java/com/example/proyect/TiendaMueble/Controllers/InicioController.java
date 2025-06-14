package com.example.proyect.TiendaMueble.Controllers;


import com.example.proyect.TiendaMueble.models.*;
import com.example.proyect.TiendaMueble.repositories.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;
//@Controller define una clase que recibe peticiones web, las procesa y devuelve una vista (HTML, JSP, etc.).
//@GetMapping indica que un método debe responder a una petición GET en una URL específica.
//@ModelAttribute vincula datos del formulario a un objeto o agrega datos al modelo que se enviarán a la vista.
//@PostMapping indica que un método debe responder a una solicitud POST, comúnmente usada para enviar formularios o crear datos.

@Controller
public class InicioController {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private SeccionNosotrosRepository seccionNosotrosRepository;
    @Autowired
    private ArticuloBlogRepository articuloBlogRepository;
    @Autowired
    private CategoriaGaleriaRepository categoriaGaleriaRepository;
    @Autowired
    private ContactoRepository contactoRepository;


    @PostConstruct
    public void crearProducto() {
        if (productoRepository.count() == 0) {
            //productoRepository.saveAll(productos);
            System.out.println("Productos iniciales guardados en la base de datos");
        }
    }

    @GetMapping("/inicio")
    public String mostrarProductos(Model model) {
        model.addAttribute("title", "Nuestros Productos");
        model.addAttribute("productos", productoRepository.findAll());
        return "index";
    }

    @GetMapping("/nosotros")
    public String mostrarNosotros(Model model) {
        model.addAttribute("tituloPagina", "Sobre Nosotros");
        model.addAttribute("secciones", seccionNosotrosRepository.findAll());
        return "nosotros";
    }

    @GetMapping("/tienda")
    public String mostrarProductosTienda(Model model) {
        model.addAttribute("title", "Nuestros Productos");
        model.addAttribute("productos", productoRepository.findAll());
        return "tienda";
    }

    @GetMapping("/blog")
    public String mostrarBlog(Model model) {
        model.addAttribute("tituloPagina", "Blog");
        model.addAttribute("articulos", articuloBlogRepository.findAll());
        return "blog";
    }

    @GetMapping("/galeria")
    public String mostrarGaleria(Model model) {
        model.addAttribute("tituloPagina", "Galería");
        model.addAttribute("categorias", categoriaGaleriaRepository.findAll());
        return "galeria";
    }

    @GetMapping("/contacto")
    public String mostrarFormularioContacto(Model model) {
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
    public String procesarFormularioContacto(@ModelAttribute Contacto contacto, RedirectAttributes redirectAttrs) {
        contactoRepository.save(contacto);
        redirectAttrs.addFlashAttribute("mensajeExito", "✅ Formulario enviado correctamente. ¡Gracias!");
        return "redirect:/contacto";
    }

}