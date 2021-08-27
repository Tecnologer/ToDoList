/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.util.Scanner;
import todolist.modelos.Tarea;
import todolist.modelos.Usuario;

/**
 *
 * @author tecnologer
 */
public class ToDoList {
    
    private static Scanner keyboard = new Scanner(System.in);
    
    private static Usuario usuario;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreUsuario = leerTeclado("Nombre de usuario: ");
        usuario = new Usuario(nombreUsuario);
        
        Integer opcion = 0;
        do{
            try{
                print("\nOpciones: ", 
                        "\t1. Agregar tarea",
                        "\t2. Ver tareas",
                        "\t3. Completar tarea",
                        "\t4. Salir",
                        "\n"
                 );
                opcion = leerNumero("Elije una opcion:");
            }
            catch(Exception e){                
                opcion = 0;
            }
            
            switch(opcion){
                case 1: //agregar tarea               
                    agregarTarea();
                    break;
                case 2: //ver tareas
                    verTareas();
                    break;
                case 3: // Completar tarea
                    completarTarea();
                    break;
                case 4: // salir
                    print("bye");
                    System.exit(0);
                    break;
                default:
                    print("Opcion no valida, intenta de nuevo.");
            }
        }            
        while(opcion != 4);
        
        
    }
    
    private static String leerTeclado(String mensaje) {        
        print(mensaje);
        System.out.print("> ");
        return keyboard.nextLine();
    }
    
    private static Integer leerNumero(String mensaje){
        String input = leerTeclado(mensaje);
        return Integer.parseInt(input);
    }
    
    public static void print(String ...mensajes){
        for(String mensaje : mensajes)
            System.out.println(mensaje);
    }
    
    public static void printf(String format, Object... args){
        print(String.format(format, args));
    }
    
    private static void agregarTarea(){
         /*
            - leer del teclado la descripcion de la terea
            - si no esta vacia:
                - creamos una instancia de la tarea
            - si esta vacia:
                - mostramos mensaje de error
                - pedimos que ingrese de nuevo la descripcion
        */
        try{
            String descripcion = "";
            while(descripcion == ""){
                descripcion = leerTeclado("Ingresar descripcion");
                descripcion = descripcion.trim();
                
                if(descripcion == ""){
                    print("Descripcion no valida, intenta de nuevo.");
                }
            }
            
            
            Tarea tarea = new Tarea(descripcion);
            usuario.addTarea(tarea);
            
            printf("Tarea \"%s\" agregada correctamente", tarea.getDescripcion());
        }
        catch(Exception e){
            print("Error desconocido: ", e.getMessage());
        }
    }
    
    private static void verTareas() {
        /*
        - obtener tareas de usuario
        - recorrer lista de tareas
        - imprimir la descripcion de la tarea y su estatus
        */
        
        for(Tarea tarea : usuario.getTareas()){
            String status = tarea.estaCompleta() ? "completa":"incompleta";
            
            printf("%s - (%s)", tarea.getDescripcion(), status);
        }
    }
    
    private static void completarTarea(){
        try{
            String descripcion = leerTeclado("Tarea a completar");            
            usuario.completarTarea(descripcion);
            printf("\"%s\" fue completada correctamente", descripcion);
        }
        catch(Exception e){
            print(e.getMessage());
        }
    }
}
