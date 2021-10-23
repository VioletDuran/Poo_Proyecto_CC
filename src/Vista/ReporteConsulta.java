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
 * Clase Reporte Consulta:
 * Clase especializada en generar el txt y excel de las consultas el cual usa la intefaz de Reportable.
 *
 */
public class ReporteConsulta implements Reportable {
    
    /**
     * Atributos:
     * tablaConsultas: Tabla de consultas.
     */
    private javax.swing.JTable tablaConsultas;

    /**
     * Constructor:
     * Se inicializan la tablaConsultaMultiple.
     * @param tablaConsultaMultiple: Tabla a ocupar.
     */
    public ReporteConsulta(JTable tablaConsultaMultiple) {
        this.tablaConsultas = tablaConsultaMultiple;
    }

    /**
     * SobreEscritura del metodo generarTxt:
     * Se crea el txt.
     */
    @Override
    public void generarTxt() {
        String filePath;
        if (tablaConsultas.getColumnCount() == 9) {
            filePath = ("./ConsultasMultiplesTxt.txt");
        } else {
            filePath = ("./ConsultasBinariasTxt.txt");
        }
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < tablaConsultas.getRowCount(); i++) {
                for (int j = 0; j < tablaConsultas.getColumnCount(); j++) {
                    if (tablaConsultas.getValueAt(i, j) != null) {
                        bw.write(tablaConsultas.getValueAt(i, j).toString() + ", ");
                    }
                }
                bw.write("\n");
            }
            bw.close();
            fw.close();
            return;
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * SobreEscritura del metodo generarExcel:
     * Se crea el Excel.
     */
    @Override
    public void generarExcel() {
        try {
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("Data");
            Row rowCol = sheet.createRow(0);
            for (int i = 0; i < tablaConsultas.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(tablaConsultas.getColumnName(i));
            }
            for (int j = 0; j < tablaConsultas.getRowCount(); j++) {
                Row row = sheet.createRow(j + 1);
                for (int k = 0; k < tablaConsultas.getColumnCount(); k++) {
                    Cell cell = row.createCell(k);
                    if (tablaConsultas.getValueAt(j, k) != null) {
                        cell.setCellValue(tablaConsultas.getValueAt(j, k).toString());
                    }
                }
            }

            FileOutputStream out;
            if (tablaConsultas.getColumnCount() == 9) {
                out = new FileOutputStream(new File("ConsultasMultiplesXlsx.xlsx"));
            } else {
                out = new FileOutputStream(new File("ConsultasBinariasXlsx.xlsx"));
            }
            wb.write(out);
            wb.close();
            out.close();
            return;
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }
    }

}
