/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase ArrayListConsultas:
 * Clase Abstracta de Consulta.
 */
public abstract class Consulta  {
    
    /**
     * Atributos:
     * idConsulta: id de la consulta de tipo int.
     * tituloConsulta: String del titulo de la Consulta.
     * Descripcion: String de la descripcion de la Consulta.
     * tituloTema: String del titulo del tema.
     */
    private int idConsulta;
    private String tituloConsulta;
    private String Descripcion;
    private String tituloTema;
   
    public Consulta() {
    }
    
    /**
     * Metodo getIdConsulta:
     * Se obtiene la id de la consulta.
     * @return se retorna la id de la consulta.
     */
    public int getIdConsulta() {
        return idConsulta;
    }
    
    /**
     * Metodo setIdConsulta:
     * Se setea el id de la consulta.
     * @param idConsulta: id de la consulta a setear.
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * Metodo getTituloConsulta:
     * Se obtiene el titulo de la consulta.
     * @return Se retorna el titulo de la consulta.
     */
    public String getTituloConsulta() {
        return tituloConsulta;
    }

    /**
     * Metodo setTituloConsulta:
     * Se setea el titulo de la consulta.
     * @param tituloConsulta: titulo de la consulta a setear.
     */
    public void setTituloConsulta(String tituloConsulta) {
        this.tituloConsulta = tituloConsulta;
    }

    /**
     * Metodo getDescripcion:
     * Se obtiene la descripcion.
     * @return Se retorna la descripcion de la consulta.
     */
    public String getDescripcion() {
        return Descripcion;
    }
    /**
     * Metodo setDescripcion:
     * Se setea la descripcion de la consulta.
     * @param Descripcion: Descripcion a setear.
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * Metodo getRespuestasConsulta:
     * Se obtiene la respuesta de la consulta.
     */
    public abstract Object getRespuestasConsulta();

    /**
     * Metodo setRespuestasConsulta:
     * Se setea las respuestas de la consulta
     * @param respuesta: respuesta obtenida.
     */
    public abstract void setRespuestasConsulta(Object respuesta);

    /**
     * Metodo getTituloTema:
     * Se obtiene el titulo de la consulta
     * @return Se retorna el titulo
     */
    public String getTituloTema() {
        return tituloTema;
    }

    /**
     * Metodo setTituloTema:
     * Se setea el titulo del tema.
     * @param tituloTema: tituloTema para setear.
     */
    public void setTituloTema(String tituloTema) {
        this.tituloTema = tituloTema;
    }
}
