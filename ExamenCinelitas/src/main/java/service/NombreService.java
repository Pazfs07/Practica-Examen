/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author maripazfonseca
 */
import entity.Nombre;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.NombreRepository;

@Service
public abstract class NombreService implements INombreService {

    @Autowired
    private NombreRepository nombreRepository;

    @Override
    public List<Nombre> listName() {
        return (List<Nombre>) nombreRepository.findAll();
    }

}
