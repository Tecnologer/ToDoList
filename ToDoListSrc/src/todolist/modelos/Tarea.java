/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist.modelos;

<<<<<<< Updated upstream
=======
import java.time.OffsetDateTime;
import java.util.Date;

>>>>>>> Stashed changes
/**
 *
 * @author tecnologer
 */
public class Tarea {
<<<<<<< Updated upstream
    private String descripcion;
    private boolean estaCompletada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.estaCompletada = false;
    }
=======
    private int UsuarioID;
    private String descripcion;
    private boolean estaCompletada;
    private OffsetDateTime fechaInicio;
    private OffsetDateTime fechaFinalizacion;
    

    public Tarea(String descripcion, int idUsuario,OffsetDateTime fechaInicio) {
        this.descripcion = descripcion;
        this.UsuarioID=idUsuario;
        this.fechaInicio=fechaInicio;
        this.estaCompletada = false;
    }

    public int getUsuarioID() {
        return UsuarioID;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public OffsetDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(OffsetDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public OffsetDateTime getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(OffsetDateTime fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
>>>>>>> Stashed changes
    
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
