package org.example;


//Define el contrato del servicio y metodos
public interface PersonaService {
    void registrar( String nombre, String apellido, int edad,  Direccion direccion) throws Exception;
    void muestraPersona(Persona persona);
}
