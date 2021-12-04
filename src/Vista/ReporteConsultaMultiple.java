
//JAVA DOC COMPLETO EN ESTA FUNCION XD ESTA COPIADA 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Clase Reporte Consulta:
 * Clase especializada en generar el txt y excel de las consultas el cual usa la intefaz de Reportable.
 *
 */
public class ReporteConsultaMultiple implements ReportableStrategy {
    
    /**
     * Atributos:
     * tablaConsultas: Tabla de consultas.
     */
    private String [][] matrizConsulta;

    /**
     * Constructor:
     * Se inicializan la tablaConsultaMultiple.
     * @param matrizConsulta: Tabla a ocupar.
     */

    public ReporteConsultaMultiple(String [][] matrizDeLlegada){
        this.matrizConsulta = matrizDeLlegada;
    }
    
    /**
     * SobreEscritura del metodo generarTxt:
     * Se crea el txt.
     */
    @Override
    public void generarTxt() throws IOException{
        String filePath;
        filePath = ("./ConsultasMultiplesTxt.txt");
        File file = new File(filePath);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < matrizConsulta.length; i++) {
            for (int j = 0; j < matrizConsulta[i].length; j++) {
                if (matrizConsulta[i][j] != null) {
                    bw.write(matrizConsulta[i][j] + ", ");
                }
            }
            bw.write("\n");
        }
        bw.close();
        fw.close();
        return;
    }
    
    /**
     * SobreEscritura del metodo generarExcel:
     * Se crea el Excel.
     */
    @Override
    public void generarExcel() throws IOException{
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Data");
        Row rowCol = sheet.createRow(0);
        for (int i = 0; i < matrizConsulta[0].length; i++) {
            Cell cell = rowCol.createCell(i);
            cell.setCellValue(matrizConsulta[0][i]);
        }
        for (int j = 1; j < matrizConsulta.length; j++) {
            Row row = sheet.createRow(j);
            for (int k = 0; k < matrizConsulta[j].length; k++) {
                Cell cell = row.createCell(k);
                if (matrizConsulta[j][k] != null) {
                    cell.setCellValue(matrizConsulta[j][k]);
                }
            }
        }

        FileOutputStream out;
        out = new FileOutputStream(new File("ConsultasMultiplesXlsx.xlsx"));
        wb.write(out);
        wb.close();
        out.close();
        return;
    }

}
