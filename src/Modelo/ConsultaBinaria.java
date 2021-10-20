/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Zay
 */
public class ConsultaBinaria extends Consulta{
    
    private RespuestaBinaria respuesta;

    public ConsultaBinaria() {
        this.respuesta = new RespuestaBinaria();
    }
   
    @Override
    public Object getRespuestasConsulta() {
        return respuesta;
    }

    @Override
    public void setRespuestasConsulta(Object respuesta) {
        if((Boolean)respuesta == true)
            this.respuesta.setLikes();
        else
            this.respuesta.setDisLikes();
    }
    
    
}
