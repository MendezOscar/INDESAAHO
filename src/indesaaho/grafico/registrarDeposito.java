
package indesaaho.grafico;

/**
 *
 * @author Oscar Mendez
 */
public class registrarDeposito extends javax.swing.JFrame {

    /**
     * Creates new form registrarRetiro
     */
    public registrarDeposito() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRetiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMonto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText("......");
        jToolBar1.add(jLabel24);

        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jLabel27.setText("........................");
        jToolBar1.add(jLabel27);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/save.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14.setText(".......");
        jToolBar1.add(jLabel14);

        jButton2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/editar.png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setToolTipText("");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText(".......");
        jToolBar1.add(jLabel15);

        jButton3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/eliminar.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setText(".......");
        jToolBar1.add(jLabel16);

        jButton4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/nwe.png"))); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText(".......");
        jToolBar1.add(jLabel17);

        jButton5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/buscar.png"))); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setToolTipText("");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setText(".......");
        jToolBar1.add(jLabel18);

        jButton6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/kista.png"))); // NOI18N
        jButton6.setText("reporte");
        jButton6.setToolTipText("");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jLabel26.setForeground(new java.awt.Color(204, 204, 255));
        jLabel26.setText("......");
        jToolBar1.add(jLabel26);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/coin_money_icon-icons.com_51091 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("CODIGO DEL CLIENTE");

        jCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jClienteMouseClicked(evt);
            }
        });
        jCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteActionPerformed(evt);
            }
        });
        jCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jClienteKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("CODIGO DEL CUENTA");

        jCuenta.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCuentaMouseClicked(evt);
            }
        });
        jCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuentaActionPerformed(evt);
            }
        });
        jCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCuentaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("CODIGO DE DEPOSITO");

        jRetiro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRetiroMouseClicked(evt);
            }
        });
        jRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRetiroActionPerformed(evt);
            }
        });
        jRetiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRetiroKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("FECHA");

        jFecha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFechaMouseClicked(evt);
            }
        });
        jFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaActionPerformed(evt);
            }
        });
        jFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFechaKeyPressed(evt);
            }
        });

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNombreMouseClicked(evt);
            }
        });
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("DEPOSITO LPS.");

        jMonto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMontoMouseClicked(evt);
            }
        });
        jMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMontoActionPerformed(evt);
            }
        });
        jMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMontoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = jTran.getText();
        if ("".equals(jTran.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            servicioTransaccion service = new servicioTransaccion();
            if (service.findByIdTransaccion(id) == null) {
                Transaccion tran;
                tran = enviarDatos();
                service.createTransaccion(tran);
            } else {
                JOptionPane.showMessageDialog(null, "La transaccion: " + id + " no se registro");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jTran.getText();
        if ("".equals(jTran.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Transaccion tran;
                tran = enviarDatos();
                servicioTransaccion service = new servicioTransaccion();
                service.updateTransaccion(id, tran);
            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String id = jTran.getText();
            servicioTransaccion service = new servicioTransaccion();
            service.deleteTransaccion(id);
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String id = jTran.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            Transaccion tran;
            servicioTransaccion service = new servicioTransaccion();
            tran = service.findByIdTransaccion(id);
            if (tran != null) {
                setearBusqueda(tran);
            } else {
                JOptionPane.showMessageDialog(null, "La Asociacion: " + id + " no existe");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        reporteClientes rc = new reporteClientes();
        rc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jClienteMouseClicked
        // TODO add your handling code here:
        setearUltimo();
    }//GEN-LAST:event_jClienteMouseClicked

    private void jClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jClienteActionPerformed

    private void jClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jClienteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jTran.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                Transaccion tran;
                servicioTransaccion service = new servicioTransaccion();
                tran = service.findByIdTransaccion(id);
                if (tran != null) {
                    setearBusqueda(tran);
                } else {
                    JOptionPane.showMessageDialog(null, "La Asociacion: " + id + " no existe");
                }
            }
        }
    }//GEN-LAST:event_jClienteKeyPressed

    private void jCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuentaMouseClicked

    private void jCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuentaActionPerformed

    private void jCuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCuentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCuentaKeyPressed

    private void jRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRetiroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRetiroMouseClicked

    private void jRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRetiroActionPerformed

    private void jRetiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRetiroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRetiroKeyPressed

    private void jFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaMouseClicked

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaKeyPressed

    private void jNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreMouseClicked

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreKeyPressed

    private void jMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMontoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMontoMouseClicked

    private void jMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMontoActionPerformed

    private void jMontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMontoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMontoKeyPressed

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
            java.util.logging.Logger.getLogger(registrarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCliente;
    private javax.swing.JTextField jCuenta;
    private javax.swing.JTextField jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMonto;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jRetiro;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
