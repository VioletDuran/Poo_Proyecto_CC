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
 * Clase ManejoDeColecciones: Clase encargada de manejar todas las colecciones
 * de clase dentro del programa, realizando funciones de gestion relacionadas
 * con estas estructuras.
 */
public class ManejoDeColecciones {

    /**
     * Atributos de la clase: Se tiene de atributo para esta clase un HashMap el
     * cual contiene una key de String, la cual contiene el tema y una ArrayList
     * la cual contiene las consultas de ese tema.
     */
    private HashMap<String, ArrayListConsultas> consultas;

    /**
     * Constructor: Se instancia el HashMap de la clase.
     */
    public ManejoDeColecciones() {
        this.consultas = new HashMap();
    }

    /**
     * Metodo generarConsultasBinarias: Se leen las consultas binarias de su
     * respectivo excel y se guardan en el hashmap.
     */
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

    /**
     * Metodo generarConsultasBinarias: Se leen las consultas binarias de su
     * respectivo excel y se guardan en el hashmap.
     */
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
    
    /**
     * Metodo agregarConsulta: Ingresa una consulta al HashMap, si este existe
     * lo ingresa al ArrayList, sino crea un ArrayList y lo ingresa.
     *
     * @param nuevaConsulta: Consulta a ingresar.
     */
    public void agregarConsulta(Consulta nuevaConsulta) {
        if (this.consultas.containsKey(nuevaConsulta.getTituloTema())) {
            this.consultas.get(nuevaConsulta.getTituloTema()).setConsulta(nuevaConsulta);
        } else {
            ArrayListConsultas auxConsultas = new ArrayListConsultas();
            auxConsultas.setConsulta(nuevaConsulta);
            this.consultas.put(nuevaConsulta.getTituloTema(), auxConsultas);
        }
    }

    /**
     * Metodo agregarConsulta: Crea una consulta atraves de los datos ingresados
     * para luego llamar a la funcion agregarConsulta e ingresarla la HashMap.
     *
     * @param tema: Tema de la consulta a ingresar.
     * @param idConsulta: id de la consulta a ingresar.
     * @param tituloConsulta: titulo de la consulta a ingresar.
     * @param descripcionConsulta: descripcion de la consulta a ingresar.
     * @param tipoConsulta: Booleano para saber si la consulta es Multiple o
     * Binaria.
     * @throws Modelo.ErrorIdException
     */
    public void agregarConsulta(String tema, int idConsulta, String tituloConsulta, String descripcionConsulta, boolean tipoConsulta) throws ErrorIdException {
        if(this.existeIdEnConsultas(tema, Integer.toString(idConsulta))){
            throw new ErrorIdException();
        } else {
            if (tipoConsulta == true) {
                Consulta auxConsulta = new ConsultaBinaria();
                auxConsulta.setTituloTema(tema);
                auxConsulta.setIdConsulta(idConsulta);
                auxConsulta.setTituloConsulta(tituloConsulta);
                auxConsulta.setDescripcion(descripcionConsulta);
                agregarConsulta(auxConsulta);
            } else {
                Consulta auxConsulta = new ConsultaMultiple();
                auxConsulta.setTituloTema(tema);
                auxConsulta.setIdConsulta(idConsulta);
                auxConsulta.setTituloConsulta(tituloConsulta);
                auxConsulta.setDescripcion(descripcionConsulta);
                agregarConsulta(auxConsulta);
            }
        }
    }

    /**
     * Metodo existeEnMapaConsulta: Se retorna si booleano para ver si existe la
     * opcion ingresada en el HashMap.
     *
     * @param opcion: Key (String) a buscar en el HashMap.
     * @return Booleano para saber si encuentra dentro.
     */
    public boolean existeEnMapaConsulta(String opcion) {
        return consultas.containsKey(opcion);
    }

    /**
     * Metodo getArray: Retorna el ArrayList de la consulta atraves de su Key.
     *
     * @param key: Key (String) a buscar en el HashMap.
     * @return Retorta el ArrayList de consultas del tema ingresado.
     */
    public ArrayListConsultas getArrayCopia(String key) {
        return this.consultas.get(key).getCopiaArrayList();
    }

