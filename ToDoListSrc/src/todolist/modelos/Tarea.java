/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.modelos;

import java.util.Date;

/**
 *
 * @author tecnologer
 */
public class Tarea {
    private int IDUsuario;
    private String descripcion;
    private boolean estaCompletada;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    

    public Tarea(String descripcion, int idUsuario,Date fechaInicio) {
        this.descripcion = descripcion;
        this.IDUsuario=idUsuario;
        this.fechaInicio=fechaInicio;
        this.estaCompletada = false;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
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

    public boolean estaCompleta() {
        return estaCompletada;
    }

    public void marcarCompletada() {
        this.estaCompletada = true;
    }
    
    public void marcarIncompleta() {
        this.estaCompletada = false;
    }
}
