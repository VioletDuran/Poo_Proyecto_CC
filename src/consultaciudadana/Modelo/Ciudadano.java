/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;
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
    //NO TIENE QUE ESTAR
    private HashMap<String,Respuesta> respuesta; 
    
    public Ciudadano() {
        this.rut = "-";
        this.nombre = "-";
        this.respuesta = new HashMap();
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String,Respuesta> getRespuesta() {
        return respuesta;
    }
    
    public void addRespuesta(String key,Respuesta respuesta) {
        this.respuesta.put(key,respuesta);
    }
    
    
}