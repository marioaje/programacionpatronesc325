package org.example.model;

public class Curso {


    //?????
    private int id;
    private String nombre;
    private String estado;

    public Curso(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    //No funciones crud
    //
//    CREATE TABLE `u484426513_popc325`.`prof_curso` (
//            `id` INT NOT NULL AUTO_INCREMENT,
//  `nombre` VARCHAR(45) NOT NULL,
//  `estado` VARCHAR(15) NOT NULL,
//    PRIMARY KEY (`id`));

}
