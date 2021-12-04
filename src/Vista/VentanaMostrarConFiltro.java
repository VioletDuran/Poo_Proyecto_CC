/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ErrorTemaRepetidoException;
import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import java.util.*;
import javax.swing.JFrame;

/**
 * Clase VentanaMostrarConFiltro:
 * Interfaz grafica la cual se ocupa para mostrar las consultas filtradas.
 */
public class VentanaMostrarConFiltro extends javax.swing.JFrame {
    private JFrame menuPrincipal;
    private ManejoDeColecciones manejo;
    private VentanaErrorField error;
    /**
     * Creates new form VentanaMostrarConFiltro
     */
    public VentanaMostrarConFiltro(JFrame menuPrincipal, ManejoDeColecciones manejo) {
        initComponents();
        this.menuPrincipal= menuPrincipal;
        this.manejo= manejo;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonVolverMenu = new javax.swing.JButton();
        botonMostrarConsultas = new javax.swing.JButton();
        boxTemas = new javax.swing.JComboBox();
        boxTemas2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese filtros:");

        jLabel2.setText("Tema 1");

        jLabel3.setText("Tema 2");

        botonVolverMenu.setText("Volver menu");
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });

        botonMostrarConsultas.setText("Mostrar Consultas");
        botonMostrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarConsultasActionPerformed(evt);
            }
        });

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

        boxTemas2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTemas2ItemStateChanged(evt);
            }
        });
        boxTemas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTemas2ActionPerformed(evt);
            }
        });

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tema", "ID", "Titulo Consulta", "Descripcion", "Muy a favor", "A favor", "Neutro", "En contra", "Muy en contra", "Likes", "Dislikes"
            }
        ));
        tablaConsulta.setRowHeight(30);
        jScrollPane1.setViewportView(tablaConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(382, 382, 382)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonMostrarConsultas)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(333, 333, 333)
                                                .addComponent(jLabel3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(321, 321, 321)
                                                .addComponent(boxTemas2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80))))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(530, 530, 530)
                                .addComponent(botonVolverMenu)))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxTemas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(botonMostrarConsultas)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(botonVolverMenu)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverMenuActionPerformed

    /**
     * Metodo RevisarTemas
     * Metodo especificado para revisar si se ingresa un tema repetido.
     * @param tema1: tema a revisar
     * @param tema2: segundo tema a revisar
     * @throws ErrorTemaRepetidoException 
     */
    public void RevisarTemas(String tema1, String tema2) throws ErrorTemaRepetidoException{
        if(tema1.equals(tema2)){
            throw new ErrorTemaRepetidoException();
        }else{
            mostrarCosultas();
        }
            
        
    }
    private void botonMostrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarConsultasActionPerformed

        try {
            RevisarTemas((String) boxTemas.getSelectedItem(), (String) boxTemas2.getSelectedItem());
        } catch (ErrorTemaRepetidoException e) {
            this.error = new VentanaErrorField("Se ha seleccionado un tema repetido.");
            this.error.setVisible(true);
            return;
        }
        
    }//GEN-LAST:event_botonMostrarConsultasActionPerformed

    private void boxTemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTemasItemStateChanged
        
    }//GEN-LAST:event_boxTemasItemStateChanged

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed

    }//GEN-LAST:event_boxTemasActionPerformed

    private void boxTemas2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTemas2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTemas2ItemStateChanged

    private void boxTemas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTemas2ActionPerformed

   
    
    public void mostrarCosultas(){
        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            manejo.matrizFiltrada((String)boxTemas.getSelectedItem() , (String)boxTemas2.getSelectedItem()),
            new String [] {
                "Tema", "ID", "Titulo Consulta", "Descripcion", "Muy a favor", "A favor", "Neutro", "En contra", "Muy en contra", "Likes", "Dislikes"
            }
        ));
    }
    
    public void mostrarTemas(){
        HashMap<String,ArrayListConsultas> auxMapa = manejo.getConsultas();
        
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            boxTemas.addItem(set.getKey());
            boxTemas2.addItem(set.getKey());
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarConsultas;
    private javax.swing.JButton botonVolverMenu;
    private javax.swing.JComboBox boxTemas;
    private javax.swing.JComboBox boxTemas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
}
