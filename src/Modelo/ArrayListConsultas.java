/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 * Clase ArrayListConsultas:
 * Clase dedicada al ArrayList de las consultas con sus respectivos metodos.
 */
public class ArrayListConsultas {
    /**
     * Atributo: Consultas el cual es un ArrayList de consultas
     */
    private ArrayList<Consulta> consultas;
    
    /**
     * Constructor:
     * Se inicializa el ArrayList
     */
    public ArrayListConsultas(){
        this.consultas = new ArrayList();
    }
    
     /**
     * Metodo setConsulta:
     * Se setea la nueva Consulta.
     * @param newConsulta: Consulta para setear dentro del ArrayList.
     */
    public void setConsulta(Consulta newConsulta){
        this.consultas.add(newConsulta);
    }
     /**
     * Metodo getConsulta:
     * Se retorna la consulta.
     * @param i: Posicion del ArrayList para retornar.
     * @return Retorna la consulta del ArrayList.
     */
    public Consulta getConsulta(int i){
        return this.consultas.get(i);
    }
      /**
     * Metodo getConsulta:
     * Se retorna el largo del ArrayList.
     * @return Retorna el largo del ArrayList.
     */
    public int sizeConsultas(){
        return this.consultas.size();
    }
    
    /**
     * Metodo removeConsulta:
     * Se quita la consulta solicitada
     * @param idConsultaEliminada: La id de la consulta para retirar
     */
    public void removeConsulta(int idConsultaEliminada){
        consultas.remove(getConsultaPorId(idConsultaEliminada));
    }
    
    /**
     * Metodo getConsultaPorId:
     * Se obtienen una consulta en especifico
     * @param id: id de la consulta a buscar para retornar
     * @return Se retorna la consulta deseada
     */
    public Consulta getConsultaPorId(int id){
        for (int i = 0; i < consultas.size() ; i++) {
            if(consultas.get(i).getIdConsulta()==id){
                return consultas.get(i);
            }
        }
        return null;
    }
    
    /**
     * Metodo getConsultaPorId:
     * Se obtienen una consulta en especifico
     * @param idBuscada: id de la consulta a buscar para retornar.
     * @return Se retorna la consulta deseada
     */
    public Consulta getConsultaPorId(String idBuscada){
        int id = Integer.parseInt(idBuscada);
        for (int i = 0; i < consultas.size() ; i++) {
            if(consultas.get(i).getIdConsulta()==id){
                return consultas.get(i);
            }
        }
        return null;
    }
    
    /**
     * Metodo editarTemaConsultas:
     * Se edita el tema de la consulta.
     * @param tema: tema a editar.
     */
    public void editarTemaConsultas(String tema){
        for(int i = 0 ; i < consultas.size() ; i++){
            consultas.get(i).setTituloTema(tema);
        }
    }
    /**
     * Metodo getCopiaArraylist:
     * se retorna una copia del arraylist que se desee
     * @return Se retorna una copia del arraylist
     */
    public ArrayListConsultas getCopiaArrayList( ){
       ArrayListConsultas aux = new ArrayListConsultas();
       for(int i = 0 ; i < this.consultas.size() ; i++){
           aux.setConsulta(this.consultas.get(i));
       }
       return aux;
    }
    
    /**
     * Metodo editaTituloYDescripcion
     * Se edita el arraylist
     * @param tituloNuevo: Nuevo Titulo
     * @param descripcionNueva: Nueva Descripcion
     * @param idBuscada: id para buscar
     */
    public void editaTituloYDescripcion(String tituloNuevo, String descripcionNueva, int idBuscada){
        this.getConsultaPorId(idBuscada).setTituloConsulta(tituloNuevo);
        this.getConsultaPorId(idBuscada).setDescripcion(descripcionNueva);
    }
}