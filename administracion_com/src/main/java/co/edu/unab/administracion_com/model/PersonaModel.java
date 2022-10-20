package co.edu.unab.administracion_com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@Table(name = "persona")

public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para que sea un campo AutoIncrementado
    private int idPersona;
    private String nombre;
    private String apellido;
    private long telefono;
    private String correo;   
}
