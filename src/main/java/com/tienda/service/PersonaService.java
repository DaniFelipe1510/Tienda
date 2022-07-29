/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel Felipe
 */
@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona() {
        return(List<Persona>)personaRepository.findAll();
    }

    @Override
    public Persona getPersonaByID(long id) {
       return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public List<Persona> detAllPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona findByNombre(String nombre) {
        return personaRepository.findByNombre(nombre);
    }

    
    
}
