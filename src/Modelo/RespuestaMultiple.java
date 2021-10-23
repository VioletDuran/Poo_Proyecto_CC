/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase Respuesta Multiple.
 */
public class RespuestaMultiple {
    /**
     * Atributos:
     * Contadores para los distintos tipo de eleccion posibles.
     */
    private int mFavor;
    private int aFavor;
    private int neutro;
    private int contra;
    private int mContra;

    /**
     * Constructor:
     * Se inicializan los contadores en 0.
     */
    public RespuestaMultiple() {
        this.mFavor = 0;
        this.aFavor = 0;
        this.neutro = 0;
        this.contra = 0;
        this.mContra = 0;
    }
    /**
     * Metodo getmFavor:
     * @return Se retorna los mFavor.
     */

    public int getmFavor() {
        return mFavor;
    }

    /**
     * Metodo setmFavor
     * Se suma uno al contador respectivo.
     */
    public void setmFavor() {
        this.mFavor++;
    }

     /**
     * Metodo getaFavor:
     * @return Se retorna los aFavor.
     */
    public int getaFavor() {
        return aFavor;
    }

     /**
     * Metodo setaFavor
     * Se suma uno al contador respectivo.
     */
    public void setaFavor() {
        this.aFavor++;
    }

     /**
     * Metodo getNeutro:
     * @return Se retorna los neutro.
     */
    public int getNeutro() {
        return neutro;
    }

     /**
     * Metodo setNeutro
     * Se suma uno al contador respectivo.
     */
    public void setNeutro() {
        this.neutro ++;
    }

     /**
     * Metodo getContra:
     * @return Se retorna los contra.
     */
    public int getContra() {
        return contra;
    }

     /**
     * Metodo setContra
     * Se suma uno al contador respectivo.
     */
    public void setContra() {
        this.contra ++;
    }

     /**
     * Metodo getmContra:
     * @return Se retorna los mContra.
     */
    public int getmContra() {
        return mContra;
    }
    
    /**
     * Metodo setmContra
     * Se suma uno al contador respectivo.
     */
    public void setmContra() {
        this.mContra ++;
    }
}
