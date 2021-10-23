/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;
import java.io.*;

/**
 * Clase ConsultaCiudadana:
 * Se inicializa el programa obteniendo las entradas atraves de ManejoDeColecciones.
 */
public class ConsultaCiudadana {
    
    /**
     * Metodo main para iniciar el programa, inicializar manejo de colecciones y las ventanas graficas.
     * @param args
     * @throws IOException 
     */
    
    public static void main(String [] args) throws IOException{
        ManejoDeColecciones manejo = new ManejoDeColecciones();
        manejo.generarConsultasBinarias();
        manejo.generarConsultasMultiples();
        MenuPrincipal llamadoMenu = new MenuPrincipal(manejo);
        llamadoMenu.setVisible(true);
    }
}
