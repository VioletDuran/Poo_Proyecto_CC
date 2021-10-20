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

    private HashMap<String, ArrayListConsultas> consultas;

    public ManejoDeColecciones() {
        this.consultas = new HashMap();
    }

    public void generarConsultasBinarias() throws IOException {
        CSV acceso = new CSV("ConsultasBinarias");

        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            ConsultaBinaria nuevaConsulta = new ConsultaBinaria();
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
            if (this.consultas.containsKey(nuevaConsulta.getTituloTema())) {
                this.consultas.get(nuevaConsulta.getTituloTema()).setConsulta(nuevaConsulta);
            } else {
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

    public void generarConsultasMultiples() throws IOException {
        CSV acceso = new CSV("ConsultasMultiples");

        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            ConsultaMultiple nuevaConsulta = new ConsultaMultiple();
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
            if (this.consultas.containsKey(nuevaConsulta.getTituloTema())) {
                this.consultas.get(nuevaConsulta.getTituloTema()).setConsulta(nuevaConsulta);
            } else {
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

    public ArrayListConsultas motrarConsultasPorTema(String tema) {
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

    public void agregarConsulta(String tema, String idConsulta, String tituloConsulta, String descripcionConsulta, RespuestaBinaria nuevaRespuesta) {
        Consulta auxConsulta = new ConsultaBinaria();
        auxConsulta.setTituloTema(tema);
        auxConsulta.setIdConsulta(Integer.parseInt(idConsulta));
        auxConsulta.setTituloConsulta(tituloConsulta);
        auxConsulta.setDescripcion(descripcionConsulta);
        auxConsulta.setRespuestasConsulta(nuevaRespuesta);
        agregarConsulta(auxConsulta);
    }

    public boolean existeEnMapaConsulta(String opcion) {
        return consultas.containsKey(opcion);
    }

    public ArrayListConsultas getArray(String key) {
        return consultas.get(key);
    }

    public int tamMapa() {
        int contador = 0;
        for (Map.Entry<String, ArrayListConsultas> set : consultas.entrySet()) {
            contador += set.getValue().sizeConsultas();
        }
        return contador;
    }

    public HashMap<String, ArrayListConsultas> getConsultas() {
        HashMap<String, ArrayListConsultas> aux = new HashMap();
        aux = this.consultas;
        return aux;
    }

    public HashMap<String, ArrayListConsultas> getConsultasBinarias() {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        HashMap<String, ArrayListConsultas> auxConsultasBinarias = new HashMap();

        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                if (set.getValue().getConsulta(j) instanceof ConsultaBinaria) {
                    if (auxConsultasBinarias.containsKey(set.getValue().getConsulta(j).getTituloTema())) {
                        auxConsultasBinarias.get(set.getValue().getConsulta(j).getTituloTema()).setConsulta(set.getValue().getConsulta(j));
                    } else {
                        ArrayListConsultas auxConsultas = new ArrayListConsultas();
                        auxConsultas.setConsulta(set.getValue().getConsulta(j));
                        auxConsultasBinarias.put(set.getValue().getConsulta(j).getTituloTema(), auxConsultas);
                    }
                }
            }

        }
        return auxConsultasBinarias;
    }

    public HashMap<String, ArrayListConsultas> getConsultasMultiples() {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        HashMap<String, ArrayListConsultas> auxConsultasMultiples = new HashMap();
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {

                if (set.getValue().getConsulta(j) instanceof ConsultaMultiple) {

                    if (auxConsultasMultiples.containsKey(set.getValue().getConsulta(j).getTituloTema())) {
                        this.consultas.get(set.getValue().getConsulta(j).getTituloTema()).setConsulta(set.getValue().getConsulta(j));
                    } else {
                        ArrayListConsultas auxConsultas = new ArrayListConsultas();
                        auxConsultas.setConsulta(set.getValue().getConsulta(j));
                        auxConsultasMultiples.put(set.getValue().getConsulta(j).getTituloTema(), auxConsultas);
                    }

                }
            }

        }
        return auxConsultasMultiples;
    }

    public String[][] MatrizConsulta() {
        String matriz[][] = new String[tamMapa()][11];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        RespuestaMultiple respuestsMultiple = new RespuestaMultiple();
        RespuestaBinaria respuestaBinaria = new RespuestaBinaria();
        int i = 0;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {

            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                matriz[i][0] = set.getKey(); // TEMA
                matriz[i][1] = Integer.toString(set.getValue().getConsulta(j).getIdConsulta()); // ID
                matriz[i][2] = set.getValue().getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[i][3] = set.getValue().getConsulta(j).getDescripcion(); // DESCRIPCION
                if (set.getValue().getConsulta(j) instanceof ConsultaMultiple) {
                    respuestsMultiple = (RespuestaMultiple) set.getValue().getConsulta(j).getRespuestasConsulta();
                    matriz[i][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
                    matriz[i][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
                    matriz[i][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
                    matriz[i][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
                    matriz[i][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   
                }
                if (set.getValue().getConsulta(j) instanceof ConsultaBinaria) {
                    respuestaBinaria = (RespuestaBinaria) set.getValue().getConsulta(j).getRespuestasConsulta();
                    matriz[i][9] = Integer.toString(respuestaBinaria.getLikes());
                    matriz[i][10] = Integer.toString(respuestaBinaria.getDisLikes());
                }
                i++;
            }

        }
        return matriz;
    }

    public boolean existeIdEnConsultas(String key, int idBuscada) {
        if (consultas.get(key) == null) {
            return false;
        }
        for (int i = 0; i < consultas.get(key).sizeConsultas(); i++) {
            if (consultas.get(key).getConsulta(i).getIdConsulta() == idBuscada) {
                return true;
            }
        }
        return false;
    }

    public Consulta buscarConsulta(String key, int idBuscada) {
        for (int i = 0; i < consultas.get(key).sizeConsultas(); i++) {
            if (consultas.get(key).getConsulta(i).getIdConsulta() == idBuscada) {
                return consultas.get(key).getConsulta(i);
            }
        }
        return null;
    }

    public void editarConsulta(String temaBuscado, int idConsultaBuscada, String tituloNuevo, String descripcionNueva) {
        if (!tituloNuevo.equals(null)) {
            consultas.get(temaBuscado).getConsultaPorId(idConsultaBuscada).setTituloConsulta(tituloNuevo);
        }
        if (!descripcionNueva.equals(null)) {
            consultas.get(temaBuscado).getConsultaPorId(idConsultaBuscada).setDescripcion(descripcionNueva);
        }
    }

    public ArrayListConsultas getConsultasPorTema(String TemaBuscado) {
        return consultas.get(TemaBuscado);
    }

    public ArrayListConsultas getConsultasBinariasPorTema(String TemaBuscado) {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasBinarias();
        ArrayListConsultas auxArrayListConsultasBinarias = new ArrayListConsultas();
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                if (set.getValue().getConsulta(j).getTituloTema().equals(TemaBuscado)) {
                    if (set.getValue().getConsulta(j) instanceof ConsultaBinaria) {
                        auxArrayListConsultasBinarias.setConsulta(set.getValue().getConsulta(j));
                
                    }
                }

            }
        }
        return auxArrayListConsultasBinarias;
    }

    public ArrayListConsultas getConsultasMultiplesPorTema(String TemaBuscado){
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasMultiples();
        ArrayListConsultas auxArrayListConsultasMultiples = new ArrayListConsultas();
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                if (set.getValue().getConsulta(j).getTituloTema().equals(TemaBuscado)) {
                    if (set.getValue().getConsulta(j) instanceof ConsultaMultiple) {
                        auxArrayListConsultasMultiples.setConsulta(set.getValue().getConsulta(j));
                    }
                }

            }
        }
        return auxArrayListConsultasMultiples;
    }
    
    public void agregarRespuesta(String tema, String id, boolean tipoRespuesta) {
        ArrayListConsultas auxConsultas = getConsultasBinariasPorTema(tema);
        int idBuscanda = Integer.parseInt(id);
        for (int i = 0; i < auxConsultas.sizeConsultas(); i++) {
            if (auxConsultas.getConsulta(i).getIdConsulta() == idBuscanda) {
                auxConsultas.getConsulta(i).setRespuestasConsulta(tipoRespuesta);
            }
        }
    }
    
    public void agregarRespuesta(String tema, String id, int tipoRespuesta) {
        ArrayListConsultas auxConsultas = getConsultasMultiplesPorTema(tema);
        int idBuscanda = Integer.parseInt(id);
        for (int i = 0; i < auxConsultas.sizeConsultas(); i++) {
            if (auxConsultas.getConsulta(i).getIdConsulta() == idBuscanda) {
                auxConsultas.getConsulta(i).setRespuestasConsulta(tipoRespuesta);
            }
        }
    }
    public void EliminarTema(String tema) {
        consultas.remove(tema);
    }

    public void EditarTema(String temaAEditar, String temaEditado) {
        ArrayListConsultas auxConsultas = consultas.get(temaAEditar);
        auxConsultas.editarTemaConsultas(temaEditado);
        consultas.remove(temaAEditar);
        for (int i = 0; i < auxConsultas.sizeConsultas(); i++) {
            agregarConsulta(auxConsultas.getConsulta(i));
        }
    }

    public void AgregarTema(String nuevoTema) {
        ArrayListConsultas auxConsultas = new ArrayListConsultas();
        consultas.put(nuevoTema, auxConsultas);
    }

    public String[][] matrizTemas() {
        String matriz[][] = new String[tamMapa()][6];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        int i = 0;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            matriz[i][0] = set.getKey(); // TEMA
            i++;
        }
        return matriz;
    }

    public String[][] matrizTemasEId(String tema, String id) {

        String matriz[][] = new String[tamMapa()][11];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        Consulta ConsultaFiltrada;
        RespuestaMultiple respuestsMultiple = new RespuestaMultiple();
        RespuestaBinaria respuestaBinaria = new RespuestaBinaria();
        ConsultaFiltrada = motrarConsultasPorTema(tema).getConsultaPorId(id);
        matriz[0][0] = Integer.toString(ConsultaFiltrada.getIdConsulta());
        matriz[0][1] = ConsultaFiltrada.getTituloTema();
        matriz[0][2] = ConsultaFiltrada.getTituloConsulta();
        matriz[0][3] = ConsultaFiltrada.getDescripcion();

        if (ConsultaFiltrada instanceof ConsultaMultiple) {
            respuestsMultiple = (RespuestaMultiple) ConsultaFiltrada.getRespuestasConsulta();
            matriz[0][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
            matriz[0][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
            matriz[0][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
            matriz[0][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
            matriz[0][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   
        }
        if (ConsultaFiltrada instanceof ConsultaBinaria) {
            respuestaBinaria = (RespuestaBinaria) ConsultaFiltrada.getRespuestasConsulta();
            matriz[0][9] = Integer.toString(respuestaBinaria.getLikes());
            matriz[0][10] = Integer.toString(respuestaBinaria.getDisLikes());
        }

        return matriz;
    }

    public String[][] matrizFiltrada(String tema1, String tema2) {
        String matriz[][] = new String[tamMapa()][11];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        ArrayListConsultas arraylistFiltrado;
        arraylistFiltrado = motrarConsultasPorTema(tema1);
        RespuestaMultiple respuestsMultiple = new RespuestaMultiple();
        RespuestaBinaria respuestaBinaria = new RespuestaBinaria();
        int k = 0;
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < arraylistFiltrado.sizeConsultas(); j++) {
                matriz[k][0] = arraylistFiltrado.getConsulta(j).getTituloTema();
                matriz[k][1] = Integer.toString(arraylistFiltrado.getConsulta(j).getIdConsulta()); // ID
                matriz[k][2] = arraylistFiltrado.getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[k][3] = arraylistFiltrado.getConsulta(j).getDescripcion(); // DESCRIPCION
                if (arraylistFiltrado.getConsulta(j) instanceof ConsultaMultiple) {
                    respuestsMultiple = (RespuestaMultiple) arraylistFiltrado.getConsulta(j).getRespuestasConsulta();
                    matriz[k][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
                    matriz[k][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
                    matriz[k][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
                    matriz[k][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
                    matriz[k][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   
                }
                if (arraylistFiltrado.getConsulta(j) instanceof ConsultaBinaria) {
                    respuestaBinaria = (RespuestaBinaria) arraylistFiltrado.getConsulta(j).getRespuestasConsulta();
                    matriz[k][9] = Integer.toString(respuestaBinaria.getLikes());
                    matriz[k][10] = Integer.toString(respuestaBinaria.getDisLikes());
                }
                k++;
            }

            arraylistFiltrado = motrarConsultasPorTema(tema2);
        }
        return matriz;
    }
}
