/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase Consulta Binaria:
 * Clase hija desde Consula.
 */
public class ConsultaBinaria extends Consulta{
    
    /**
     * Atributos:
     * respuesta: Tipo RespuestaBinaria.
     */
    private RespuestaBinaria respuesta;
    
    /**
     * Constructor:
     * Se inicializa el atributo.
     */
    public ConsultaBinaria() {
        this.respuesta = new RespuestaBinaria();
    }
    
    /**
     * SobreEscritura de getRespuestaConsulta:
     * Se retorna la respuesta.
     * @return Retorna Respuesta.
     */
    @Override
    public Object getRespuestasConsulta() {
        return respuesta;
    }

    /**
     * SobreEscritura de setRespuestaConsulta:
     * Se setea la respuesta.
     * @param respuesta: Respuesta a setear.
     */
    @Override
    public void setRespuestasConsulta(Object respuesta) {
        if((Boolean)respuesta == true)
            this.respuesta.setLikes();
        else
            this.respuesta.setDisLikes();
    }

    
}
