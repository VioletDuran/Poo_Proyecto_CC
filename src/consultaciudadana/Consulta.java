/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */

 /**
  * Clase Consulta:
  * Cada Consulta queda definido por idConsulta, un ArrayList de las respuestas de la consulta,
  * su titulo y su respectiva descripcion (Atributos).
  * @author Violet
  */

public class Consulta {
    //Atributos
    private String idConsulta;
    private ArrayList<Respuesta> respuestas;
    private String titulo;
    private String descripcion;
    
    /**
     * Constructor para inicializar Atributos.
     */
    public Consulta() {
        this.respuestas= new ArrayList();
    }
    /**
     * Metodo para retornar el id de la consulta.
     * @return 
     */
    public String getIdConsulta() {
        return idConsulta;
    }
    /**
     * Metodo para asignar el id de la consulta.
     * @param idConsulta 
     * String Id de la consulta para asignar.
     */

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }
    
    /**
     * Metodo para retornar el titulo de la consulta.
     * @return 
     */

    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Metodo para asignar el titulo de la consulta.
     * @param titulo 
     * String Titulo para asignar.
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Metodo para retornar la descripcion de la consulta.
     * @return 
     */

    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Metodo para asignar la descripcion de la consulta.
     * @param descripcion 
     * String Descripcion para asignar.
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Metodo para retornar el ArrayList de Respuesta.
     * @return 
     */
    
    
    /**
     * metodo para rellenar el ArrayList.
     * @param respuesta 
     * Objeto tipo Respuesta para rellenar.
     */
    
    public void addRespuesta(Respuesta respuesta){
        this.respuestas.add(respuesta);
    }
    
    public void addRespuesta(String idRespuesta, int meGustas, int noMeGustas){
        Respuesta aux= new Respuesta();
        aux.setIdRespuesta(idRespuesta);
        aux.setMeGustas(meGustas);
        aux.setNoMeGustas(noMeGustas);
        this.respuestas.add(aux);
    }
    
    /**
     * Metodo para llenar el ArrayList de Respuestas, el cual recibe como parametros la linea del archivo 
     * en la cual te encuentras ademas del archivo CSV.
     * @param linea
     * Linea en la que te encuentras.
     * @param acceso 
     * Archivo CSV abierto.
     */
    public void llenarRespuestas(String linea, CSV acceso){    
        
        
            Respuesta auxRespuesta = new Respuesta();
            for (int i = 6; i < 9; i++) {
                switch(i){
                    case 6:{
                        auxRespuesta.setIdRespuesta(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 7:{
                        auxRespuesta.setMeGustas(Integer.parseInt(acceso.get_csvField(linea,i)));
                        break;
                    }
                    case 8:{
                        auxRespuesta.setNoMeGustas(Integer.parseInt(acceso.get_csvField(linea,i)));
                        break;
                    }
                }
        }
        this.respuestas.add(auxRespuesta);
    }
    /**
     * Metodo realizado para mostrar el ArrayList de respuestas, mostrando su ID, Cantidad de me gustas y cantidad
     * de no me gustas.
     */
    public void mostrarRespuesta(){
        for (int i = 0; i <this.respuestas.size(); i++) {
            System.out.println("Respuestas : "+(i+1));
            System.out.println("ID: "+this.respuestas.get(i).getIdRespuesta());
            System.out.println("Cantidad me gustas: "+this.respuestas.get(i).getMeGustas());
            System.out.println("Cantidad no me gustas: "+this.respuestas.get(i).getNoMeGustas());
        }
    }
}
