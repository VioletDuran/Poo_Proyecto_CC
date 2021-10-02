/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

/**
 *
 * @author sebas
 */

/**
 * Clase Respuesta:
 * Cada respuesta queda definido por idRespuesta, MeGustas y noMeGustas (Atributos).
 * @author Violet
 */
public class Respuesta {
    //Atributos
    private String idRespuesta;
    private int meGustas;
    private int noMeGustas;
    
    /**
     * Constructor para inicializar atributos.
     */
        public Respuesta() {
    }
        
    /**
     * Metodo para obtener el Id de la respuesta.
     * @return 
     */

    public String getIdRespuesta() {
        return idRespuesta;
    }
    
    /**
     * Metodo para asignar el id de la respuesta.
     * @param idRespuesta 
     * String Id para asignar.
     */

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }
    
    /**
     * Metodo para obtener meGustas.
     * @return 
     */

    public int getMeGustas() {
        return meGustas;
    }
    /**
     * Metodo para asignar meGustas
     * @param meGustas 
     * Int MeGustas para asignar.
     */

    public void setMeGustas(int meGustas) {
        this.meGustas = meGustas;
    }
    
    
    
    /**
     * Metodo para obtener noMeGustas.
     * @return 
     */

    public int getNoMeGustas() {
        return noMeGustas;
    }
    /**
     * Metodo para asignar noMeGustas.
     * @param noMeGustas 
     * Int noMeGustas para asignar.
     */

    public void setNoMeGustas(int noMeGustas) {
        this.noMeGustas = noMeGustas;
    }    
}
