/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 * Clase VentanaEliminarTema:
 * Interfaz grafica la cual se ocupa para eliminar un tema.
 */
public class VentanaEliminarTema extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEliminarTema
     */
    private ManejoDeColecciones manejo;
    private JFrame menuPrincipal;
    private VentanaErrorField aviso;

    
    public VentanaEliminarTema(ManejoDeColecciones manejo , JFrame menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        this.manejo = manejo;
        this.setLocationRelativeTo(null);
    }
    
    public void mostrarTemas(){
        
        HashMap<String,ArrayListConsultas> auxMapa= manejo.getConsultas();
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            boxTemas.addItem(set.getKey());
        }
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
        boxTemas = new javax.swing.JComboBox<>();
        botonVolver = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Seleccione el tema que desea eliminar");

        boxTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTemasActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver al menu");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVolver)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(botonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTemasActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       String temaEliminado = (String) boxTemas.getSelectedItem();
       manejo.EliminarTema(temaEliminado);
       this.aviso = new VentanaErrorField("El tema se ha elimiado con exito!");
       this.aviso.setVisible(true);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> boxTemas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
