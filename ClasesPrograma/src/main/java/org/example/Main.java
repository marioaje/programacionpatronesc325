package org.example;

import org.example.configuracion.Conexion;
import org.example.controller.CursoController;
import org.example.model.Curso;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Connection conexion = Conexion.getConnection();

        if (conexion!=null){
            System.out.println("Conectado con la base de datos");
        }else {
            System.err.println("Error al conectar con la base de datos");
        }


        CursoController cursoController = new CursoController();
        Curso curso = new Curso(0, "Programacion de Patrones", "Activo");
        cursoController.insertarDatos(curso);


        System.out.println("Curso Fin");
    }
//
//
//    public class Persona{
//        public  String nombre;
//        public String apellido;
//        public int edad;
//
//        public void imprimirDatos(){
//            System.out.println("Nombre: "+nombre);
//            System.out.println("Apellido: "+apellido);
//        }
//
//        public void enviarCorreo(String mensaje){
//            System.out.println(mensaje);
//        }
//
//        public void guardandoBaseDatos(){
//            System.out.println("guardandoBaseDatos ");
//        }
//
//    }

// No se debe hacer
//    public int operaciones ( String operacion, int a, int b){
//
//        if (operacion.equals("+")){
//            return a+b;
//        }else if(operacion.equals("-")){
//            return a-b;
//        }else{
//            return 0;
//        }
//    }



}