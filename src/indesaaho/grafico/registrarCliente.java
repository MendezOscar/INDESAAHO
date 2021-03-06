package indesaaho.grafico;

import indesaaho.logica.transaccionClientes;
import indesaaho.modelos.Clientes;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author oscme
 */
public final class registrarCliente extends javax.swing.JFrame {

    public registrarCliente() {
        initComponents();
        setIcon();
    }

    public Clientes enviarDatos() {
        Clientes clie;
        String muni = jmuni.getSelectedItem().toString() + " " + jMunicipio.getText();
        String idCliente = jidCliente.getText();
        String nombre = jNombre.getText();
        String apellido = jApellido.getText();
        String identidad = jIdentidad.getText();
        String departamento = jDepartamento1.getSelectedItem().toString();
        String municipio = muni;
        String direccion = jDireccion.getText();
        String estadocivil = jEstadocivil.getSelectedItem().toString();
        String telefono = jTelefono.getText();
        String genero = jGenero.getSelectedItem().toString();
        int edad = Integer.parseInt(jEdad.getText());
        String profesion = jProfesion.getText();
        String Tipo = jTipo.getSelectedItem().toString();
        int numero = setearnumero();
        String area = jArea.getText();
        String depto = jDepto.getSelectedItem().toString();
        String Responsabilidad = "";
        clie = new Clientes(idCliente, nombre, apellido, identidad, departamento, municipio, direccion, estadocivil,
                telefono, genero, edad, profesion, Tipo, numero, area, depto, Responsabilidad);
        return clie;
    }

    public void limpiar() {
        jidCliente.setText("");
        jNombre.setText("");
        jApellido.setText("");
        jIdentidad.setText("");
        jMunicipio.setText("");
        jDireccion.setText("");
        jTelefono.setText("");
        jEdad.setText("");
        jProfesion.setText("");
        jArea.setText("");
    }

