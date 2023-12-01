/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import enumeracion.NombreTramite;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Simulacion;
import modelo.Tramite;
import modelo.Ventanilla;
import vista.lista.tabla.ModeloTablaSimulacion;
import vista.lista.tabla.ModeloTablaTramite;

public class FrmSimulacion extends javax.swing.JFrame {

    private ModeloTablaSimulacion mts = new ModeloTablaSimulacion();
    private controlador.Archivos.SimulacionArchivos control = new controlador.Archivos.SimulacionArchivos();
    private ModeloTablaTramite mt = new ModeloTablaTramite();
    private DynamicList<Tramite> tramites = new DynamicList<>();
    private DynamicList<Tramite> tramites2 = new DynamicList<>();
    private DynamicList<Tramite> tramites3 = new DynamicList<>();
    private Ventanilla ventanilla1 = new Ventanilla();
    private Ventanilla ventanilla2 = new Ventanilla();
    private Ventanilla ventanilla3 = new Ventanilla();
    private Integer total = 0;
    
    
    /**
     * Creates new form FrmSimulacion
     */
    public FrmSimulacion() {
        initComponents();
        cargarTabla();
    }

    public void cargarTabla() {
        cargarTablaV1();
        cargarTablaV2();
        cargarTablaV3();
    }

    public void cargarTablaV1() {
        mt.setTramites(tramites);
        ventanilla1.setTramites(tramites);
        control.getSimulacion().setVentanilla1(ventanilla1);
        tblTramite1.setModel(mt);
        tblTramite1.updateUI();
    }

    public void cargarTablaV2() {
        mt.setTramites(tramites2);
        ventanilla2.setTramites(tramites2);
        control.getSimulacion().setVentanilla2(ventanilla2);
        tblTramite2.setModel(mt);
        tblTramite2.updateUI();
    }

    public void cargarTablaV3() {
        mt.setTramites(tramites3);
        ventanilla3.setTramites(tramites3);
        control.getSimulacion().setVentanilla3(ventanilla3);
        tblTramite3.setModel(mt);
        tblTramite3.updateUI();
    }

