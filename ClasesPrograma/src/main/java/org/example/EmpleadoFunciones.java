package org.example;

public class EmpleadoFunciones extends Empleado {
    private double salario;

    public EmpleadoFunciones(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad);//seria la equivalencia de
        //Seria el constructor de la clase que heredamos
//          public Empleado(String nombre, String apellido, int edad) {
//            this.nombre = nombre;
//            this.apellido = apellido;
//            this.edad = edad;
//        }
        this.salario = salario;
    }

    @Override
   public double calcularSalario()
   {
       return salario;
   }

}
