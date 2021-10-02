/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Sergio
 */
public class ArrayListConsultas {
    private ArrayList<Consulta>consultas;
    
    public ArrayListConsultas(){
        this.consultas = new ArrayList();
    }
    
    public void setConsulta(Consulta newConsulta){
        this.consultas.add(newConsulta);
    }
    
    public Consulta getConsulta(int i){
        return this.consultas.get(i);
    }
    
    public int sizeConsultas(){
        return this.consultas.size();
    }
    
    public void removeConsulta(Consulta consulta){
        if(consulta != null)
            this.consultas.remove(consulta);
    }
    
    public Consulta getConsultaPorId(int id){
        for (int i = 0; i < consultas.size() ; i++) {
            if(consultas.get(i).getIdConsulta()==id){
                return consultas.get(i);
            }
        }
        return null;
    }
    
    public Consulta getConsultaPorId(String idBuscada){
        int id = Integer.parseInt(idBuscada);
        for (int i = 0; i < consultas.size() ; i++) {
            if(consultas.get(i).getIdConsulta()==id){
                return consultas.get(i);
            }
        }
        return null;
    }
    
    public void editarTemaConsultas(String tema){
        for(int i = 0 ; i < consultas.size() ; i++){
            consultas.get(i).setTituloTema(tema);
        }
    }
}