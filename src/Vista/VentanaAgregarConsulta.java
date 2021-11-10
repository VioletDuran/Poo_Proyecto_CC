/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.*;
import javax.swing.JFrame;

/**
 * Clase VentanaAgregarConsulta:
 * Interfaz grafica la cual se ocupa para agregar una consulta.
 */
public class VentanaAgregarConsulta extends javax.swing.JFrame {

    private ManejoDeColecciones manejo;
    private JFrame menuPrincipal;
    private VentanaErrorField error;

    public VentanaAgregarConsulta(ManejoDeColecciones manejo, JFrame menuPrincipal) {
        initComponents();
        this.manejo = manejo;
        this.menuPrincipal = menuPrincipal;
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

        jButton1 = new javax.swing.JButton();
        grupoBotonTipoComsilta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldDeIdConsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldTituloConsulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldDescripcionConsulta = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        botonVolverMenu = new javax.swing.JButton();
        fieldDeTema = new javax.swing.JTextField();
        botonConsultaMultiple = new javax.swing.JRadioButton();
        botonConsultaSimple = new javax.swing.JRadioButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel2.setText("Ingrese Tema:");

        fieldDeIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDeIdConsultaActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese ID de su consulta:");

        jLabel6.setText("Ingrese titulo de su consulta:");

        fieldTituloConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTituloConsultaActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese Descripcion:");

        fieldDescripcionConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescripcionConsultaActionPerformed(evt);
            }
        });

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonVolverMenu.setText("Volver al menu");
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });

        grupoBotonTipoComsilta.add(botonConsultaMultiple);
        botonConsultaMultiple.setText("Consulta Multiple");

        grupoBotonTipoComsilta.add(botonConsultaSimple);
        botonConsultaSimple.setText("Consulta Simple");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldDescripcionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldDeIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fieldTituloConsulta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(fieldDeTema, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(botonOK))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonVolverMenu))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(botonConsultaMultiple)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(botonConsultaSimple)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fieldDeTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(fieldDeIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(fieldTituloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(fieldDescripcionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonConsultaSimple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(botonConsultaMultiple, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverMenu)
                    .addComponent(botonOK))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTituloConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTituloConsultaActionPerformed

    }//GEN-LAST:event_fieldTituloConsultaActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        
        String auxTema;
        String auxDescripcion;
        int auxIdConsulta;
        String auxTituloConsulta;
        
        if (manejo.existeIdEnConsultas(fieldDeTema.getText(), Integer.parseInt(fieldDeIdConsulta.getText()))) {
            this.error = new VentanaErrorField("Ya existe esta id, Ingrese otra");
            this.error.setVisible(true);
            return;
        }
        
        auxTema = fieldDeTema.getText();
        auxDescripcion = fieldDescripcionConsulta.getText();
        auxIdConsulta = Integer.parseInt(fieldDeIdConsulta.getText());
        auxTituloConsulta = fieldTituloConsulta.getText();
        if(botonConsultaSimple.isSelected()){
            manejo.agregarConsulta(auxTema, auxIdConsulta, auxTituloConsulta, auxDescripcion, botonConsultaSimple.isSelected());
        }
        else{
            if(botonConsultaMultiple.isSelected())
                manejo.agregarConsulta(auxTema, auxIdConsulta, auxTituloConsulta, auxDescripcion, botonConsultaSimple.isSelected());
        }
            
        
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_botonOKActionPerformed

    private void fieldDescripcionConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescripcionConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescripcionConsultaActionPerformed

    private void fieldDeIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDeIdConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDeIdConsultaActionPerformed

    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonConsultaMultiple;
    private javax.swing.JRadioButton botonConsultaSimple;
    private javax.swing.JButton botonOK;
    private javax.swing.JButton botonVolverMenu;
    private javax.swing.JTextField fieldDeIdConsulta;
    private javax.swing.JTextField fieldDeTema;
    private javax.swing.JTextField fieldDescripcionConsulta;
    private javax.swing.JTextField fieldTituloConsulta;
    private javax.swing.ButtonGroup grupoBotonTipoComsilta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
