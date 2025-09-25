package org.example.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
//Single +  factory
//Constantes inmutables
    private static final  String host = "jdbc:mysql://45.88.196.5/u484426513_popc325";
    private static final String user = "u484426513_popc325";
    private static final String password="7:p^55ISqOqO";


    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(host,user,password);
        }catch(SQLException e){
            System.err.println("Error al conectar con la base de datos");
            return null;
        }
    }


//    clave: 7:p^55ISqOqO
//    45.88.196.5
//    db u484426513_popc325
//    user u484426513_popc325


}
