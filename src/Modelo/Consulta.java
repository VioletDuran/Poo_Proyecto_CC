/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sergio
 */
public abstract class Consulta  {
    
    private int idConsulta;
    private String tituloConsulta;
    private String Descripcion;
    private String tituloTema;
   
    public Consulta() {
 
    }
    
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getTituloConsulta() {
        return tituloConsulta;
    }

    public void setTituloConsulta(String tituloConsulta) {
        this.tituloConsulta = tituloConsulta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public abstract Object getRespuestasConsulta();
    

    public abstract void setRespuestasConsulta(Object respuesta);

    
    public String getTituloTema() {
        return tituloTema;
    }

    public void setTituloTema(String tituloTema) {
        this.tituloTema = tituloTema;
    }
}
