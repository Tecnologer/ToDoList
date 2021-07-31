/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.modelos;

/**
 *
 * @author tecnologer
 */
public class Tarea {
    private String descripcion;
    private boolean estaCompletada;     

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.estaCompletada = false;
    }
    
    public Tarea() {
        this.descripcion = "";
        this.estaCompletada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstatus() {
        return estaCompletada;
    }

    public void setEstatus(boolean estatus) {
        this.estaCompletada = estatus;
    }
}
