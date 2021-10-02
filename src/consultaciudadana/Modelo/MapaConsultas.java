/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

import java.util.HashMap;

/**
 *
 * @author Miguel
 */
public class MapaConsultas {
    
    private HashMap<String,Consulta>mapaConsultas;
    
    public MapaConsultas(){
        mapaConsultas = new HashMap();
    }
    
    public void put(String key, Consulta consulta){
        mapaConsultas.put(key,consulta);
    }
    public Consulta get(String key){
        return mapaConsultas.get(key);
    }
    public boolean containsKey(String key){
        return mapaConsultas.containsKey(key);
    }
}
