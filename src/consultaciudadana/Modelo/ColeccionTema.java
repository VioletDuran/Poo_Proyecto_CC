/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

import java.util.ArrayList;

/**
 *
 * @author alexm
 */
public class ColeccionTema {
    
    private ArrayList<Tema> temas = new ArrayList();
    
    public void add(Tema nuevoTema){
        temas.add(nuevoTema);
    }
    
    public int size(){
        return this.temas.size();
    }
    
    public Tema get(int i){
        return this.temas.get(i);
    }
}
