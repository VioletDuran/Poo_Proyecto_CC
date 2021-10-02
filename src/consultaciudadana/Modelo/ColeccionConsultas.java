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
public class ColeccionConsultas {
    private ArrayList<Consulta> consultas;
    
    public ColeccionConsultas(){
        consultas = new ArrayList();
    }
    
    public void add(Consulta consulta){
        consultas.add(consulta);
    }
    public int size(){
        return consultas.size();
    }
    public Consulta get(int i){
        return consultas.get(i);
    }
}
