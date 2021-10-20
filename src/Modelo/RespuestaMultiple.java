/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Zay
 */
public class RespuestaMultiple {
    
    private int mFavor;
    private int aFavor;
    private int neutro;
    private int contra;
    private int mContra;

    public RespuestaMultiple() {
        this.mFavor = 0;
        this.aFavor = 0;
        this.neutro = 0;
        this.contra = 0;
        this.mContra = 0;
    }

    public int getmFavor() {
        return mFavor;
    }

    public void setmFavor() {
        this.mFavor++;
    }

    public int getaFavor() {
        return aFavor;
    }

    public void setaFavor() {
        this.aFavor++;
    }

    public int getNeutro() {
        return neutro;
    }

    public void setNeutro() {
        this.neutro ++;
    }

    public int getContra() {
        return contra;
    }

    public void setContra() {
        this.contra ++;
    }

    public int getmContra() {
        return mContra;
    }

    public void setmContra() {
        this.mContra ++;
    }
}
