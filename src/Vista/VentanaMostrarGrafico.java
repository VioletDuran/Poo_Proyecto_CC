/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import Modelo.Consulta;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sebas
 */
public class VentanaMostrarGrafico extends javax.swing.JFrame {
    
        private ManejoDeColecciones manejo;
        private JFrame menuPrincipal;

    /**
     * Creates new form VentanaMostrarGrafico
     */
    public VentanaMostrarGrafico(JFrame menuPrincipal , ManejoDeColecciones manejo) {
        initComponents();
        this.manejo= manejo;
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

        textoIngresoA = new javax.swing.JLabel();
        textoIngresoB = new javax.swing.JLabel();
        graficarConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();
        nombreConsultaB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descripcionConsulta = new javax.swing.JLabel();
        nombreTemaConsulta = new javax.swing.JLabel();
        nombreConsulta = new javax.swing.JLabel();
        nombreIdConsulta = new javax.swing.JLabel();
        volverMenuPrincipal = new javax.swing.JButton();
        boxTemas = new javax.swing.JComboBox();
        boxID = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoIngresoA.setText("Ingrese tema de la consulta");

        textoIngresoB.setText("Ingrese Id de la consulta");

        graficarConsulta.setText("Graficar");
        graficarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarConsultaActionPerformed(evt);
            }
        });

        jLabel1.setText("Grafico Consulta ");

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        nombreConsultaB.setText("Nombre:");

        descripcionConsulta.setText("Descripcion:");

        volverMenuPrincipal.setText("Volver");
        volverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuPrincipalActionPerformed(evt);
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

        boxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(nombreIdConsulta))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombreConsultaB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreTemaConsulta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descripcionConsulta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreConsulta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                                .addComponent(volverMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(graficarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoIngresoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoIngresoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIngresoA)
                    .addComponent(textoIngresoB))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(graficarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreConsultaB)
                            .addComponent(nombreTemaConsulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionConsulta)
                            .addComponent(nombreConsulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverMenuPrincipal)
                        .addGap(12, 12, 12)))
                .addComponent(nombreIdConsulta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graficarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarConsultaActionPerformed
        // TODO add your handling code here:
        int cantidadLikes,cantidadDislikes;
        String tema = (String)boxTemas.getSelectedItem();
        int idConsulta = Integer.parseInt((String)boxID.getSelectedItem());
        String descripcion,titulo;
        HashMap<String,ArrayListConsultas> aux = manejo.getConsultas();
        ArrayListConsultas auxConsultas = aux.get(tema);
        Consulta auxConsulta = new Consulta();
        for(int i = 0; i < auxConsultas.sizeConsultas(); i++){
            if(auxConsultas.getConsulta(i).getIdConsulta() == idConsulta){
                auxConsulta = auxConsultas.getConsulta(i);
            }
        }
        nombreTemaConsulta.setText(auxConsulta.getTituloConsulta());
        nombreConsulta.setText(auxConsulta.getDescripcion());
        cantidadLikes = auxConsulta.getRespuestasConsulta().getLikes();
        cantidadDislikes = auxConsulta.getRespuestasConsulta().getDisLikes();
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(cantidadLikes, "Likes", "");
        datos.setValue(cantidadDislikes, "Dislikes", "");
        JFreeChart graficoBarras = ChartFactory.createBarChart3D("Likes y Dislikes", "", "Cantidad", datos,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setPreferredSize(new Dimension(400,300));
        panelGrafico.setLayout(new BorderLayout());
        panelGrafico.add(panel,BorderLayout.NORTH);
        pack();
        repaint();
    }//GEN-LAST:event_graficarConsultaActionPerformed

    private void volverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuPrincipalActionPerformed
        // TODO add your handling code here:0
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMenuPrincipalActionPerformed

    private void boxTemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTemasItemStateChanged
        String tema= (String)(boxTemas.getSelectedItem());
        mostrarIds(tema);
    }//GEN-LAST:event_boxTemasItemStateChanged

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed

    }//GEN-LAST:event_boxTemasActionPerformed

    private void boxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDActionPerformed

    }//GEN-LAST:event_boxIDActionPerformed

    
    public void mostrarTemas(){
        HashMap<String,ArrayListConsultas> auxMapa= manejo.getConsultas();
        
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            boxTemas.addItem(set.getKey());
        
        }
    }
    
    public void mostrarIds(String tema){
        ArrayListConsultas arrayListdeIDs= manejo.getConsultasPorTema(tema);
        boxID.removeAllItems();
        for (int i = 0; i < arrayListdeIDs.sizeConsultas(); i++) {
            boxID.addItem(Integer.toString(arrayListdeIDs.getConsulta(i).getIdConsulta()));
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxID;
    private javax.swing.JComboBox boxTemas;
    private javax.swing.JLabel descripcionConsulta;
    private javax.swing.JButton graficarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nombreConsulta;
    private javax.swing.JLabel nombreConsultaB;
    private javax.swing.JLabel nombreIdConsulta;
    private javax.swing.JLabel nombreTemaConsulta;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JLabel textoIngresoA;
    private javax.swing.JLabel textoIngresoB;
    private javax.swing.JButton volverMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
