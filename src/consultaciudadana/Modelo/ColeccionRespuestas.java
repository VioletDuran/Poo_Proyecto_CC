/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class ColeccionRespuestas {
    
    private ArrayList<Respuesta>respuestas;
    
    public ColeccionRespuestas(){
        respuestas = new ArrayList();
    }
    
    public void add(Respuesta respuesta){
        respuestas.add(respuesta);
    }
}
