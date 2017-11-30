
package indesaaho.grafico;

import indesaaho.logica.transaccionLibreta;
import indesaaho.modelos.Libreta;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Oscar Mendez
 */
public class BalanceGeneral extends javax.swing.JFrame {

    /**
     * Creates new form BalanceGeneral
     */
    public BalanceGeneral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jFecha2 = new javax.swing.JTextField();
        jFecha3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Depositos", "Retiros", "Pagos a Prestamos", "Intereses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Rango en meses:");

        jFecha2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jFecha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFecha2MouseClicked(evt);
            }
        });
        jFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecha2ActionPerformed(evt);
            }
        });
        jFecha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFecha2KeyPressed(evt);
            }
        });

        jFecha3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jFecha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFecha3MouseClicked(evt);
            }
        });
        jFecha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecha3ActionPerformed(evt);
            }
        });
        jFecha3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFecha3KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("desde");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("hasta");

        jButton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton3.setText("Mostrar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton4.setText("Mostrar general");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        String idClient = jTable2.getValueAt(row, 0).toString();
        this.setVisible(false);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jFecha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFecha2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha2MouseClicked

    private void jFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha2ActionPerformed

    private void jFecha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFecha2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha2KeyPressed

    private void jFecha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFecha3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha3MouseClicked

    private void jFecha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecha3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha3ActionPerformed

    private void jFecha3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFecha3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecha3KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mostrarTodos();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BalanceGeneral().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jFecha;
    private javax.swing.JTextField jFecha1;
    private javax.swing.JTextField jFecha2;
    private javax.swing.JTextField jFecha3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void mostrarTodos(){
        
        Libreta lib;
        transaccionLibreta service = new transaccionLibreta();
        ArrayList<Libreta> dep;
        dep = (ArrayList<Libreta>) service.obtenerLibretaTransaccion("DEP");
        ArrayList<Libreta> ret;
        ret = (ArrayList<Libreta>) service.obtenerLibretaTransaccion("RET");      
        ArrayList<Libreta> pp;
        pp = (ArrayList<Libreta>) service.obtenerLibretaTransaccion("PP");  
        ArrayList<Libreta> inte;
        inte = (ArrayList<Libreta>) service.obtenerLibretaTransaccion("INT");
        float sumadep = (float)0.0;
        float sumaret = (float)0.0;
        float sumapp = (float)0.0;
        float sumaint = (float)0.0;
        
        
        for (int x = 0; x < dep.size(); x++){
            lib = dep.get(x);
            sumadep = sumadep + lib.getValor();
        }
        for (int x = 0; x < ret.size(); x++){
            lib = ret.get(x);
            sumaret = sumaret + lib.getValor();
        }
        for (int x = 0; x < pp.size(); x++){
            lib = pp.get(x);
            sumapp = sumapp + lib.getValor();
        }
        for (int x = 0; x < inte.size(); x++){
            lib = inte.get(x);
            sumaint = sumaint + lib.getValor();
        }
        
        jTable2.setValueAt(formatNumber(sumadep), 0, 0);
        jTable2.setValueAt(formatNumber(sumaret), 0, 1);
        jTable2.setValueAt(formatNumber(sumapp), 0, 2);
        jTable2.setValueAt(formatNumber(sumaint), 0, 3);
    }

    private Object formatNumber(float sumadep) {
        String res;
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        res = formateador.format(sumadep);
        return res;
    }
}
