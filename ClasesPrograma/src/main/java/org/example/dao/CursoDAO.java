package org.example.dao;

import org.example.configuracion.Conexion;
import org.example.model.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDAO {


    private Connection conexion;

    public CursoDAO() {
        conexion= Conexion.getConnection();
    }

    //Insertar
    public void insertarDatos(Curso curso){

        String sqlQuery = "INSERT INTO prof_curso(nombre, estado) VALUES (?,?) ";

        try( PreparedStatement ps = conexion.prepareStatement(sqlQuery)  ){
            ps.setString(1, curso.getNombre());
            ps.setString(2, curso.getEstado());

            ps.executeUpdate();

            System.out.println("Accion exitosa!!!");
        } catch (SQLException e) {
            System.err.println("Error al insertar el registro" + e.getMessage());
        }

        //
//    CREATE TABLE `u484426513_popc325`.`prof_curso` (
//            `id` INT NOT NULL AUTO_INCREMENT,
//  `nombre` VARCHAR(45) NOT NULL,
//  `estado` VARCHAR(15) NOT NULL,
//    PRIMARY KEY (`id`));

    }
}
