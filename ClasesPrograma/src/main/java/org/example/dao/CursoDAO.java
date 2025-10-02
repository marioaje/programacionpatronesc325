package org.example.dao;

import com.google.gson.Gson;
import org.example.configuracion.Conexion;
import org.example.model.Curso;

import java.sql.*;
import java.util.*;

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



           // System.out.println("{ 'id': 0,  'nombre':'Mario',  'estado':'Activo'} ");
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


    //Adapter: Permite que clases con interfaces incompatibles trabajen juntas mediante
    //la conversión de la interfaz de una clase en otra esperada por el cliente.
    //public List<Curso> listarDatos(){}

    public String obtenerDatosCurso(){

        String sqlQuery = "SELECT * FROM prof_cursos k";

        List<Curso> listaCursos = new ArrayList<>();
        Map< String, Object > respuestaCursos = new LinkedHashMap<>();

                try(
                        Statement stmt = conexion.createStatement();
                        ResultSet rsConsultado = stmt.executeQuery(sqlQuery)
                    ) {
                    //rs.next la siguiente fila
                        while (rsConsultado.next()){
                            Curso curso = new Curso(
                                    rsConsultado.getInt("id"),
                                    rsConsultado.getString("nombre"),
                                    rsConsultado.getString("estado")
                            );

                            listaCursos.add(curso);
                        }

                    if (listaCursos.isEmpty()) {
                        respuestaCursos.put("code",404);
                        respuestaCursos.put("message","No hay Lista de cursos");

                    }
                    else{
                        respuestaCursos.put("code",200);
                        respuestaCursos.put("message","Lista de cursos");
                        respuestaCursos.put("data",listaCursos);
                    }

                    //{"code":200,"message":"Cursos Lista","data":[{"id":"5034","nombre":"Ingenieria del



                    }catch (SQLException e) {

                    respuestaCursos.put("code",500);
                    respuestaCursos.put("message","Error en la consulta: " + e.getMessage());
                    respuestaCursos.put("data",new ArrayList<>());
                }

                Gson gson = new Gson();
                return gson.toJson(respuestaCursos);

    }

}