    /**
     * Metodo tamMapa: Se usa para saber cuantos ArrayList contiene el HashMap.
     *
     * @return la cantidad de ArrayList contenidos en el HashMap.
     */
    public int tamMapa() {
        int contador = 0;
        for (Map.Entry<String, ArrayListConsultas> set : consultas.entrySet()) {
            contador += set.getValue().sizeConsultas();
        }
        return contador;
    }

    /**
     * Metodo getConsultas: Se retorna una copia del HashMap original para
     * retornarlo.
     *
     * @return Se retorna una copia del HashMap original.
     */
    public HashMap<String, ArrayListConsultas> getConsultas() {
        HashMap<String, ArrayListConsultas> aux = new HashMap();
        aux.putAll(this.consultas);
        return aux;
    }

    /**
     * Metodo getConsultasBinarias: Se retorna una copia del HashMap original
     * para retornarlo pero solamente de las consultas Binarias.
     *
     * @return Se retorna una copia del HashMap original pero solamente de las
     * consultas Binarias.
     */
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

    /**
     * Metodo getConsultasMultiples: Se retorna una copia del HashMap original
     * para retornarlo pero solamente de las consultas Multiple.
     *
     * @return Se retorna una copia del HashMap original pero solamente de las
     * consultas Multiple.
     */
    public HashMap<String, ArrayListConsultas> getConsultasMultiples() {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        HashMap<String, ArrayListConsultas> auxConsultasMultiples = new HashMap();
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {

                if (set.getValue().getConsulta(j) instanceof ConsultaMultiple) {

                    if (auxConsultasMultiples.containsKey(set.getValue().getConsulta(j).getTituloTema())) {
                        auxConsultasMultiples.get(set.getValue().getConsulta(j).getTituloTema()).setConsulta(set.getValue().getConsulta(j));
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

     /**
     * Metodo matrizConsultasSimples: Metodo para realizar la matriz de consultas simples.
     * return matriz: se retorna la matriz llena.
     * */
    public String[][] matrizConsultasSimples(String opcion) {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasBinarias();
        RespuestaBinaria respuestaBinaria;
        String matriz[][] = new String[contarConsultasEnMapa(auxMapa) + 1][6];
        matriz[0][0] = "Tema";
        matriz[0][1] = "ID";
        matriz[0][2] = "Titulo Consulta";
        matriz[0][3] = "Descripcion";
        matriz[0][4] = "Likes";
        matriz[0][5] = "Dislikes";
        
        int i = 1;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {

            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                matriz[i][0] = set.getKey(); // TEMA
                matriz[i][1] = Integer.toString(set.getValue().getConsulta(j).getIdConsulta()); // ID
                matriz[i][2] = set.getValue().getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[i][3] = set.getValue().getConsulta(j).getDescripcion(); // DESCRIPCION

                respuestaBinaria = (RespuestaBinaria) set.getValue().getConsulta(j).getRespuestasConsulta();
                matriz[i][4] = Integer.toString(respuestaBinaria.getLikes());
                matriz[i][5] = Integer.toString(respuestaBinaria.getDisLikes());

                i++;
            }

        }
        return matriz;
    }
    
     /**
     * Metodo matrizConsultasMultiple: Metodo para realizar la matriz de consultas multiples.
     * return matriz: se retorna la matriz llena.
     * */
    public String[][] matrizConsultasSimples(){
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasBinarias();
        String matriz[][] = new String[contarConsultasEnMapa(auxMapa)][6];
        RespuestaBinaria respuestaBinaria;
        int i = 0;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                matriz[i][0] = set.getKey(); // TEMA
                matriz[i][1] = Integer.toString(set.getValue().getConsulta(j).getIdConsulta()); // ID
                matriz[i][2] = set.getValue().getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[i][3] = set.getValue().getConsulta(j).getDescripcion(); // DESCRIPCION

                respuestaBinaria = (RespuestaBinaria) set.getValue().getConsulta(j).getRespuestasConsulta();
                matriz[i][4] = Integer.toString(respuestaBinaria.getLikes());
                matriz[i][5] = Integer.toString(respuestaBinaria.getDisLikes());

                i++;
            }

        }
        return matriz;
    }

    /**
     * Metodo matrizConsultasMultiple: Metodo para realizar la matriz de consultas multiples.
     * return matriz: se retorna la matriz llena.
     * */
    public String[][] matrizConsultasMultiple() {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasMultiples();
        String matriz[][] = new String[contarConsultasEnMapa(auxMapa)][9];
        RespuestaMultiple respuestsMultiple;
        int i = 0;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {

            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                matriz[i][0] = set.getKey(); // TEMA
                matriz[i][1] = Integer.toString(set.getValue().getConsulta(j).getIdConsulta()); // ID
                matriz[i][2] = set.getValue().getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[i][3] = set.getValue().getConsulta(j).getDescripcion(); // DESCRIPCION

                respuestsMultiple = (RespuestaMultiple) set.getValue().getConsulta(j).getRespuestasConsulta();
                matriz[i][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
                matriz[i][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
                matriz[i][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
                matriz[i][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
                matriz[i][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   

                i++;
            }
        }
        return matriz;
    }
    
  
    /**
     * Metodo matrizConsultasMultiple: Metodo para realizar la matriz de consultas multiples.
     * @param opcion: opcion para ver cual es la sobreescritura.
     * return matriz: se retorna la matriz llena.
     * */
    public String[][] matrizConsultasMultiple(String opcion) {
        HashMap<String, ArrayListConsultas> auxMapa = getConsultasMultiples();
        RespuestaMultiple respuestsMultiple;
        String matriz[][] = new String[contarConsultasEnMapa(auxMapa) + 1][9];

        matriz[0][0] = "Tema";
        matriz[0][1] = "ID";
        matriz[0][2] = "Titulo Consulta";
        matriz[0][3] = "Descripcion";
        matriz[0][4] = "Muy a favor";
        matriz[0][5] = "A favor";
        matriz[0][6] = "Neutro";
        matriz[0][7] = "En contra";
        matriz[0][8] = "Muy en contra";
        
        int i = 1;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {

            for (int j = 0; j < set.getValue().sizeConsultas(); j++) {
                matriz[i][0] = set.getKey(); // TEMA
                matriz[i][1] = Integer.toString(set.getValue().getConsulta(j).getIdConsulta()); // ID
                matriz[i][2] = set.getValue().getConsulta(j).getTituloConsulta(); // TITULO CONSULTA
                matriz[i][3] = set.getValue().getConsulta(j).getDescripcion(); // DESCRIPCION

                respuestsMultiple = (RespuestaMultiple) set.getValue().getConsulta(j).getRespuestasConsulta();
                matriz[i][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
                matriz[i][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
                matriz[i][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
                matriz[i][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
                matriz[i][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   

                i++;
            }
        }
        return matriz;
    }
    
    /**
     * Metodo consultarConsultarEnMapa: Metodo para contar consultas totales de mapa.
     * @param mapa: hashmap para poder contar las consultas.
     * @return contador: el total de consultas contadas.
     */    
    public int contarConsultasEnMapa(HashMap<String, ArrayListConsultas> mapa){
        int contador = 0;
        for (Map.Entry<String, ArrayListConsultas> set : mapa.entrySet()) {
            contador = contador + set.getValue().sizeConsultas();
        }
        return contador;
    }

    /**
     * Metodo existeIdEnConsultas: Se busca si existe la Key y el id buscada
     * dentro del HashMap.
     * @param key: String del tema a buscar.
     * @param idBuscada: id para buscar dentro del Arraylist para ver si existe.
     * @return Booleano dependiendo si es verdadero o falso.
     */
    public boolean existeIdEnConsultas(String key, String idBuscada) {
        
        if(consultas.get(key) == null || consultas.get(key).getConsultaPorId(idBuscada) == null)
            return false;
        else{
            return true;
        } 
    }

    /**
     * Metodo editarConsulta: Se busca la consulta deseada con la Key y su
     * respectiva id para luego ser modificada.
     *
     * @param temaBuscado: String del tema a buscar.
     * @param idConsultaBuscada: id para buscar dentro del Arraylist del
     * HashMap.
     * @param tituloNuevo: String del tema para remplazar la anterior.
     * @param descripcionNueva: descripcion para remplazar la anterior.
     */
    public void editarConsulta(String temaBuscado, int idConsultaBuscada, String tituloNuevo, String descripcionNueva){
        consultas.get(temaBuscado).editaTituloYDescripcion(tituloNuevo, descripcionNueva , idConsultaBuscada);    
    }

    /**
     * Metodo getConsultasPorTema: Se busca el Arraylist dentro del HashMap con
     * el tema deseado para retornarlo.
     *
     * @param TemaBuscado: String del tema a buscar.
     * @return ArrayList de consultas del tema deseado.
     */
    public ArrayListConsultas getConsultasPorTema(String TemaBuscado) {
        return consultas.get(TemaBuscado).getCopiaArrayList();
    }

    /**
     * Metodo getConsultasBinariasPorTema: Se busca el Arraylist de consultas
     * Binarias dentro del HashMap con el tema deseado para retornarlo.
     *
     * @param TemaBuscado: String del tema a buscar.
     * @return ArrayList de consultas Binarias de consultas del tema deseado.
     */
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

    /**
     * Metodo getConsultasMultiplesPorTema: Se busca el Arraylist de consultas
     * Multiples dentro del HashMap con el tema deseado para retornarlo.
     *
     * @param TemaBuscado: String del tema a buscar.
     * @return ArrayList de consultas Multiples de consultas del tema deseado.
     */
    public ArrayListConsultas getConsultasMultiplesPorTema(String TemaBuscado) {
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

    /**
     * Metodo agregarRespuesta: Se agrega la consulta al arraylist dependiendo
     * si es Multiple o Binaria.
     *
     * @param tema: String del tema a ingresar.
     * @param id: id de la consulta para ingresar.
     * @param tipoRespuesta: Booleano para saber si es una consulta Multiple o
     * Binaria.
     */
    public void agregarRespuesta(String tema, String id, boolean tipoRespuesta) {
        ArrayListConsultas auxConsultas = getConsultasBinariasPorTema(tema);
        int idBuscanda = Integer.parseInt(id);
        for (int i = 0; i < auxConsultas.sizeConsultas(); i++) {
            if (auxConsultas.getConsulta(i).getIdConsulta() == idBuscanda) {
                auxConsultas.getConsulta(i).setRespuestasConsulta(tipoRespuesta);
            }
        }
    }

    /**
     * Metodo agregarRespuesta: Se agrega la consulta al arraylist dependiendo
     * si es Multiple o Binaria.
     *
     * @param tema: String del tema a ingresar.
     * @param id: id de la consulta para ingresar.
     * @param tipoRespuesta: Int para saber si es una consulta Multiple o
     * Binaria.
     */
    public void agregarRespuesta(String tema, String id, int tipoRespuesta) {
        ArrayListConsultas auxConsultas = getConsultasMultiplesPorTema(tema);
        int idBuscanda = Integer.parseInt(id);
        for (int i = 0; i < auxConsultas.sizeConsultas(); i++) {
            if (auxConsultas.getConsulta(i).getIdConsulta() == idBuscanda) {
                auxConsultas.getConsulta(i).setRespuestasConsulta(tipoRespuesta);
            }
        }
    }

    /**
     * Metodo EliminarTema: Se elimina el tema ingresado.
     * @param tema: String del tema a eliminar.
     */
    public void EliminarTema(String tema) {
        consultas.remove(tema);
    }

    /**
     * Metodo EditarTema: Se edita el tema ingresado.
     * @param temaAEditar: String del tema a editar.
     * @param temaEditado: String del tema para reemplazar.
     */
    public void EditarTema(String temaAEditar, String temaEditado) throws ErrorTemaRepetidoException{
        
        if(consultas.get(temaEditado) != null){
            throw new ErrorTemaRepetidoException();
        }
        consultas.get(temaAEditar).editarTemaConsultas(temaEditado);
        ArrayListConsultas auxConsultas = consultas.get(temaAEditar).getCopiaArrayList();
        consultas.remove(temaAEditar);
        consultas.put(temaEditado, auxConsultas);
    }

    /**
     * Metodo AgregarTema: Se agrega un tema nuevo.
     * @param nuevoTema: String del tema a agregar.
     */
    public void AgregarTema(String nuevoTema) {
        if(!consultas.containsKey(nuevoTema)){
            ArrayListConsultas auxConsultas = new ArrayListConsultas();
            consultas.put(nuevoTema, auxConsultas);
        }
    }

    /**
     * Metodo matrizTemas: Se busca todos los temas del HashMap y se crea una
     * matriz.
     * @return Se retorna la matriz llena.
     */
    public String[][] matrizTemas() {
        String matriz[][] = new String[consultas.size()][6];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        int i = 0;
        for (Map.Entry<String, ArrayListConsultas> set : auxMapa.entrySet()) {
            matriz[i][0] = set.getKey(); // TEMA
            i++;
        }
        return matriz;
    }

    /**
     * Metodo MatrizMasVotos: Se realiza la matriz con la consulta con mas votos
     * @param Consulta: Consulta con mas votos
     * @return Se retorna la matriz llena.
     */
    public String[][] matrizMasVotos(Consulta auxConsulta) {
        if(auxConsulta == null){
            return null;
        }
        String matriz[][];
        
        RespuestaMultiple respuestsMultiple;
        RespuestaBinaria respuestaBinaria;
        if (auxConsulta instanceof ConsultaMultiple) {
            
            matriz = new String[1][9];
            respuestsMultiple = (RespuestaMultiple) auxConsulta.getRespuestasConsulta();

            matriz[0][0] = Integer.toString(auxConsulta.getIdConsulta());
            matriz[0][1] = auxConsulta.getTituloTema();
            matriz[0][2] = auxConsulta.getTituloConsulta();
            matriz[0][3] = auxConsulta.getDescripcion();
            matriz[0][4] = Integer.toString(respuestsMultiple.getmFavor()); // Opiniones Muy a favor 
            matriz[0][5] = Integer.toString(respuestsMultiple.getaFavor()); // Opiniones a Favor
            matriz[0][6] = Integer.toString(respuestsMultiple.getNeutro()); // Opiniones Neutras
            matriz[0][7] = Integer.toString(respuestsMultiple.getContra()); // Opiniones en contra
            matriz[0][8] = Integer.toString(respuestsMultiple.getmContra()); // Opiniones muy en contra/-*/   
        }
        else{
            
            matriz = new String[1][6];
            respuestaBinaria = (RespuestaBinaria) auxConsulta.getRespuestasConsulta();
            
            matriz[0][0] = Integer.toString(auxConsulta.getIdConsulta());
            matriz[0][1] = auxConsulta.getTituloTema();
            matriz[0][2] = auxConsulta.getTituloConsulta();
            matriz[0][3] = auxConsulta.getDescripcion();
            matriz[0][4] = Integer.toString(respuestaBinaria.getLikes());
            matriz[0][5] = Integer.toString(respuestaBinaria.getDisLikes());
        }
        return matriz;
    }

    /**
     * Metodo matrizFiltrada : Se los temas dentro del HashMap y se realiza una
     * matriz.
     * @param tema1: String la cual es la key a buscar dentro del HashMap.
     * @param tema2: String la cual es la key a buscar dentro del HashMap.
     * @return Se retorna la matriz llena.
     */
    public String[][] matrizFiltrada(String tema1, String tema2) {
        int tam = contarConsultasPorTema(tema1) + contarConsultasPorTema(tema2);
        String matriz[][] = new String[tam][11];
        HashMap<String, ArrayListConsultas> auxMapa = getConsultas();
        ArrayListConsultas arraylistFiltrado;
        arraylistFiltrado = getArrayCopia(tema1);
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

            arraylistFiltrado = getArrayCopia(tema2);
        }
        return matriz;
    }
    
    /**
     * Metodo contarConsultasPorTema: metodo para contar las consultas totales por tema
     * @param tema: contar por temas sus consultas.
     * @return la cantidad de consultas del tema.
     */
    public int contarConsultasPorTema(String tema){
        return consultas.get(tema).sizeConsultas();    
    }
    
    /**Metodo contarVotosBinarios: Se recibe la consulta Binaria para contar votos
     * @param consultaAContar: Consulta binaria para contar votos
     * @return se retorna el contador de votos.
     */
    public int contarVotosBinarios(ConsultaBinaria consultaAContar){
        int contadorVotos = 0;
        RespuestaBinaria aux = ((RespuestaBinaria)consultaAContar.getRespuestasConsulta());
        contadorVotos = aux.getLikes() + aux.getDisLikes();
        return contadorVotos;
    }
    
    /**Metodo contarVotosMultiples: 
     * @param consultaAContar: recibe la consulta Multiple para contar votos
     * @return Se retorna la cantidad total de votos.
     */
    public int contarVotosMultiples(ConsultaMultiple consultaAContar){
        int contadorVotos = 0;
        RespuestaMultiple aux = ((RespuestaMultiple)consultaAContar.getRespuestasConsulta());
        contadorVotos = aux.getContra() + aux.getNeutro() + aux.getaFavor() + aux.getmContra() + aux.getmFavor();
        return contadorVotos;
    }
    
    /** Metodo ConsultaMasVotada: Metodo para realizar la matriz con la consulta mas votada.
     * @param TemaBuscado: Se recibe el string del tema buscado.
     * @return Se retorna la matriz llena en caso de que se encuentre el mas votado, si no se retorna null.
     */
    public String[][] ConsultaMasVotada(String TemaBuscado){
        String[][] matriz;
        ArrayListConsultas auxConsultaTema = this.consultas.get(TemaBuscado);
        int contadorTotalVotos = 0;
        Consulta ConsultaMayorVotos = null;
        for (int i = 0; i < auxConsultaTema.sizeConsultas(); i++) {
            if(auxConsultaTema.getConsulta(i) instanceof ConsultaBinaria){
                if(contarVotosBinarios((ConsultaBinaria) auxConsultaTema.getConsulta(i)) > contadorTotalVotos){
                    contadorTotalVotos = contarVotosBinarios((ConsultaBinaria) auxConsultaTema.getConsulta(i));
                    ConsultaMayorVotos = auxConsultaTema.getConsulta(i);
                }
            }
            if(auxConsultaTema.getConsulta(i) instanceof ConsultaMultiple){
                if(contarVotosMultiples((ConsultaMultiple) auxConsultaTema.getConsulta(i)) > contadorTotalVotos){
                    contadorTotalVotos = contarVotosMultiples((ConsultaMultiple) auxConsultaTema.getConsulta(i));
                    ConsultaMayorVotos = auxConsultaTema.getConsulta(i);
                }
            }
        }
        matriz = matrizMasVotos(ConsultaMayorVotos);
        if(matriz == null){
            return null;
        }
        return matriz;
    } 
  
    /** Metodo eliminarConsulta: metodo realizado para eliminar una consulta
     * @param tema: Se recibe el tema a eliminar
     * @param id: Se recibe el id a eliminar
     */
    public void eliminarConsulta(String tema , int id ){
        this.consultas.get(tema).removeConsulta(id);
    }
    
    /** Metodo buscarConsultaPorId: metodo realizado para buscar una consulta especifica por id
     * @param tema: Se recibe el tema a buscar.
     * @param id: Se recibe el id a buscar.
     * @return Se retorna la consulta deseada.
     */
    public Consulta buscarConsultaPorId(String tema , String id){
        return consultas.get(tema).getConsultaPorId(id);
    }
}