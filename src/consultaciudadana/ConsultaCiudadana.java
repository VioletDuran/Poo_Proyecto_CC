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
 * Clase ConsultaCiudadana:
 * Clase main para crear Map,ArrayList y llenar datos.
 * @author Violet
 */
public class ConsultaCiudadana {
    /**
     * Metodo Main para crear colecciones y llamar funciones.
     * @param args
     * @throws IOException 
     */
     public static void main(String [] args)throws IOException{
        HashMap <String , Tema> mapaTema = new HashMap(); 
        ArrayList<Tema> temas= new ArrayList();
        generarTemas(temas,mapaTema);
    }

     /**
      * Metodo para Llenar el ArrayList y HashMap de Temas, ademas de llamar a las
      * demas funciones para llenar las siguientes colecciones ademas de printear el tema.
      * @param temas
      * ArrayList de Temas.
      * @param mapaTema
      * HashMap de Temas.
      * @throws IOException 
      */
    public static void generarTemas(ArrayList<Tema> temas, HashMap<String, Tema> mapaTema) throws IOException{
        CSV acceso = new CSV("Temas");
    
        String linea = acceso.firstLine();
        linea= acceso.nextLine();
        while(linea!= null)
        {
            Tema nuevoTema = new Tema();
            for (int i = 0; i < 3; i++) {
                switch(i){
                    case 0:{
                        nuevoTema.setTitulo(acceso.get_csvField(linea,i));
                        break;
                    }
                    case 1:{
                        nuevoTema.setDescripcion(acceso.get_csvField(linea,i));
                        break;
                    }
                    case 2:{
                        nuevoTema.setTipoTema(acceso.get_csvField(linea,i));
                        break;
                    }
                }            
            }
            nuevoTema.llenarConsulta(linea,acceso);
            temas.add(nuevoTema);
            mapaTema.put(nuevoTema.getTipoTema(), nuevoTema);
            linea = acceso.nextLine();
            if(linea == null)
                break;
        }
        for (int i = 0; i < temas.size(); i++) {
            System.out.println("Id: "+temas.get(i).getTipoTema());
            System.out.println("Titulo: "+temas.get(i).getTitulo());
            System.out.println("Descripcion: "+temas.get(i).getDescripcion());
            temas.get(i).mostrarConsultas();
        }
       
    }
   
}
    
    