    public void tiempoTotal(Integer ventanilla, Tramite tramite) {
        if (ventanilla == 1) {
            tramite.getTiempo();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTramite2 = new javax.swing.JTable();
        btnGenerar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTramite3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTramite1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGenerar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnGenerar3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SIMULACION DE VENTANILLAS");

        jLabel2.setText("Ventanilla 1");

        tblTramite2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblTramite2);

        btnGenerar1.setText("Generar");
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });

        tblTramite3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tblTramite3);

        tblTramite1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tblTramite1);

        jLabel3.setText("#1");

        jLabel4.setText("#2");

        jLabel5.setText("#3");

        jLabel6.setText("Ventanilla 2");

        btnGenerar2.setText("Generar");
        btnGenerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ventanilla 3");

        btnGenerar3.setText("Generar");
        btnGenerar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar3ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar Simulacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        txtNombre.setPreferredSize(new java.awt.Dimension(69, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerar3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerar1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGenerar2)
                                    .addComponent(jLabel1))))
                        .addGap(138, 138, 138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnGenerar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnGenerar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnGenerar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(133, 133, 133)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed
            Integer tiempoTotal = 0;
            Integer aletorio = new Random().nextInt(6) + 15;
            control.getSimulacion().setPersonasTotal(aletorio);
            control.getSimulacion().getVentanilla1().setNroPersonasAten(aletorio);
            DynamicList<NombreTramite> tipos = new DynamicList<>();
            tipos.add(NombreTramite.CAMBIOCLAVE);
            tipos.add(NombreTramite.ACTUALIZACIONDATOS);
            tipos.add(NombreTramite.ASIGNACIONAFILIADO);
            tipos.add(NombreTramite.RECUPERACIONCLAVE);
            System.out.println(tipos.getLength());
            Integer aletorioTipo;
            Tramite aux;
            NombreTramite tipoAletorio;
            for (int i = 0; i < aletorio; i++) {
                aletorioTipo = new Random().nextInt(4);
                try {
                    tipoAletorio = tipos.getInfo(aletorioTipo);
                    aux = new Tramite(i, tipoAletorio);
                    tramites.add(aux);
                    tiempoTotal = aux.getTiempo() + tiempoTotal;
                    total = tiempoTotal + total;
                    cargarTablaV1();
                } catch (EmptyException ex) {
                    Logger.getLogger(FrmSimulacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            control.getSimulacion().getVentanilla1().setTiempoTotal(tiempoTotal);
        }//GEN-LAST:event_btnGenerar1ActionPerformed

    private void btnGenerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar2ActionPerformed
        Integer tiempoTotal = 0;
        Integer aletorio = new Random().nextInt(6) + 15;
        control.getSimulacion().setPersonasTotal(aletorio);
        DynamicList<NombreTramite> tipos = new DynamicList<>();
        control.getSimulacion().getVentanilla2().setNroPersonasAten(aletorio);
        tipos.add(NombreTramite.CAMBIOCLAVE);
        tipos.add(NombreTramite.ACTUALIZACIONDATOS);
        tipos.add(NombreTramite.ASIGNACIONAFILIADO);
        tipos.add(NombreTramite.RECUPERACIONCLAVE);
        System.out.println(tipos.getLength());
        Integer aletorioTipo;
        Tramite aux;
        NombreTramite tipoAletorio;
        for (int i = 0; i < aletorio; i++) {
            aletorioTipo = new Random().nextInt(4);
            try {
                tipoAletorio = tipos.getInfo(aletorioTipo);
                aux = new Tramite(i, tipoAletorio);
                tramites2.add(aux);
                tiempoTotal = aux.getTiempo() + tiempoTotal;
                total = tiempoTotal + total;
                control.getSimulacion().setTotalAtendido(tiempoTotal);
                cargarTablaV2();
            } catch (EmptyException ex) {
                Logger.getLogger(FrmSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        control.getSimulacion().getVentanilla2().setTiempoTotal(tiempoTotal);
    }//GEN-LAST:event_btnGenerar2ActionPerformed

    private void btnGenerar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar3ActionPerformed
        Integer tiempoTotal = 0;
        Integer aletorio = new Random().nextInt(6) + 15;
        control.getSimulacion().setPersonasTotal(aletorio);
        DynamicList<NombreTramite> tipos = new DynamicList<>();
        control.getSimulacion().getVentanilla3().setNroPersonasAten(aletorio);
        tipos.add(NombreTramite.CAMBIOCLAVE);
        tipos.add(NombreTramite.ACTUALIZACIONDATOS);
        tipos.add(NombreTramite.ASIGNACIONAFILIADO);
        tipos.add(NombreTramite.RECUPERACIONCLAVE);
        System.out.println(tipos.getLength());
        Integer aletorioTipo;
        Tramite aux;
        NombreTramite tipoAletorio;
        for (int i = 0; i < aletorio; i++) {
            aletorioTipo = new Random().nextInt(4);
            try {
                tipoAletorio = tipos.getInfo(aletorioTipo);
                aux = new Tramite(i, tipoAletorio);
                tramites3.add(aux);
                tiempoTotal = aux.getTiempo() + tiempoTotal;
                total = tiempoTotal + total;
                control.getSimulacion().setTotalAtendido(tiempoTotal);
                cargarTablaV3();
            } catch (EmptyException ex) {
                Logger.getLogger(FrmSimulacion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        control.getSimulacion().getVentanilla3().setTiempoTotal(tiempoTotal);
    }//GEN-LAST:event_btnGenerar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int personasTotal = control.getSimulacion().getVentanilla1().getTramites().getLength() + control.getSimulacion().getVentanilla2().getTramites().getLength() + control.getSimulacion().getVentanilla3().getTramites().getLength();
        control.getSimulacion().setNombre(txtNombre.getText());
        control.getSimulacion().setPersonasTotal(personasTotal);
        control.getSimulacion().setPersonasTotal(total);
        control.persist(control.getSimulacion());
        JOptionPane.showMessageDialog(null, "Se ha guardado su simulacion con exito");
        FrmDetallesSimulacion frame = new FrmDetallesSimulacion();
        frame.cargarSimulacion(control.getSimulacion());
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar1;
    private javax.swing.JButton btnGenerar2;
    private javax.swing.JButton btnGenerar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTramite1;
    private javax.swing.JTable tblTramite2;
    private javax.swing.JTable tblTramite3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
