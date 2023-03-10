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


public interface IPeliculasService {
    public List<Peliculas> getAllMovie();
    public Peliculas getMovieById (long id);
    public void saveMovie (Peliculas peliculas);
    public void delete (long id);
}
