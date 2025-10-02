package org.example.factory;

import org.example.model.Curso;
//Esta es la construccion y compilacion final
public class CursoConcretoFactory extends CursoFactory {

    //sirve como un compilador en tiempo real
    @Override
    public Curso createCurso(int id, String nombre, String estado){
        return new Curso( id,  nombre,  estado);
    }
////    alteren el tipo de objetos que se crearán.
}
