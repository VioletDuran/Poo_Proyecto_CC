/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana;


import java.io.*;
import java.util.*;

/**
 *
 * @author sebas
 */

/**
 * Clase Tema:
 * Cada tema queda definido por una descripcion, un tipo, un titulo,
 * ademas de contener un arraylist y un hashmap de Consultas (Atributos).
 * @author Violet
 */

public class Tema {
    
    //Variables de instancia.
    private String descripcion;
    private String tipo;
    private String titulo;
    private ArrayList <Consulta> consultas;
    private HashMap <String , Consulta> mapaConsulta;
    
    /**
     * Constructor para inicializar atributos.
     */
    public Tema() {
        this.consultas = new ArrayList();
        this.mapaConsulta = new HashMap();
    }
    
    /**
     * Metodo para retornar el tipo del Tema.
     * @return 
     */

    public String getTipoTema() {
        return tipo;
    }
    
    /**
     * Metodo para asignar el tipo del Tema.
     * @param tipo 
     * String Tipo para asignar.
     */

    public void setTipoTema(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Metodo para retornar la descripcion del tema.
     * @return 
     */

    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Metodo para asignar la descripcion del tema.
     * @param descripcion
     * String Descripcion para asignar.
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Metodo para retornar el titulo del tema.
     * @return 
     */

    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Metodo para asignar el titulo del tema
     * @param titulo 
     * String Titulo para asignar.
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Metodo realizado para llenar el HashMap y el ArrayList.
     * @param auxConsulta 
     * Objeto tipo Consulta para llenar.
     */
    
    public void setConsulta(Consulta auxConsulta){
        this.consultas.add(auxConsulta);
        this.mapaConsulta.put(auxConsulta.getIdConsulta(), auxConsulta);
    }
    
    public void setConsulta(String idConsulta,String titulo, String descripcion){
        Consulta aux= new Consulta();
        aux.setDescripcion(descripcion);
        aux.setIdConsulta(idConsulta);
        aux.setTitulo(titulo);
        this.consultas.add(aux);
        
    }
   
    
    /**
     * Metodo realizado para comprobar si existe la Consulta dentro del mapa, en caso de ser exitoso
     * muestra el Titulo y su descripcion.
     * @param key 
     * String Clave del mapa.
     */
    
    public void existeConsultas(String key)
    {
        if(this.mapaConsulta.containsKey(key))
        {
                Consulta auxConsulta = this.mapaConsulta.get(key);
                System.out.println("Titulo de la consulta:" + auxConsulta.getTitulo());
                System.out.println("Descripcion de la consulta:" + auxConsulta.getDescripcion());
                System.out.println("");
        }else{
            System.out.println("No existe consulta");
        }
    }
    
    /**
     * Metodo realizado para mostrar las consultas dentro del ArrayList, mostrando
     * su Id, Titulo y Descripcion.
     */
    
    public void mostrarConsultas(){
        for (int i = 0; i < this.consultas.size(); i++) {
            System.out.println("Consulta "+(i+1));
            System.out.println("Id: "+this.consultas.get(i).getIdConsulta());
            System.out.println("Titulo: "+this.consultas.get(i).getTitulo());
            System.out.println("Descripcion: "+this.consultas.get(i).getDescripcion());
            this.consultas.get(i).mostrarRespuesta();
        }
    }
    
    
    /**
     * 
     * Metodo para llenar el ArrayList y el HashMap de Consultas recibiendo como parametros la linea del archivo
     * CVS y el archivo CSV abierto.
     * @param linea
     * Linea en la cual me encuentro en el archivo CSV.
     * @param acceso
     * Archivo CSV abierto.
     */    
    
    public void llenarConsulta(String linea, CSV acceso) {
        Consulta consultas = new Consulta();
        for (int i = 3; i < 6; i++) {
            switch (i) {
                case 3: {
                    consultas.setIdConsulta(acceso.get_csvField(linea, i));
                    break;
                }
                case 4: {
                    consultas.setTitulo(acceso.get_csvField(linea, i));
                    break;
                }
                case 5: {
                    consultas.setDescripcion(acceso.get_csvField(linea, i));
                    break;
                }
            }
        }
        consultas.llenarRespuestas(linea, acceso);
        this.mapaConsulta.put(consultas.getTitulo(), consultas);
        this.consultas.add(consultas);
    }   
}
