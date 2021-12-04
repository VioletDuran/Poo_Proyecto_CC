/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.IOException;

/**
 * Clase de tipo Interfaz:
 * Utilizada para los tipos de reportes.
 */
public interface ReportableStrategy {
    public void generarTxt() throws IOException;;
    public void generarExcel() throws IOException;;
}
