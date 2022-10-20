package co.edu.unab.administracion_com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.administracion_com.model.PersonaModel;


@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel,Integer> {
    
}
