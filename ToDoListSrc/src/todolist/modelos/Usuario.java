/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.modelos;

import java.util.ArrayList;

/**
 *
 * @author tecnologer
 */
public class Usuario {
    private String nombre;
    private ArrayList<Tarea> tareas; 

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<Tarea>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return la lista de tareas del usuario
     */
    public ArrayList<Tarea> getTareas() {
        return this.tareas;
    }
    
    /**
     * @param tareas: lista de tareas a agregar a las tareas del usuario, una o mas tareas
     * 
     * Tarea tarea = new Tarea("nueva tarea");
     * Tarea tarea2 = new Tarea("nueva tarea 2");
     * Tarea tarea3 = new Tarea("nueva tarea 3");
     * 
     * usuario.addTarea(tarea, tarea2, tarea3);
     */
    public void addTarea(Tarea ...tareas) {        
        for(Tarea tarea : tareas){
            this.tareas.add(tarea);
        }
    }
    
    public Tarea getTareaPorDesc(String descripcion) {
        for(Tarea tarea : this.tareas){            
            if(tarea.getDescripcion().equals(descripcion)){
                return tarea;
            }
        }
        
        return null;
    }
}
