/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejoDeColecciones;
import Modelo.ArrayListConsultas;
import Modelo.Consulta;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author sebas
 */
public class VentanaMostrarIdYTema extends javax.swing.JFrame {

    private JFrame menuPrincipal;
    private ManejoDeColecciones manejo;
    private VentanaErrorField error;

    /**
     * Creates new form VentanaMostrarIdYTema
     */
    public VentanaMostrarIdYTema(JFrame menuPrincipal, ManejoDeColecciones manejo) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonMostrarConsultas = new javax.swing.JButton();
        botonVolverMenu1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxTemas = new javax.swing.JComboBox();
        boxID = new javax.swing.JComboBox();

        botonVolverMenu.setText("Volver menu");
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tema", "Titulo Consulta", "Descripcion", "Likes", "Dislikes"
            }
        ));
        tablaConsulta.setRowHeight(30);
        jScrollPane1.setViewportView(tablaConsulta);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese filtros:");

        jLabel3.setText("ID ");

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

        jLabel4.setText("Ingrese el tema y la id deseada:");

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
                .addGap(95, 95, 95)
                .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonVolverMenu1)
                        .addGap(390, 390, 390))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonMostrarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(361, 361, 361))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(botonMostrarConsultas)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverMenu1)
                .addContainerGap())
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
        mostrarIds(tema);
    }//GEN-LAST:event_boxTemasItemStateChanged

    private void boxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTemasActionPerformed

    }//GEN-LAST:event_boxTemasActionPerformed

    private void boxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDActionPerformed

    }//GEN-LAST:event_boxIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public void mostrarConsultaTemaID() {
        String matriz[][] = new String[manejo.tamMapa()][6];
        HashMap<String, ArrayListConsultas> auxMapa = manejo.getConsultas();
        Consulta ConsultaFiltrada;
        ConsultaFiltrada = manejo.motrarConsultasPorTema((String) boxTemas.getSelectedItem()).getConsultaPorId((String)boxID.getSelectedItem());
            matriz[0][0] = Integer.toString(ConsultaFiltrada.getIdConsulta());
            matriz[0][1] = ConsultaFiltrada.getTituloTema();
            matriz[0][2] = ConsultaFiltrada.getTituloConsulta();
            matriz[0][3] = ConsultaFiltrada.getDescripcion();
            matriz[0][4] = Integer.toString(ConsultaFiltrada.getRespuestasConsulta().getLikes());
            matriz[0][5] = Integer.toString(ConsultaFiltrada.getRespuestasConsulta().getDisLikes());

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Tema", "Titulo Consulta", "Descripcion", "Likes", "Dislikes"
                }
        ));
    }

    public void mostrarTemas(){
        HashMap<String,ArrayListConsultas> auxMapa= manejo.getConsultas();
        
        for(Map.Entry<String,ArrayListConsultas> set: auxMapa.entrySet()){
            if(this.manejo.getArray(set.getKey()).sizeConsultas() != 0)
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarConsultas;
    private javax.swing.JButton botonVolverMenu;
    private javax.swing.JButton botonVolverMenu1;
    private javax.swing.JComboBox boxID;
    private javax.swing.JComboBox boxTemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
}
