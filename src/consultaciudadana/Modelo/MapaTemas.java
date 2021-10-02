/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

import java.util.HashMap;

/**
 *
 * @author alexm
 */
public class MapaTemas {
    
    private HashMap <String , Tema> mapaTema = new HashMap();  
    public void put(String clave , Tema valor){
        mapaTema.put(clave, valor);
    }
    
    public boolean containsKey(String mapaKey){
        return mapaTema.containsKey(mapaKey);
    }
    public Tema get(String key){
        return mapaTema.get(key);
    }
}
