/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase de tipo RespuetaBinaria
 */
public class RespuestaBinaria {
    /**
     * Atributos:
     * likes: Int contabilizador de Likes.
     * disLikes: Int contabilizador de disLikes.
     */

    private int likes;
    private int disLikes;
    

    /**
     * Constructor:
     * Se inicializan las variables en 0.
     */
    public RespuestaBinaria(){
        likes = 0;
        disLikes = 0;
    }

    /**
     * Metodo getLikes:
     * @return Se retornan los Likes.
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Metodo setLikes:
     * Se suma un Like al contabilizador.
     */
    public void setLikes() {
        this.likes++;
    }
    
    /**
     * Metodo getDisLikes:
     * @return Se retornan los DisLikes.
     */
    public int getDisLikes() {
        return disLikes;
    }
    
    /**
     * Metodo setDisLikes:
     * Se suma un DisLike al contabilizador.
     */
    public void setDisLikes( ) {
        this.disLikes++;
    }
}