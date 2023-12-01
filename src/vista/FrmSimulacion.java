/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import enumeracion.NombreTramite;
import vista.lista.tabla.ModeloTablaSimulacion;

public class FrmSimulacion extends javax.swing.JFrame {
        private ModeloTablaSimulacion mts = new ModeloTablaSimulacion();
        private controlador.Archivos.SimulacionArchivos control = new controlador.Archivos.SimulacionArchivos();
    /**
     * Creates new form FrmSimulacion
     */
    public FrmSimulacion() {
        initComponents();
        cargarTabla();
    }

    public void cargarTabla(){
            mts.setSimulaciones(control.all());
            tblTramite1.setModel(mts);
            tblTramite1.updateUI();
            tblTramite2.setModel(mts);
            tblTramite2.updateUI();
            tblTramite3.setModel(mts);
            tblTramite3.updateUI();
    }
    
    public void guardar(){
            int aux = Integer.parseInt(txtNumeroVentanilla.getText().trim());
            int auxGenerar = Integer.parseInt(txtNumeroGenerar.getText().trim());
            for (int i = 0; i < auxGenerar; i++) {
                    switch (aux) {
                            case 1:
                                    switch (i) {
                                                case 0:
                                                        control.getSimulacion().getVentanilla1().getTramite().setNombre(NombreTramite.ACTUALIZACIONDATOS);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 1:
                                                        control.getSimulacion().getVentanilla1().getTramite().setNombre(NombreTramite.ASIGNACIONAFILIADO);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 2:
                                                        control.getSimulacion().getVentanilla1().getTramite().setNombre(NombreTramite.CAMBIOCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 3:
                                                        control.getSimulacion().getVentanilla1().getTramite().setNombre(NombreTramite.RECUPERACIONCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                default:
                                                        throw new AssertionError();
                                                }
                                    case 2:
                                    switch (i) {
                                                case 0:
                                                        control.getSimulacion().getVentanilla2().getTramite().setNombre(NombreTramite.ACTUALIZACIONDATOS);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 1:
                                                        control.getSimulacion().getVentanilla2().getTramite().setNombre(NombreTramite.ASIGNACIONAFILIADO);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 2:
                                                        control.getSimulacion().getVentanilla2().getTramite().setNombre(NombreTramite.CAMBIOCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 3:
                                                        control.getSimulacion().getVentanilla2().getTramite().setNombre(NombreTramite.RECUPERACIONCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                default:
                                                        throw new AssertionError();
                                                }
                                    
                                    case 3:
                                    switch (i) {
                                                case 0:
                                                        control.getSimulacion().getVentanilla3().getTramite().setNombre(NombreTramite.ACTUALIZACIONDATOS);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 1:
                                                        control.getSimulacion().getVentanilla3().getTramite().setNombre(NombreTramite.ASIGNACIONAFILIADO);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 2:
                                                        control.getSimulacion().getVentanilla3().getTramite().setNombre(NombreTramite.CAMBIOCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                case 3:
                                                        control.getSimulacion().getVentanilla3().getTramite().setNombre(NombreTramite.RECUPERACIONCLAVE);
                                                        control.persist(control.getSimulacion());
                                                        cargarTabla();
                                                default:
                                                        throw new AssertionError();
                                                }
                            default:
                                    throw new AssertionError();
                    }
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
                btnGenerar = new javax.swing.JButton();
                txtNumeroVentanilla = new javax.swing.JTextField();
                jScrollPane2 = new javax.swing.JScrollPane();
                tblTramite3 = new javax.swing.JTable();
                jScrollPane3 = new javax.swing.JScrollPane();
                tblTramite1 = new javax.swing.JTable();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txtNumeroGenerar = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("SIMULACION DE VENTANILLAS");

                jLabel2.setText("Ventanilla");

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

                btnGenerar.setText("Generar");
                btnGenerar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGenerarActionPerformed(evt);
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

                jLabel6.setText("Simulaciones");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(138, 138, 138))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumeroVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumeroGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(223, Short.MAX_VALUE)))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(btnGenerar)
                                        .addComponent(txtNumeroVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtNumeroGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(412, Short.MAX_VALUE)))
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

        private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
                guardar();
        }//GEN-LAST:event_btnGenerarActionPerformed

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
        private javax.swing.JButton btnGenerar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable tblTramite1;
        private javax.swing.JTable tblTramite2;
        private javax.swing.JTable tblTramite3;
        private javax.swing.JTextField txtNumeroGenerar;
        private javax.swing.JTextField txtNumeroVentanilla;
        // End of variables declaration//GEN-END:variables
}
