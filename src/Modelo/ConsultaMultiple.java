/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase ConsultaMultiple:
 * Clase hija desde la clase Consulta.
 */
public class ConsultaMultiple extends Consulta {
    
    /**
     * Atributos:
     * respuesta: tipo RespuestaMultiple.
     */
    private RespuestaMultiple respuesta;

    /**
     * Constructor:
     * Se inicializa Respuesta Multiple.
     */
    public ConsultaMultiple() {
        this.respuesta = new RespuestaMultiple();
    }
    
    /**
     * SobreEscritura de RespuestaConsulta:
     * Se retorna la respuesta.
     * @return Retorno de la respuesta.
     */
    @Override
    public Object getRespuestasConsulta() {
        return respuesta;
        
    /**
     * SobreEscritura de setRespuestasConsulta.
     * Se setean las respuestas.
     */
    }
    @Override
    public void setRespuestasConsulta(Object respuesta) {
        switch ((int)respuesta){
            case 5:
                this.respuesta.setmFavor();
                break;
            
            case 4:
                this.respuesta.setaFavor();
                break;
            
            case 3:
                this.respuesta.setNeutro();;  
                break;
                
            case 2:
                this.respuesta.setContra();  
                break;
                
            case 1:
                this.respuesta.setmContra();  
                break;
        }
    }

}
