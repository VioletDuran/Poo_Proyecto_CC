/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Controlador;

import consultaciudadana.Modelo.*;
import java.io.*;

/**
 *
 * @author alexm
 */
public class ManejoDeColleciones {
    private ColeccionTema temas;
    private MapaTemas mapaTema;
    
    public ManejoDeColleciones(){
        temas = new ColeccionTema();
        mapaTema = new MapaTemas();
    }

    
    public ColeccionTema getTemas(){
        return temas;
    }
    
    public MapaTemas getMapaTemas(){
        return mapaTema;
    }
    //Colecion de tema y mapa tema pueden ser varibles de instancia
    
//              FUNCIONES AGREGAR
    public void agregarTema(ColeccionTema temas, MapaTemas mapaTema, Tema auxTema) {
        temas.add(auxTema);
        mapaTema.put(auxTema.getTipoTema(), auxTema);
    }
     public void agregarConsulta(String idTema,Consulta nuevaConsulta) throws IOException {
        mapaTema.get(idTema).setConsulta(nuevaConsulta); 

    }
//              GENERAR TEMAS POR ARCHIVO
    public void generarTemas() throws IOException {
        CSV acceso = new CSV("Temas");

        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            Tema nuevoTema = new Tema();
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0: {
                        nuevoTema.setTitulo(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 1: {
                        nuevoTema.setDescripcion(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                        nuevoTema.setTipoTema(acceso.get_csvField(linea, i));
                        break;
                    }
                }
            }
            llenarConsulta(nuevoTema, linea, acceso);
            temas.add(nuevoTema);
            mapaTema.put(nuevoTema.getTipoTema(), nuevoTema);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }

    public void llenarConsulta(Tema nuevoTema, String linea, CSV acceso) {
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
        llenarRespuestas(consultas, linea, acceso);
        nuevoTema.setConsulta(consultas);
    }

    public void llenarRespuestas(Consulta consultas, String linea, CSV acceso) {
        Respuesta auxRespuesta = new Respuesta();
        for (int i = 6; i < 9; i++) {
            switch (i) {
                case 6: {
                    auxRespuesta.setIdRespuesta(acceso.get_csvField(linea, i));
                    break;
                }
                case 7: {
                    auxRespuesta.setMeGustas(Integer.parseInt(acceso.get_csvField(linea, i)));
                    break;
                }
                case 8: {
                    auxRespuesta.setNoMeGustas(Integer.parseInt(acceso.get_csvField(linea, i)));
                    break;
                }
            }
        }
        consultas.addRespuesta(auxRespuesta);
    }

    public boolean existeEnMapaTemas(String tipoTemaKey, MapaTemas mapaTema) {
        return mapaTema.containsKey(tipoTemaKey);
    }
}
