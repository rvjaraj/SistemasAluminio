/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VINICIO
 *
 */
public class Producto extends javax.swing.JInternalFrame {

    /**
     * Atributos de la clase
     */
    FileInputStream fis;
    private DefaultTableModel modelotabla;  // modelo de la tabla.
    private int numBy;
    private String tipom;
    private String archivo;
    private int codAux = -500;
    coneccion con = new coneccion();
    Connection coneccion = con.conectar();
    /**
     * Constructor de la clase
     *
     * @param controladorArticulo : clase controladora de Articulo
     */
    private JButton b;

    public Producto(JButton b) {
        initComponents();
        this.b = b;

        modelotabla = new DefaultTableModel();
        tipom = "";

        comboCategoria.addItem("SELCIONAR");
        comboCategoriaM.addItem("SELCIONAR");
        try {
            String sql = "select * from categoria";
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                comboCategoria.addItem(seter.getString(1) + ": " + seter.getString(2));
                comboCategoriaM.addItem(seter.getString(1) + ": " + seter.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panelCrud = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtDesE = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtCategoriaE = new javax.swing.JTextField();
        fotoE = new javax.swing.JLabel();
        buscar3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarM = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtDesM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        btnGuardarM = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        fotoM = new javax.swing.JLabel();
        btnAgregarImagen2 = new javax.swing.JButton();
        comboCategoriaM = new javax.swing.JComboBox<>();
        buscar4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarB = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtDesB = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtCategoriaB = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtNombreB = new javax.swing.JTextField();
        fotoB = new javax.swing.JLabel();
        buscar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                cerrado(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCrud.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelCrudStateChanged(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(579, 400));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("REGISTRAR ARTICULO");

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel24.setText("NOMBRE: ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel25.setText("DESCRIPACION:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnAgregarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto.png"))); // NOI18N
        btnAgregarImagen.setText("Imagen");
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("CATEGORIA:");

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27))
                                    .addComponent(jLabel25))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(115, 115, 115)))
                        .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel27))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25))
                                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarImagen)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrud.addTab("CREAR", jPanel1);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("ELIMINAR ARTICULOS");

        txtBuscarE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarEKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("INGRESE CODIGO:  ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setText("NOMBRE:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtNombreE.setEditable(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel32.setText("CATEGORIA:");

        txtDesE.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel33.setText("DESCRIPCION:");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCategoriaE.setEditable(false);

        fotoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel28)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoriaE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(fotoE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel31)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtDesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtCategoriaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fotoE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar3.setText("BUSCAR");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11)
                        .addGap(20, 20, 20)
                        .addComponent(txtBuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(buscar3)))
                .addGap(0, 147, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar3))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelCrud.addTab("ELIMINAR", jPanel2);

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("MODIFICAR ARTICULOS");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("INGRESE CODIGO:  ");

        txtBuscarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarMKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setText("NOMBRE: ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel29.setText("DESCRIPCION:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtDesM.setEditable(false);
        txtDesM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesMKeyTyped(evt);
            }
        });

        txtNombreM.setEditable(false);
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        btnGuardarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarM.setText("GUARDAR");
        btnGuardarM.setEnabled(false);
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel35.setText("CATEGORIA:");

        fotoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnAgregarImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto.png"))); // NOI18N
        btnAgregarImagen2.setText("Imagen");
        btnAgregarImagen2.setEnabled(false);
        btnAgregarImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagen2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addComponent(jLabel29)
                            .addComponent(jLabel35))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDesM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarM)
                        .addGap(115, 115, 115)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarImagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel34))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel29))
                                    .addComponent(txtDesM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel35))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(comboCategoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarM))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fotoM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarImagen2)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        buscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar4.setText("BUSCAR");
        buscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(buscar4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrud.addTab("MODIFICAR", jPanel4);

        jLabel23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel23.setText("LISTA DE ARTICULOS");

        tabla.setBackground(new java.awt.Color(102, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "MARCA", "MEDIDA", "PROVEDOR", "FOTO"
            }
        ));
        tabla.setRowHeight(50);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCrud.addTab("LISTA", jPanel6);

        txtBuscarB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarBKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("CODIGO: ");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("BUSQUEDA DE ARTICULOS");

        jLabel51.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel51.setText("DESCRIPCION:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtDesB.setEditable(false);
        txtDesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesBActionPerformed(evt);
            }
        });
        txtDesB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesBKeyTyped(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel53.setText("NOMBRE:");

        txtCategoriaB.setEditable(false);
        txtCategoriaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaBKeyTyped(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel54.setText("CATEGORIA:");

        txtNombreB.setEditable(false);
        txtNombreB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBKeyTyped(evt);
            }
        });

        fotoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel54))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(fotoB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel52)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(txtDesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtCategoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fotoB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buscar1)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(txtBuscarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar1))
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(104, Short.MAX_VALUE)))
        );

        panelCrud.addTab("BUSCAR", jPanel3);

        getContentPane().add(panelCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 640, 363));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        jLabel6.setText("CONTROLADOR PRODUCTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 130, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cont = 0;

        if ("" != txtNombre.getText()) {
            cont++;
        }
        if ("" != txtDes.getText()) {
            cont++;
        }
        if (0 != comboCategoria.getSelectedIndex()) {
            cont++;
        }

        if (foto.getIcon() != null) {
            cont++;
        }
        if (cont == 4) {
            FileInputStream fis = null;
            File file = new File(archivo);
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                PreparedStatement pstm = coneccion.prepareStatement("INSERT INTO PRODUCTOS (NOMBRE, DESCRIPCION, ID_CATEGORIA, FOTO)  VALUES(?,?,?,?)");
                pstm.setString(1, txtNombre.getText());
                pstm.setString(2, txtDes.getText());

                String cate = (String) comboCategoria.getSelectedItem();
                int pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(3, cate);
                pstm.setBinaryStream(4, fis, (int) file.length());
                pstm.execute();

                coneccion.commit();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            txtNombre.setText("");
            txtDes.setText("");
            tipom = "";
            foto.setIcon(null);
            comboCategoria.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados  :" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (codAux != -500) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR EL PRODUCTO");
            if (JOptionPane.OK_OPTION == resp) {
                try {
                    String Query = "DELETE from productos WHERE ID = '" + codAux + "'";
                    Statement se = (Statement) coneccion.createStatement();
                    se.executeUpdate(Query);
                    coneccion.commit();
                    se.closeOnCompletion();
                    JOptionPane.showMessageDialog(this, "CLIENTE ELMINADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                    txtNombreE.setText("");
                    txtDesE.setText("");
                    txtCategoriaE.setText("");
                    fotoE.setIcon(null);
                    btnEliminar.setEnabled(false);
                    System.out.println(Query);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                txtNombreE.setText("");
                txtDesE.setText("");
                txtCategoriaE.setText("");
                fotoE.setIcon(null);
                btnEliminar.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "REVISE EL CONPO DE CEDULA", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesBActionPerformed

    private void txtDesBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesBKeyTyped

    private void txtCategoriaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaBKeyTyped

    private void txtNombreBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBKeyTyped

    private void cerrado(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrado
        b.setEnabled(true);
    }//GEN-LAST:event_cerrado

    private void panelCrudStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelCrudStateChanged
        int n = panelCrud.getSelectedIndex();

        if (n == 3) {

            String sql = "select * from productos";
            try {
                Statement se = coneccion.createStatement();
                ResultSet seter = se.executeQuery(sql);
                List<Object[]> lista = new ArrayList<>();
                while (seter.next()) {
                    try {
                        Object[] lisAr = new Object[5];
                        lisAr[0] = seter.getString(1);
                        lisAr[1] = seter.getString(2);
                        lisAr[2] = seter.getString(3);
                        lisAr[3] = seter.getString(4);
                        InputStream is = seter.getBinaryStream(5);

                        BufferedImage bi = null;

                        bi = ImageIO.read(is);

                        ImageIcon foto = new ImageIcon(bi);
                        Image img = foto.getImage();
                        Image newimg = img.getScaledInstance(150, 100, java.awt.Image.SCALE_DEFAULT);
                        ImageIcon newicon = new ImageIcon(newimg);
                        lisAr[4] = newicon;
                        lista.add(lisAr);
                    } catch (Exception ex) {
                        System.out.println("Erorrrrr >> " + ex.getMessage());
                    }

                }

                String nombrecolumnas[] = {"ID", "NOMBRE", "DESCRIPCION", "CATEGORIA", "FOTO"};
                for (int i = modelotabla.getRowCount() - 1; i >= 0; i--) {
                    modelotabla.removeRow(i);
                }
                Object datos[][] = new Object[lista.size()][nombrecolumnas.length];

                for (int j = 0; j < lista.size(); j++) {
                    datos[j][0] = lista.get(j)[0];
                    datos[j][1] = lista.get(j)[1];
                    datos[j][2] = lista.get(j)[2];
                    datos[j][3] = lista.get(j)[3];
                    datos[j][4] = lista.get(j)[4];
                }

                DefaultTableModel modelo = new DefaultTableModel(datos, nombrecolumnas) {
                    @Override
                    public Class getColumnClass(int column) {
                        switch (column) {
                            case 4:
                                return ImageIcon.class;
                            default:
                                return Object.class;
                        }
                    }
                };

                tabla.setModel(modelo);
            } catch (SQLException ex) {
                System.out.println("Error de lectura :" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_panelCrudStateChanged

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        foto.setIcon(null);
        JFileChooser j = new JFileChooser();

        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                File file = j.getSelectedFile();
                archivo = file.getAbsolutePath();
                //necesitamos saber la cantidad de bytes
                numBy = (int) j.getSelectedFile().length();
                Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT);
                foto.setIcon(new ImageIcon(icono));
                foto.updateUI();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                //  Logger.getLogger(VentanaCrudVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void txtBuscarEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Color.GREEN == txtBuscarE.getBackground()) {
//                Producto c = controlador.buscar(Integer.valueOf(txtBuscarE.getText()));
//                if (c != null) {
//                    txtNombreE.setText(c.getNombre());
//                    txtMarcaE.setText(c.getMarca());
//                    txtMedidaE.setText(c.getMedida() + " " + c.getTipoM());
//                    fotoE.setIcon(c.getImagen());
//                    btnEliminar.setEnabled(true);
//                } else {
//                    JOptionPane.showMessageDialog(this, "PRODUCTO NO ENCONTRADO", "PRODUCTO", JOptionPane.INFORMATION_MESSAGE);
//                    txtNombreE.setText("");
//                    txtMarcaE.setText("");
//                    txtMedidaE.setText("");
//                    fotoE.setIcon(null);
//                    btnEliminar.setEnabled(false);
//                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtBuscarE.setText("");
                txtCategoriaE.setText("");
                txtNombreE.setText("");
                txtDesE.setText("");
                fotoE.setIcon(null);
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtBuscarEKeyPressed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        int cont = 0;
        if ("" != txtNombreM.getText()) {
            cont++;
        }
        if ("" != txtDesM.getText()) {
            cont++;
        }
        if (0 != comboCategoriaM.getSelectedIndex()) {
            cont++;
        }

        if (fotoM.getIcon() != null) {
            cont++;
        }
        if (cont == 4) {
            FileInputStream fis = null;
            File file = new File(archivo);
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                
                PreparedStatement pstm = coneccion.prepareStatement("UPDATE productos SET NOMBRE = ?,DESCRIPCION = ?,ID_CATEGORIA = ?,FOTO = ? WHERE ID = " + codAux);
                pstm.setString(1, txtNombreM.getText());
                pstm.setString(2, txtDesM.getText());

                String cate = (String) comboCategoriaM.getSelectedItem();
                int pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(3, cate);
                pstm.setBinaryStream(4, fis, (int) file.length());
                pstm.executeUpdate();

                coneccion.commit();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " ASDASDASDA");
            }
            txtNombreM.setText("");
            txtDesM.setText("");
            tipom = "";
            fotoM.setIcon(null);
            comboCategoriaM.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados  :" + cont, "PRODUCTO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnAgregarImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagen2ActionPerformed
        fotoM.setIcon(null);
        JFileChooser j = new JFileChooser();

        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());

                File file = j.getSelectedFile();
                archivo = file.getAbsolutePath();
                //necesitamos saber la cantidad de bytes
                numBy = (int) j.getSelectedFile().length();
                Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT);
                fotoM.setIcon(new ImageIcon(icono));
                fotoM.updateUI();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                //  Logger.getLogger(VentanaCrudVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your
    }//GEN-LAST:event_btnAgregarImagen2ActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        String sql = "select * from productos p, categoria c where p.ID = '" + txtBuscarB.getText() + "' AND p.ID_CATEGORIA = c.ID";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            if (seter.getRow() == 0) {
                txtNombreB.setText("");
                txtDesB.setText("");
                txtCategoriaB.setText("");
                fotoB.setIcon(null);
            }
            while (seter.next()) {
                txtNombreB.setText(seter.getString(2));
                txtDesB.setText(seter.getString(3));
                txtCategoriaB.setText(seter.getString(4));

                InputStream is = seter.getBinaryStream(5);
                BufferedImage bi = null;
                bi = ImageIO.read(is);
                ImageIcon foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(150, 200, java.awt.Image.SCALE_DEFAULT);
                ImageIcon newicon = new ImageIcon(newimg);

                fotoB.setIcon(newicon);
            }
        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        String sql = "select * from productos p, categoria c where p.ID = '" + txtBuscarE.getText() + "' AND p.ID_CATEGORIA = c.ID";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            if (seter.getRow() == 0) {
                txtNombreE.setText("");
                txtDesE.setText("");
                txtCategoriaE.setText("");
                fotoE.setIcon(null);
            }
            while (seter.next()) {
                txtNombreE.setText(seter.getString(2));
                txtDesE.setText(seter.getString(3));
                txtCategoriaE.setText(seter.getString(4));

                InputStream is = seter.getBinaryStream(5);
                BufferedImage bi = null;
                bi = ImageIO.read(is);
                ImageIcon foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(150, 200, java.awt.Image.SCALE_DEFAULT);
                ImageIcon newicon = new ImageIcon(newimg);

                fotoE.setIcon(newicon);
                btnEliminar.setEnabled(true);
                codAux = seter.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar3ActionPerformed

    private void buscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar4ActionPerformed
        String sql = "select * from productos p, categoria c where p.ID = '" + txtBuscarM.getText() + "' AND p.ID_CATEGORIA = c.ID";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            if (seter.getRow() == 0) {
                txtNombreM.setText("");
                txtDesM.setText("");
                comboCategoriaM.setSelectedIndex(0);
                fotoM.setIcon(null);
                txtNombreM.setEditable(false);
                txtDesM.setEditable(false);
            }
            while (seter.next()) {
                txtNombreM.setText(seter.getString(2));
                txtDesM.setText(seter.getString(3));
                comboCategoriaM.setSelectedItem(seter.getString(6) + ": " + seter.getString(7));

                InputStream is = seter.getBinaryStream(5);
                BufferedImage bi = null;
                bi = ImageIO.read(is);
                ImageIcon foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(150, 200, java.awt.Image.SCALE_DEFAULT);
                ImageIcon newicon = new ImageIcon(newimg);

                fotoM.setIcon(newicon);

                btnGuardarM.setEnabled(true);
                btnAgregarImagen2.setEnabled(true);

                txtNombreM.setEditable(true);
                txtDesM.setEditable(true);
                codAux = seter.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar4ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesKeyTyped
       char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtDesKeyTyped

    private void txtBuscarEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtBuscarEKeyTyped

    private void txtBuscarMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtBuscarMKeyTyped

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtDesMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtDesMKeyTyped

    private void txtBuscarBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarBKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtBuscarBKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnAgregarImagen2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar3;
    private javax.swing.JButton buscar4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboCategoriaM;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel fotoB;
    private javax.swing.JLabel fotoE;
    private javax.swing.JLabel fotoM;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane panelCrud;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscarB;
    private javax.swing.JTextField txtBuscarE;
    private javax.swing.JTextField txtBuscarM;
    private javax.swing.JTextField txtCategoriaB;
    private javax.swing.JTextField txtCategoriaE;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtDesB;
    private javax.swing.JTextField txtDesE;
    private javax.swing.JTextField txtDesM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    // End of variables declaration//GEN-END:variables
}
