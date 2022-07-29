/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniel Felipe
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    Persona findByNombre(String nombre);
    
   
}
