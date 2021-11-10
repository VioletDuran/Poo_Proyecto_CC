/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import Modelo.Consulta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * VentanaMostrarIdYTema:
 * Interfaz grafica la cual se ocupa para mostrar el id y tema de las consultas.
 */
public class VentanaMostrarMasVotos extends javax.swing.JFrame  {

    private JFrame menuPrincipal;
    private ManejoDeColecciones manejo;
    private VentanaErrorField error;
    private VentanaErrorField aviso;

    /**
     * Creates new form VentanaMostrarIdYTema
     */
    public VentanaMostrarMasVotos(JFrame menuPrincipal, ManejoDeColecciones manejo) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        this.manejo = manejo;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolverMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonMostrarConsultas = new javax.swing.JButton();
        botonVolverMenu1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxTemas = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();

        botonVolverMenu.setText("Volver menu");
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese filtros:");

        jLabel2.setText("Tema");

        botonMostrarConsultas.setText("Mostrar Consultas");
        botonMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarConsultasActionPerformed(evt);
            }
        });

        botonVolverMenu1.setText("Volver menu");
        botonVolverMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenu1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese el tema para buscar:");

        boxTemas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTemasItemStateChanged(evt);
            }
        });
        boxTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTemasActionPerformed(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tema", "ID", "Titulo Consulta", "Descripcion", "Muy a favor", "A favor", "Neutro", "En contra", "Muy en contra"
            }
        ));
        tablaConsultas.setRowHeight(30);
        jScrollPane1.setViewportView(tablaConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(443, 443, 443)
                                .addComponent(botonMostrarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(459, 459, 459)
                                .addComponent(botonVolverMenu1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(435, 435, 435)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMostrarConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(botonVolverMenu1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarConsultasActionPerformed

        mostrarConsultaTemaID();
        
    }//GEN-LAST:event_botonMostrarConsultasActionPerformed

    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonVolverMenuActionPerformed

    private void botonVolverMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenu1ActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverMenu1ActionPerformed

    private void boxTemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTemasItemStateChanged
        String tema= (String)(boxTemas.getSelectedItem());
    }//GEN-LAST:event_boxTemasItemStateChanged

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed

    }//GEN-LAST:event_boxTemasActionPerformed

    public void mostrarConsultaTemaID() {
        String [][] matrizAux  = manejo.ConsultaMasVotada((String) boxTemas.getSelectedItem());
        if(matrizAux == null){
            this.error = new VentanaErrorField("No existe consulta con votos.");
            this.error.setVisible(true);
            return;
        }else{
            if (matrizAux[0].length == 9) {
                tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(matrizAux,
                        new String[]{
                            "Tema", "ID", "Titulo Consulta", "Descripcion", "Muy a favor", "A favor", "Neutro", "En contra", "Muy en contra"
                        }
                ));
            } else {
                tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(matrizAux,
                        new String[]{
                            "Tema", "ID", "Titulo Consulta", "Descripcion", "Likes", "Dislikes"
                        }
                ));
            }
        }

    }

    public void mostrarTemas(){
        HashMap<String,ArrayListConsultas> auxMapa = manejo.getConsultas();
        
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            if(this.manejo.getArray(set.getKey()).sizeConsultas() != 0)
                boxTemas.addItem(set.getKey());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarConsultas;
    private javax.swing.JButton botonVolverMenu;
    private javax.swing.JButton botonVolverMenu1;
    private javax.swing.JComboBox boxTemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}