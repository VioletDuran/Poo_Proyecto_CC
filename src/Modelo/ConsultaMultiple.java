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
public class ConsultaMultiple extends Consulta {
    
    private RespuestaMultiple respuesta;

    public ConsultaMultiple() {
        this.respuesta = new RespuestaMultiple();
    }
 
    @Override
    public Object getRespuestasConsulta() {
        return respuesta;
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
