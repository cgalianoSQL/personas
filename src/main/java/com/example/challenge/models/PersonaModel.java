package com.example.challenge.models;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class PersonaModel {

    @Id
    @Column(unique = true, nullable = false)
    private Long dni;

    private String nombre;
    private String apellido;
    private boolean empleado;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public boolean getEmpleado() {
        return empleado;
    }

    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }
}