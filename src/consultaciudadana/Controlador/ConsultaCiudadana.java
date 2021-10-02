/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Controlador;

import consultaciudadana.Vista.*;
import java.io.*;

/*Integrantes: 
 *        Sergio Arriagada 
 *        Miguel Guerrero Ruiz
 *        Sebastián Moyano Riveros
 *        Diego Duran	
 */

/**
 * Clase ConsultaCiudadana:
 * Clase main para crear Map,ArrayList y llenar datos.
 * @author Violet
 */
public class ConsultaCiudadana {
    
     public static void main(String [] args)throws IOException{
        ManejoDeColleciones llamar = new ManejoDeColleciones();
        llamar.generarTemas();
        Menu llamadoMenu = new Menu(llamar);
        llamadoMenu.mostrarMenu();
    }
   
}
    
    




