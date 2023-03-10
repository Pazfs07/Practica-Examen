/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author maripazfonseca
 */
import entity.Nombre;
import entity.Peliculas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.INombreService;
import service.IPeliculasService;

@Controller
public class ExamenController {

    @Autowired
    private IPeliculasService PeliculasService;

    @Autowired
    private INombreService NombreService;

    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Peliculas> listaPeliculas = PeliculasService.getAllMovies();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
    }

    @GetMapping("/conciertoN")
    public String crearConcierto(Model model) {
        List<Nombre> listaNombre = artistaNombre",new Peliculas());
        model.addAttribute("nombre", listaNombre);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPeliculas(@ModelAttribute Peliculas peliculas){
        PeliculasService.saveConcert(peliculas);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/editConcierto/{id}")
    public String editarPeliculas(@PathVariable("id") Long idPeliculas, Model model){
        Peliculas concierto = PeliculasService.getMovieById(idPeliculas);
        List<Nombre> listaNombre = NombreService.listName();
        model.addAttribute("peliculas", Peliculas);
        model.addAttribute("Nombre", listaNombre);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPeliculas(@PathVariable("id") Long idPeliculas)){
        PeliculasService.delete(idPeliculas);
        return "redirect:/peliculas";
    }
    
    
    

}
