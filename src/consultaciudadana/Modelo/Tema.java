/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Modelo;

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
    private String idTema;
    private String titulo;
    private ColeccionConsultas consultas;
    private MapaConsultas mapaConsulta;
    
    /**
     * Constructor para inicializar atributos.
     */
    public Tema() {
        consultas = new ColeccionConsultas();
        mapaConsulta = new MapaConsultas();
    }
    
    /**
     * Metodo para retornar el tipo del Tema.
     * @return 
     */

    public String getTipoTema() {
        return idTema;
    }
    
    /**
     * Metodo para asignar el tipo del Tema.
     * @param tipo 
     * String Tipo para asignar.
     */

    public void setTipoTema(String tipo) {
        this.idTema = tipo;
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
   
    public ColeccionConsultas getConsultas(){
        return consultas;
    }
    
    public MapaConsultas getMapaConsultas(){
        return mapaConsulta;
    }
      
}
