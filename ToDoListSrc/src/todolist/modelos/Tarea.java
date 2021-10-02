/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.modelos;

import java.time.OffsetDateTime;

/**
 *
 * @author tecnologer
 */

public class Tarea {

    private int ID;
    private int idUsuario;
    private String descripcion;
    private boolean status;
    private OffsetDateTime fechaCreacion;
    private OffsetDateTime fechaCompletada;

    public Tarea(int ID, int idUsuario, String descripcion, boolean status, OffsetDateTime fechaCreacion, OffsetDateTime fechaCompletada) {
        this.ID = ID;
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.status = status;
        this.fechaCreacion = fechaCreacion;
        this.fechaCompletada = fechaCompletada;
    }

    public Tarea(String descripcion) {
        this.fechaCreacion=OffsetDateTime.now();
        this.descripcion = descripcion;
        this.status = false;
    }

    public Tarea() {
        this.fechaCreacion=OffsetDateTime.now();
        this.descripcion = "";
        this.status = false;
    }

    public int getID() {
        return ID;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public OffsetDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public OffsetDateTime getFechaCompletada() {
        return fechaCompletada;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean estaCompleta() {
        return status;
    }

    public void marcarCompletada() {
        this.status = true;
    }

    public void marcarIncompleta() {
        this.status = false;
    }
}
