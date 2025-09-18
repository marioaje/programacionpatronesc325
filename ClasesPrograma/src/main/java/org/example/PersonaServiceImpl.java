package org.example;


//Define la logica del servicio y metodos
public class PersonaServiceImpl implements PersonaService {

    private Persona persona;

    public void registrar( String nombre, String apellido, int edad,  Direccion direccion) throws Exception {

        persona = new Persona(nombre,apellido,edad,direccion);
    }


    public void muestraPersona(Persona persona) {

        System.out.println("Nombre: " + persona.getNombre());

    }


}
