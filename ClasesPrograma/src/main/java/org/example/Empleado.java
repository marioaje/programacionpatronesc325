package org.example;

//Crea la clase abstracta de la base de datos para los empleados
public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int edad;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }



    //Creamos los metods abstracots, calculos, ejecucuiones, operaciones
    public abstract double calcularSalario();


}
