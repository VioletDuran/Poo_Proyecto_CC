/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sergio
 */
public class RespuestaBinaria {

    private int likes;
    private int disLikes;

    public RespuestaBinaria(){
        likes = 0;
        disLikes = 0;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes() {
        this.likes++;
    }

    public int getDisLikes() {
        return disLikes;
    }

    public void setDisLikes( ) {
        this.disLikes++;
    }
}