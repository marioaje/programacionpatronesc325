package org.example.controller;

import org.example.dao.CursoDAO;
import org.example.model.Curso;

public class CursoController {

    //Solo CURSO
    private CursoDAO cursoDAO;

    public CursoController() {
        cursoDAO = new CursoDAO();
    }

    public void insertarDatos(Curso curso){
        cursoDAO.insertarDatos(curso);
    }

}
