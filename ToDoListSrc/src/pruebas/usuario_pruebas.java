package pruebas;

import java.util.ArrayList;
import todolist.modelos.Tarea;
import todolist.modelos.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tecnologer
 */
public class usuario_pruebas {

    public static void nuevoUsuarioTest() {
        Usuario usuario = new Usuario("oscar");
        //todo: guardar en db        
    }
    
    public static void nuevoUsuarioConTareasTest() {
        Usuario usuario = new Usuario("oscar");
        Tarea tarea1 = new Tarea("tarea 1");
        Tarea tarea2 = new Tarea("tarea 2");        
        usuario.addTarea(tarea1, tarea2);
        //todo: guardar en db
        ArrayList<Tarea> tareas = usuario.getTareas();
        if(tareas.size() != 2){
            System.out.println("el usuario solo deberia de tener dos tareas");
            return;
        }
        
        if(usuario.getTareaPorDesc("tarea 1") == null) {
            System.out.println("la tarea 1 no esta asignada al usuario");
            return;
        }
        
        if(usuario.getTareaPorDesc("tarea 2") == null) {
            System.out.println("la tarea 2 no esta asignada al usuario");
            return;
        }
        
        System.out.println("tests: PASS");
    }
}
