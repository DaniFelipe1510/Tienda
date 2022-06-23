/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author Daniel Felipe
 */
public interface IPersonaService {
    public List<Persona> detAllPersona();
    public Persona getPersonaByID (long id);
    public void savePersona(Persona persona);
    public void delete(long id);

    public List<Persona> getAllPersona();
}
