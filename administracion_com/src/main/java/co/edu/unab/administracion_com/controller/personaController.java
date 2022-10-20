package co.edu.unab.administracion_com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.administracion_com.model.PersonaModel;
import co.edu.unab.administracion_com.repository.PersonaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/persona")

public class personaController {

    @Autowired
    PersonaRepository personaRepository;
    
    @GetMapping(path="/all")
    public Iterable<PersonaModel> getAllpersonas(){
       return  personaRepository.findAll();
    }

    @PostMapping(path = "/save")
    public PersonaModel savePersona(@RequestBody PersonaModel persona) {
        return personaRepository.save(persona); //actualiza y crea dependiendo si el Id existe o no
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deletePersonaById(@PathVariable("id") int id){
        personaRepository.deleteById(id);
    }
    
}
