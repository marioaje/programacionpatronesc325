package org.example;

public class PersonaFunciones {

    public void imprimirDatos(Persona persona){
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Apellido: "+ persona.getApellido());
        System.out.println("Edad: "+ persona.getEdad());
    }

    public void enviarCorreo(String mensaje){
        System.out.println(mensaje);
    }
}
