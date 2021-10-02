/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Sergio
 */
public class ManejoDeColecciones {
    private HashMap<String,ArrayListConsultas> consultas;
    
    public ManejoDeColecciones(){
        this.consultas = new HashMap();
    }
    
    public void generarConsultas() throws IOException {
        CSV acceso = new CSV("ConsultasIniciales");

        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            Consulta nuevaConsulta = new Consulta();
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0: {
                        nuevaConsulta.setTituloTema(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 1: {
                        nuevaConsulta.setIdConsulta(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 2: {
                        nuevaConsulta.setTituloConsulta(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                        nuevaConsulta.setDescripcion(acceso.get_csvField(linea, i));
                        break;
                    }
                }
            }
            if(this.consultas.containsKey(nuevaConsulta.getTituloTema())){
                this.consultas.get(nuevaConsulta.getTituloTema()).setConsulta(nuevaConsulta);
            }
            else{
                ArrayListConsultas auxConsultas = new ArrayListConsultas();
                auxConsultas.setConsulta(nuevaConsulta);
                this.consultas.put(nuevaConsulta.getTituloTema(), auxConsultas);
            }
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
    
    public ArrayListConsultas motrarConsultasPorTema(String tema){
        return this.consultas.get(tema);       
    }

    public void agregarConsulta(Consulta nuevaConsulta) {
        if (this.consultas.containsKey(nuevaConsulta.getTituloTema())) {
            this.consultas.get(nuevaConsulta.getTituloTema()).setConsulta(nuevaConsulta);
        } else {
            ArrayListConsultas auxConsultas = new ArrayListConsultas();
            auxConsultas.setConsulta(nuevaConsulta);
            this.consultas.put(nuevaConsulta.getTituloTema(), auxConsultas);
        }
    }
    
    public void agregarConsulta(String tema , String idConsulta , String tituloConsulta , String descripcionConsulta , Respuesta nuevaRespuesta) {
        Consulta auxConsulta = new Consulta();
        auxConsulta.setTituloTema(tema);
        auxConsulta.setIdConsulta(Integer.parseInt(idConsulta));
        auxConsulta.setTituloConsulta(tituloConsulta);
        auxConsulta.setDescripcion(descripcionConsulta);
        auxConsulta.setRespuestasConsulta(nuevaRespuesta);
        agregarConsulta(auxConsulta);
    }

    public boolean existeEnMapaConsulta(String opcion){
            return consultas.containsKey(opcion);
    }
    
    public ArrayListConsultas getArray(String key){
        return consultas.get(key);
    }

    public int tamMapa(){
        int contador=0;
        for (Map.Entry<String,ArrayListConsultas> set: consultas.entrySet()) {
            contador+= set.getValue().sizeConsultas();
        }
        return contador;
    }
    public HashMap<String,ArrayListConsultas> getConsultas(){
        HashMap<String,ArrayListConsultas> aux= new HashMap();
        aux= this.consultas;
        return aux;
    }
    
    public boolean existeIdEnConsultas(String key,int idBuscada){
        if (consultas.get(key)==null) {
            return false;
        }
        for (int i = 0; i < consultas.get(key).sizeConsultas(); i++) {
            if(consultas.get(key).getConsulta(i).getIdConsulta() == idBuscada){
                return true;
            }
        }
        return false;
    }
    
    public Consulta buscarConsulta (String key, int idBuscada){
        for (int i = 0; i < consultas.get(key).sizeConsultas(); i++) {
            if(consultas.get(key).getConsulta(i).getIdConsulta() == idBuscada){
                return consultas.get(key).getConsulta(i);
            }
        }
        return null;
    }
   
    public void editarConsulta (String temaBuscado, int idConsultaBuscada, String tituloNuevo, String descripcionNueva){
        if(!tituloNuevo.equals(null)){
            consultas.get(temaBuscado).getConsultaPorId(idConsultaBuscada).setTituloConsulta(tituloNuevo);
        }
        if(!descripcionNueva.equals(null)){
            consultas.get(temaBuscado).getConsultaPorId(idConsultaBuscada).setDescripcion(descripcionNueva);
        }
    }
    public ArrayListConsultas getConsultasPorTema(String TemaBuscado){
        return consultas.get(TemaBuscado);
    }
    
    public void agregarRespuesta(String tema , String id , boolean tipoRespuesta){
        ArrayListConsultas auxConsultas = consultas.get(tema);
        int idBuscanda = Integer.parseInt(id);
        for(int i = 0 ; i < auxConsultas.sizeConsultas() ; i++){
            if(auxConsultas.getConsulta(i).getIdConsulta() == idBuscanda){
                if(tipoRespuesta == true){
                    auxConsultas.getConsulta(i).getRespuestasConsulta().setLikes();
                    return;
                }
                else{
                    auxConsultas.getConsulta(i).getRespuestasConsulta().setDisLikes();
                    return;
                }
            }
        }
    }
    
    public void EliminarTema(String tema){
        consultas.remove(tema);
    }
    
    public void EditarTema(String temaAEditar , String temaEditado){
        ArrayListConsultas auxConsultas = consultas.get(temaAEditar);
        auxConsultas.editarTemaConsultas(temaEditado);
        consultas.remove(temaAEditar);
        for(int i = 0 ; i < auxConsultas.sizeConsultas() ; i++){
            agregarConsulta(auxConsultas.getConsulta(i));
        }
    }
    
    public void AgregarTema(String nuevoTema){
        ArrayListConsultas auxConsultas = new ArrayListConsultas();
        consultas.put(nuevoTema, auxConsultas);
    }
}
