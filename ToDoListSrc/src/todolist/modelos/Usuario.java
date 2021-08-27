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
    public void addTarea(Tarea ...tareas) throws Exception {
        for(Tarea tarea : tareas){
            if(getTareaPorDesc(tarea.getDescripcion()) != null ) {
                throw new Exception(String.format("la tarea \"%s\" ya existe", tarea.getDescripcion()));
            }
            
            this.tareas.add(tarea);
        }
    }
    
    public Tarea getTareaPorDesc(String descripcion) {
        /*
            - buscar tarea con descripcion que coincida con la descripcion del argumento
                - recorremos las tareas del usuario (this.tareas)
                    - si la descripcion de la tarea es igual a la descripcion del argumento, retornamos tarea
                    - si no, avanzamos a la siguiente tarea
                - si no encontramos ninguna tarea, retornamos null
        */
        for(Tarea tarea : this.tareas){            
            if(tarea.getDescripcion().equals(descripcion)){
                return tarea;
            }
        }
        
        return null;
    }
    
    /* completar tarea
        - buscar tarea por descripcion
        - si la tarea existe, la marcamos completada
        - si no existe, lanzamos una excepcion
    */
    public void completarTarea(String descripcion) throws Exception {
        Tarea tarea = getTareaPorDesc(descripcion);
        if(tarea != null) {
            tarea.marcarCompletada();
        }else{
            //la tarea "tarea 1" no existe
            throw new Exception(String.format("la tarea \"%s\" no existe", descripcion));
        }
    }
}
