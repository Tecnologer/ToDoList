/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import todolist.modelos.Tarea;
import todolist.modelos.Usuario;

/**
 *
 * @author tecnologer
 */
public class UserTests {
    
    public UserTests() {
    }
    
    @Test
    public void addTareasUsersTests() {
        Usuario usuario = new Usuario("oscar");
        Tarea tarea1 = new Tarea("tarea 1");
        Tarea tarea2 = new Tarea("tarea 2");        
        usuario.addTarea(tarea1, tarea2);
        //todo: guardar en db
        assertEquals(2, usuario.getTareas().size());
        assertNotNull(usuario.getTareaPorDesc("tarea 1"));
        assertNotNull(usuario.getTareaPorDesc("tarea 2"));
    }
    
}
