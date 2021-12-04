/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase para excepcion de Tema
 */
public class ErrorTemaRepetidoException extends Exception {
    /**
     * Constructor
     */
    public ErrorTemaRepetidoException(){
        super("Tema Repetido!");
    }
    
}