    public void setearBusqueda(Clientes clie) {
        jNombre.setText(clie.getNombre());
        jApellido.setText(clie.getApellido());
        jIdentidad.setText(clie.getIdentidad());
        jmuni.setSelectedItem(clie.getDepartamento());
        jMunicipio.setText(clie.getMunicipio());
        jDireccion.setText(clie.getDireccion());
        jEstadocivil.setSelectedItem(clie.getEstadocivil());
        jTelefono.setText(clie.getTelefono());
        jGenero.setSelectedItem(clie.getGenero());
        jEdad.setText(Integer.toString(clie.getEdad()));
        jProfesion.setText(clie.getProfesion());
        jTipo.setSelectedItem(clie.getTipo());
        jArea.setText(clie.getArea());
        jDepto.setSelectedItem(clie.getDepto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jidCliente = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jIdentidad = new javax.swing.JTextField();
        jmuni = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jMunicipio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jEstadocivil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jEdad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jGenero = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jProfesion = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTipo = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jArea = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jDepartamento1 = new javax.swing.JComboBox<>();
        jDepto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Clientes");
        setBackground(new java.awt.Color(204, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("......");
        jToolBar1.add(jLabel19);

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText("......");
        jToolBar1.add(jLabel20);

        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("......");
        jToolBar1.add(jLabel21);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("......");
        jToolBar1.add(jLabel22);

        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("......");
        jToolBar1.add(jLabel23);

        jLabel24.setForeground(new java.awt.Color(204, 204, 255));
        jLabel24.setText("......");
        jToolBar1.add(jLabel24);

        jLabel27.setForeground(new java.awt.Color(204, 204, 255));
        jLabel27.setText("............");
        jToolBar1.add(jLabel27);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/save.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("CODIGO");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("IDENTIDAD");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("DEPARTAMENTO");

        jidCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jidCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jidClienteMouseClicked(evt);
            }
        });
        jidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jidClienteActionPerformed(evt);
            }
        });
        jidCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jidClienteKeyPressed(evt);
            }
        });

        jNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jApellido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jIdentidad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdentidadActionPerformed(evt);
            }
        });

        jmuni.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jmuni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Santa Cruz de Yojoa", "Potrerillos", "Santa Rita", "Progreso", "San Antonio", "San Francisco" }));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("MUNICIPIO");

        jMunicipio.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("DIRECCION");

        jDireccion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("ESTADO CIVIL");

        jEstadocivil.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jEstadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Divorciado", "Soltero", "Viudo" }));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("TELEFONO");

        jTelefono.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setText("EDAD");

        jEdad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdadActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel12.setText("GENERO");

        jGenero.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel13.setText("PROFESION U OFICIO");

        jProfesion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jTipo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socio Olivo", "Socio Indesa", "Empleado Temporal", "Empleado Permanente" }));

        jLabel28.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel28.setText("CATEGORIA");

        jLabel29.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel29.setText("LABOR / AREA");

        jArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel30.setText("DEPARTAMENTO");

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oscar Mendez\\Documents\\INDESAPRES\\Prestamos\\pictures\\clientes.png")); // NOI18N

        jDepartamento1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jDepartamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cortes", "Yoro", "EUA", "Atlantidad", "Colon", "Comayagua", "Copan", "Choluteca", "El Paraiso", "Francisco Morazan", "Gracias a Dios", "Intibuca", "Islas de la Bahia", "La Paz", "Lempira", "Ocotepeque", "Olancho", "Santa Barbara", "Valle" }));

        jDepto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agricultura", "Control de pestes y enfermedades", "Empaque", "Materiales y suministros", "Recurso Humano", "Transporte maquinaria y equipo", "Administracion de finanzas y presupuesto", "Salud, higiene, seguridad laboral y ambiente", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTelefono)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProfesion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(82, 313, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jmuni, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jIdentidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmuni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEdadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = jidCliente.getText();
        if ("".equals(jidCliente.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                transaccionClientes service = new transaccionClientes();
                if (service.findByIdClientes(id) == null) {
                    Clientes clie;
                    clie = enviarDatos();
                    service.createCliente(clie);
                } else {
                    JOptionPane.showMessageDialog(null, "EL Cliente: " + id + " no se registro por moroso");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jidCliente.getText();
        if ("".equals(jidCliente.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Clientes clie;
                clie = enviarDatos();
                transaccionClientes service = new transaccionClientes();
                service.updateCliente(id, clie);
            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String id = jidCliente.getText();
            transaccionClientes service = new transaccionClientes();
            service.deleteCliente(id);
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
        String id = jidCliente.getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
        } else {
            try {
                Clientes clie;
                transaccionClientes service = new transaccionClientes();
                clie = service.findByIdClientes(id);
                if (clie != null) {
                    setearBusqueda(clie);
                } else {
                    JOptionPane.showMessageDialog(null, "El Cliente: " + id + " no existe");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        reporteClientes rc = new reporteClientes();
        rc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jidClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jidClienteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = jidCliente.getText();
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo");
            } else {
                try {
                    Clientes clie;
                    transaccionClientes service = new transaccionClientes();
                    clie = service.findByIdClientes(id);
                    if (clie != null) {
                        setearBusqueda(clie);
                    } else {
                        JOptionPane.showMessageDialog(null, "El Cliente: " + id + " no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jidClienteKeyPressed

    private void jIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdentidadActionPerformed

    private void jidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jidClienteActionPerformed

    private void jidClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jidClienteMouseClicked
        // TODO add your handling code here:
        setearUltimo();
    }//GEN-LAST:event_jidClienteMouseClicked

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
            java.util.logging.Logger.getLogger(registrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JTextField jArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jDepartamento1;
    private javax.swing.JComboBox<String> jDepto;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JTextField jEdad;
    private javax.swing.JComboBox<String> jEstadocivil;
    private javax.swing.JComboBox<String> jGenero;
    private javax.swing.JTextField jIdentidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMunicipio;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jProfesion;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JComboBox<String> jTipo;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jidCliente;
    private javax.swing.JComboBox<String> jmuni;
    // End of variables declaration//GEN-END:variables

    public int setearnumero() {
        int numero;
        String Tipo = jTipo.getSelectedItem().toString();
        transaccionClientes service = new transaccionClientes();
        ArrayList<Clientes> depts;
        depts = (ArrayList<Clientes>) service.obtenerClientesByTipo(Tipo);
        numero = depts.size() + 1;
        return numero;
    }

    public void setearUltimo() {
        String Tipo = jTipo.getSelectedItem().toString();
        transaccionClientes service = new transaccionClientes();
        ArrayList<Clientes> depts;
        depts = (ArrayList<Clientes>) service.obtenerUltimoCleinteByTipo(Tipo);
        if (depts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registro, Ingrese uno nuevo");
        } else {
            Clientes clie = depts.get(0);
            jidCliente.setText(clie.getIdCliente());
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

}
