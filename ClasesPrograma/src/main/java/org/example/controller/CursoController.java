package org.example.controller;

import com.google.gson.Gson;
import org.example.dao.CursoDAO;
import org.example.factory.CursoConcretoFactory;
import org.example.factory.CursoFactory;
import org.example.model.Curso;

public class CursoController {

    //Solo CURSO
    private CursoDAO cursoDAO;
    private CursoFactory fabricaDeCurso = new CursoConcretoFactory();
    private Gson gson = new Gson();

    public CursoController() {
        cursoDAO = new CursoDAO();
        this.gson = new Gson();
    }


    //Llamaos a la funcion del controller
    public void insertarDatos(int id, String nombre, String estado){
        //cursoDAO.insertarDatos(curso);
        Curso curso = fabricaDeCurso.createCurso(id, nombre, estado);
        cursoDAO.insertarDatos(curso);
    }
    public String obtenerDatosCurso() {
        return cursoDAO.obtenerDatosCurso();
    }
    /*
    public void insertarDatos(Curso curso){
        cursoDAO.insertarDatos(curso);
    }*/




}
