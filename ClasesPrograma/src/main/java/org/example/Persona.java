package org.example;

public class Persona {

    private  String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;//Composicion Mi direccion normal donde vivo, ajustes, casa

    //Seimpre la llave de incio o el constructor
    public  Persona (String nombre, String apellido, int edad,  Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;//Se incluye la edad como atributo segun Task 1
        this.direccion = direccion;
    }
    //Set get
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
