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
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Clase ReporteTema:
 * Especializada en crear Txt y Excel de temas.
 */
public class ReporteTema implements ReportableStrategy{

    /**
     * Atributos:
     * tablaTema: Tabla de los temas.
     */
     private javax.swing.JTable tablaTema;
    
     /**
      * Constructor:
      * Se inicializa la tabla de tema.
      * @param tablaTema 
      */
    public ReporteTema(JTable tablaTema) {
        this.tablaTema = tablaTema;
    }

     /**
     * SobreEscritura del metodo generarTxt:
     * Se crea el txt.
     */
    @Override
    public void generarTxt() throws IOException {
        String filePath = "./TemasTxt.txt";
        File file = new File(filePath);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < tablaTema.getRowCount(); i++) {
            for (int j = 0; j < tablaTema.getColumnCount(); j++) {
                if (tablaTema.getValueAt(i, j) != null) {
                    bw.write(tablaTema.getValueAt(i, j).toString() + ", ");
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
    public void generarExcel() throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Data");
        Row rowCol = sheet.createRow(0);
        for (int i = 0; i < tablaTema.getColumnCount(); i++) {
            Cell cell = rowCol.createCell(i);
            cell.setCellValue(tablaTema.getColumnName(i));
        }
        for (int j = 0; j < tablaTema.getRowCount(); j++) {
            Row row = sheet.createRow(j + 1);
            for (int k = 0; k < tablaTema.getColumnCount(); k++) {
                Cell cell = row.createCell(k);
                if (tablaTema.getValueAt(j, k) != null) {
                    cell.setCellValue(tablaTema.getValueAt(j, k).toString());
                }
            }
        }

        FileOutputStream out = new FileOutputStream(new File("Temas.Xlsx.xlsx"));

        wb.write(out);
        wb.close();
        out.close();
        return;

    }
    
}
