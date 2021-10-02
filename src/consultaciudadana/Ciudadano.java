/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana;
import java.util.*;
/**
 *
 * @author sebas
 */

/**
 * Clase Ciudadano:
 * Cada ciudadano queda definido por su Rut, Nombre y un HashMap de las Respuestas que el ha realizado.
 * @author Violet
 */

public class Ciudadano {
    //Atributos
    private String rut;
    private String nombre;
    private HashMap<String,Respuesta> respuesta; 
    
    /**
     * Constructor para inicializar atributos.
     */
    public Ciudadano() {
        this.rut = "-";
        this.nombre = "-";
        this.respuesta = new HashMap();
    }
    
    /**
     * Metodo realizado para retornar Rut del ciudadano.
     * @return 
     */

    public String getRut() {
        return rut;
    }
    
    /**
     * Metodo para asignar el rut al ciudadano.
     * @param rut 
     * String Rut para asignar.
     */

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * Metodo para obtener el nombre del ciudadano.
     * @return 
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo para asignar el nombre del ciudadano.
     * @param nombre 
     * String Nombre pasa asignar.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo para retornar el mapa de respuestas.
     * @return 
     */

    public HashMap<String,Respuesta> getRespuesta() {
        return respuesta;
    }
    
    /**
     * Metodo realizado para llenar el HashMap el cual recibe la Key y el objeto Respuesta.
     * @param key
     * Key usado para guardar el objeto en el HashMap.
     * @param respuesta 
     * Objeto para llenar el HashMap.
     */

    public void addRespuesta(String key,Respuesta respuesta) {
        this.respuesta.put(key,respuesta);
    }
    
    
}