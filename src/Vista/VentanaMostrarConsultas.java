/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import javax.swing.*;

/**
 * Clase VentanaMostrarConsultas: Interfaz grafica la cual se ocupa para mostrar
 * las consultas.
 */
public class VentanaMostrarConsultas extends javax.swing.JFrame {

    private ManejoDeColecciones manejo;
    private JFrame menuPrincipal;
    private JFrame editarConsulta;
    private VentanaErrorField aviso;
    private Reportable reporte;

    /**
     * Creates new form VentanaConsultas
     */
    public VentanaMostrarConsultas(JFrame menuPrincipal, ManejoDeColecciones manejo) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        this.manejo = manejo;
        this.editarConsulta = editarConsulta;
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

        botonTipoConsulta = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        botonVolverAlMenu = new javax.swing.JButton();
        botonGenerarExel = new javax.swing.JButton();
        botonGenerarTxt = new javax.swing.JButton();
        botonConsultasSimple = new javax.swing.JRadioButton();
        botonConsultasMultiples = new javax.swing.JRadioButton();
        botonMostrarConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

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
        if (tablaConsultas.getColumnModel().getColumnCount() > 0) {
            tablaConsultas.getColumnModel().getColumn(1).setMaxWidth(25);
        }

        botonVolverAlMenu.setText("Volver al menu");
        botonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAlMenuActionPerformed(evt);
            }
        });

        botonGenerarExel.setText("Generar Excel");
        botonGenerarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarExelActionPerformed(evt);
            }
        });

        botonGenerarTxt.setText("Generar txt");
        botonGenerarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarTxtActionPerformed(evt);
            }
        });

        botonTipoConsulta.add(botonConsultasSimple);
        botonConsultasSimple.setText("Mostrar Consultas Simple");

        botonTipoConsulta.add(botonConsultasMultiples);
        botonConsultasMultiples.setText("Mostrar Consultas Multiples");

        botonMostrarConsultas.setText("Mostrar Consultas");
        botonMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonVolverAlMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGenerarTxt)
                .addGap(256, 256, 256)
                .addComponent(botonGenerarExel)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(botonConsultasSimple)
                .addGap(116, 116, 116)
                .addComponent(botonConsultasMultiples)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMostrarConsultas)
                .addGap(438, 438, 438))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(botonMostrarConsultas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConsultasSimple)
                    .addComponent(botonConsultasMultiples))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverAlMenu)
                    .addComponent(botonGenerarExel)
                    .addComponent(botonGenerarTxt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenuActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverAlMenuActionPerformed

    private void botonGenerarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarExelActionPerformed
        reporte = new ReporteConsulta(tablaConsultas);
        reporte.generarExcel();
        this.aviso = new VentanaErrorField("Excel realizado con exito!");
        this.aviso.setVisible(true);
    }//GEN-LAST:event_botonGenerarExelActionPerformed

    private void botonGenerarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarTxtActionPerformed
        reporte = new ReporteConsulta(tablaConsultas);
        reporte.generarTxt();
        this.aviso = new VentanaErrorField("Txt realizado con exito!");
        this.aviso.setVisible(true);
    }//GEN-LAST:event_botonGenerarTxtActionPerformed

    private void botonMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarConsultasActionPerformed
        if (botonConsultasSimple.isSelected()) {
            tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
                    manejo.matrizConsultasSimples(),
                    new String[]{
                        "Tema", "ID", "Titulo Consulta", "Descripcion", "Likes", "Dislikes"
                    }
            ));
        } else {
            if (botonConsultasMultiples.isSelected()) {
                tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
                        manejo.matrizConsultasMultiple(),
                        new String[]{
                            "Tema", "ID", "Titulo Consulta", "Descripcion", "Muy a favor", "A favor", "Neutro", "En contra", "Muy en contra"
                        }
                ));
            }
        }
    }//GEN-LAST:event_botonMostrarConsultasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonConsultasMultiples;
    private javax.swing.JRadioButton botonConsultasSimple;
    private javax.swing.JButton botonGenerarExel;
    private javax.swing.JButton botonGenerarTxt;
    private javax.swing.JButton botonMostrarConsultas;
    private javax.swing.ButtonGroup botonTipoConsulta;
    private javax.swing.JButton botonVolverAlMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}
