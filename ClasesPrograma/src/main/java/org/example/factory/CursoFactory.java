package org.example.factory;

import org.example.model.Curso;
//Se fabrica el objeto Curso (CRUD)
public abstract class CursoFactory {
//La abstracion
    public abstract Curso createCurso(int id, String nombre, String estado);
    //La analogia     public void insertarDatos(Curso curso){
    //        cursoDAO.insertarDatos(curso);
    //    }


    //    Factory Method: Define una interfaz para crear un objeto,
    //    pero permite que las subclases
//    alteren el tipo de objetos que se crearán.



}


