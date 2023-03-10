/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author maripazfonseca
 */

import entity.Peliculas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PeliculasRepository;


@Service
public class PeliculasService extends IPeliculasService {
    @Autowired
    private PeliculasRepository peliculasRepository;

    public List<Peliculas> getAllMovie() {
        return (List<Peliculas>)peliculasRepository.findAll();
    }

    @Override
    public Peliculas getMovieById(long id) {
        return peliculasRepository.findById(id).orElse(null);
    }

    public void saveMovie(Peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }

    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }

   
    
}