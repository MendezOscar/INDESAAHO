
package indesaaho.grafico;
import indesaaho.logica.transaccionAsociar;
import indesaaho.logica.transaccionClientes;
import indesaaho.logica.transaccionLibreta;
import indesaaho.modelos.Asociar;
import indesaaho.modelos.Clientes;
import indesaaho.modelos.Libreta;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Oscar Mendez
 */
public class detalleLibreta extends javax.swing.JFrame {

    public detalleLibreta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtFiltro1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCliente = new javax.swing.JLabel();
        jTipo1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libreta");

        jToolBar2.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar2.setRollover(true);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el codigo del cliente");
        jToolBar2.add(jLabel2);

        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("......");
        jToolBar2.add(jLabel21);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText(".....");
        jToolBar2.add(jLabel22);

        txtFiltro1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtFiltro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltro1KeyPressed(evt);
            }
        });
        jToolBar2.add(txtFiltro1);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("......");
        jToolBar2.add(jLabel23);

        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText(".");
        jToolBar2.add(jLabel24);

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar2.add(jLabel18);

        jLabel25.setForeground(new java.awt.Color(204, 204, 255));
        jLabel25.setText("..........................");
        jToolBar2.add(jLabel25);

        jTable2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LINEA", "CAJERO", "FECHA", "TRANSACCION", "VALOR", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Nº DE CUENTA");

        jCuenta.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCuenta.setText(".");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Categoria");

        jTipo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTipo.setText(".");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Cliente");

        jCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCliente.setText(".");

        jTipo1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipo1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton2.setText("Generar Libreta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTipo)
                    .addComponent(jLabel5)
                    .addComponent(jCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCuenta)
                    .addComponent(jTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
            llenarCombo();
        }
    }//GEN-LAST:event_txtFiltro1KeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipo1ActionPerformed
        // TODO add your handling code here:
        setCuenta();
    }//GEN-LAST:event_jTipo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buscarAsociar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearTable();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(detalleLibreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detalleLibreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detalleLibreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detalleLibreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new detalleLibreta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jCliente;
    private javax.swing.JLabel jCuenta;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jTipo;
    private javax.swing.JComboBox<String> jTipo1;
    private javax.swing.JToolBar jToolBar2;
    public static javax.swing.JTextField txtFiltro1;
    // End of variables declaration//GEN-END:variables

    public void agregarFilas() {
        DefaultTableModel temp = (DefaultTableModel) jTable2.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", "", "", ""};
        temp.addRow(nuevo);
    }

    public void buscarCliente() {
        try {
            String idCliente = txtFiltro1.getText();
            Clientes clie;
            transaccionClientes service = new transaccionClientes();
            clie = service.findByIdClientes(idCliente);
            String Nombre = clie.getNombre() + " " + clie.getApellido();
            jCliente.setText(Nombre);
            jTipo.setText(clie.getTipo());
        } catch (SQLException ex) {
            Logger.getLogger(detalleLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarCombo() {
        try {
            String idCliente = txtFiltro1.getText();
            transaccionAsociar service = new transaccionAsociar();
            ArrayList<Asociar> depts;
            depts = (ArrayList<Asociar>) service.findAsociarByIdCliente(idCliente);
            if (depts.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Cliente: " + idCliente + " no tiene cuenta asociada");
            } else {
                for (int x = 0; x < depts.size(); x++) {
                    Asociar aso = depts.get(x);
                    jTipo1.addItem(aso.getTipocuenta());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(asociarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setCuenta() {
        try {
            String idCliente = txtFiltro1.getText();
            String tipoCuenta = jTipo1.getSelectedItem().toString();
            transaccionAsociar service = new transaccionAsociar();
            Asociar aso = service.findAsociarByTipoCuenta(idCliente, tipoCuenta);
            jCuenta.setText(Integer.toString(aso.getCuenta()));
        } catch (SQLException ex) {
            Logger.getLogger(detalleLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscarAsociar() {
        String idCliente = txtFiltro1.getText();
        String Tipo = jTipo1.getSelectedItem().toString();
        if ("".equals(idCliente)) {
            JOptionPane.showMessageDialog(null, "No hay codigo de prestamo ingresado");
        } else {
            try {
                Asociar aso;
                transaccionAsociar service = new transaccionAsociar();
                aso = service.findAsociarByTipoCuenta(idCliente, Tipo);
                if (aso != null) {
                    setearAsociar(aso);
                } else {
                    JOptionPane.showMessageDialog(null, "El Cliente : " + idCliente + " no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(detalleLibreta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setearAsociar(Asociar aso) {
        buscarLibreta();
    }

    private void buscarLibreta() {
        String idCliente = txtFiltro1.getText();
        Libreta lib;
        transaccionLibreta service = new transaccionLibreta();
        ArrayList<Libreta> depts;
        depts = (ArrayList<Libreta>) service.obtenerUltimoLibretaByIdClienteAcs(idCliente);
        for (int x = 0; x < depts.size(); x++) {
            lib = depts.get(x);
            agregarFilas();
            jTable2.setValueAt(x + 1, x, 0);
            jTable2.setValueAt(lib.getCajero(), x, 1);
            jTable2.setValueAt(lib.getFecha(), x, 2);
            jTable2.setValueAt(lib.getTransaccion(), x, 3);
            jTable2.setValueAt(lib.getValor(), x, 4);
            jTable2.setValueAt(lib.getSaldo(), x, 5);
        }
    }

    public void setIcon() {
        try {
            Image img = ImageIO.read(new File("Logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearTable() {
        try {
            String parrafo1 = "Nº ";
            String parrafo2 = "Nº DE CUENTA " + jCuenta.getText();

            String path = "Libreta.docx";
            XWPFDocument writedoc = new XWPFDocument(new FileInputStream(new File(path)));

            XWPFParagraph paragraph1 = writedoc.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setFontSize(9);
            run1.setFontFamily("Consolas");
            run1.setText(parrafo1);
            paragraph1.setAlignment(ParagraphAlignment.LEFT);

            XWPFParagraph paragraph2 = writedoc.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            run2.setFontSize(9);
            run2.setFontFamily("Consolas");
            run2.setText(parrafo2);
            paragraph2.setAlignment(ParagraphAlignment.LEFT);

            int nRows = 30;
            int nCols = jTable2.getColumnCount();
            XWPFTable tableOne = writedoc.createTable(nRows, nCols);
            XWPFTableRow tableOneRowOne = tableOne.getRow(0);
            tableOneRowOne.getCell(0).setText("Nº");
            tableOneRowOne.getCell(1).setText("CAJERO");
            tableOneRowOne.getCell(2).setText("FECHA");
            tableOneRowOne.getCell(3).setText("COD");
            tableOneRowOne.getCell(4).setText("VALOR");
            tableOneRowOne.getCell(5).setText("SALDO");

            String idCliente = txtFiltro1.getText();
            transaccionLibreta service = new transaccionLibreta();
            Libreta lib;
            int rowNr = 1;
            ArrayList<Libreta> depts;
            depts = (ArrayList<Libreta>) service.obtenerUltimoLibretaByIdClienteAcs(idCliente);
            for (int x = 0; x < depts.size(); x++) {
                lib = depts.get(x);
                XWPFTableRow row = tableOne.getRow(rowNr++);
                row.getCell(0).setText(Integer.toString(x + 1));
                row.getCell(1).setText(lib.getCajero());
                row.getCell(2).setText(lib.getFecha());
                row.getCell(3).setText(lib.getTransaccion());
                row.getCell(4).setText(Float.toString(lib.getValor()));
                row.getCell(5).setText(Float.toString(lib.getSaldo()));
            }
            try (FileOutputStream outStream = new FileOutputStream("libreta de "+ idCliente+".docx")) {
                writedoc.write(outStream);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(detalleLibreta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
