/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VINICIO
 */
public class IngresoProducto extends javax.swing.JInternalFrame {

    private DefaultTableModel modelotabla;

    private int num = 0;
    private int codAux = -500;
    /**
     * Creates new form VentanaIngresoProducto
     */
    private JButton b;
    coneccion con = new coneccion();
    Connection coneccion = con.conectar();

    public IngresoProducto(JButton b) {
        initComponents();
        this.b = b;

        comboProducto.removeAllItems();
        comboProveedor.removeAllItems();
        comboProductoM.removeAllItems();
        comboProveedorM.removeAllItems();

        comboProducto.addItem("SELCIONAR");
        comboProveedor.addItem("SELCIONAR");
        comboProductoM.addItem("SELCIONAR");
        comboProveedorM.addItem("SELCIONAR");

        try {
            String sql = "select * from productos";
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                comboProducto.addItem(seter.getString(1) + ": " + seter.getString(2));
                comboProductoM.addItem(seter.getString(1) + ": " + seter.getString(2));
            }
            sql = "select * from proveedor";
            se = coneccion.createStatement();
            seter = se.executeQuery(sql);
            while (seter.next()) {
                comboProveedor.addItem(seter.getString(1) + ": " + seter.getString(3));
                comboProveedorM.addItem(seter.getString(1) + ": " + seter.getString(3));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        modelotabla = new DefaultTableModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        crudIngreso = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        comboProducto = new javax.swing.JComboBox<>();
        comboProveedor = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboProductoM = new javax.swing.JComboBox<>();
        comboProveedorM = new javax.swing.JComboBox<>();
        txtPrecioM = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtCantidadM = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        buscarm = new javax.swing.JButton();
        txtBuscarM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtProductoE = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtContidadE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtProveedorE = new javax.swing.JTextField();
        txtPrecioE = new javax.swing.JTextField();
        txtBuscarE = new javax.swing.JTextField();
        buscar3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                cerrando(evt);
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

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        jLabel6.setText("INGRESO DE PRODUCTOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 17, -1, -1));

        crudIngreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                crudIngresoStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("PRODUCTO: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("PROVEEDORA:  ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setText("PRECIO UNITARIO:  ");

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "EXTRAGERO", "NACIOANAL" }));
        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "EXTRAGERO", "NACIOANAL" }));
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setText("CANTIDAD:  ");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboProducto, 0, 168, Short.MAX_VALUE)
                    .addComponent(comboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel25.setText("AGREGAR PRODUCTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        crudIngreso.addTab("AGREGAR", jPanel2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setText("MODIFICAR INGRESO DE PRODUCTO ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("PRODUCTO: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("PROVEEDORA:  ");

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel27.setText("PRECIO UNITARIO:  ");

        comboProductoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "EXTRAGERO", "NACIOANAL" }));
        comboProductoM.setEnabled(false);
        comboProductoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoMActionPerformed(evt);
            }
        });

        comboProveedorM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "EXTRAGERO", "NACIOANAL" }));
        comboProveedorM.setEnabled(false);

        txtPrecioM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setText("CANTIDAD:  ");

        txtCantidadM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadMKeyTyped(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboProductoM, 0, 168, Short.MAX_VALUE)
                    .addComponent(comboProveedorM, 0, 168, Short.MAX_VALUE)
                    .addComponent(txtPrecioM)
                    .addComponent(txtCantidadM))
                .addGap(56, 56, 56))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboProductoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboProveedorM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(61, 61, 61)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buscarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarm.setText("BUSCAR");
        buscarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarmActionPerformed(evt);
            }
        });

        txtBuscarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarMKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("INGRESE ID:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarm)
                .addGap(147, 147, 147))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarm)
                    .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        crudIngreso.addTab("MODIFICAR", jPanel8);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel24.setText("ELIMINAR PRODUCTOS:  ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("PRODUCTO: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("PROVEEDORA:  ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel30.setText("PRECIO UNITARIO:  ");

        txtProductoE.setEditable(false);
        txtProductoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoEKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel31.setText("CANTIDAD:  ");

        txtContidadE.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtProveedorE.setEditable(false);
        txtProveedorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorEKeyTyped(evt);
            }
        });

        txtPrecioE.setEditable(false);
        txtPrecioE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductoE, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtContidadE)
                    .addComponent(txtProveedorE, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtPrecioE, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProductoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtProveedorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPrecioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContidadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        txtBuscarE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarEKeyTyped(evt);
            }
        });

        buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar3.setText("BUSCAR");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("INGRESE ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel24))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(buscar3)
                .addGap(77, 77, 77))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar3)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        crudIngreso.addTab("ELIMINAR", jPanel4);

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Provedor", "Producto", "precio Unitario", "Cantidad", "Fecha Exp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel7.setText("LISTA DE PRODUCTOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel7)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        crudIngreso.addTab("LISTAR ", jPanel3);

        getContentPane().add(crudIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, -1, 410));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedidos.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 11, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "SEGUR DECESAS ELIMAR \n ");
        if (JOptionPane.OK_OPTION == resp) {
            try {
                String Query = "DELETE from ingresopro WHERE ID = '" + codAux + "'";
                Statement se = (Statement) coneccion.createStatement();
                se.executeUpdate(Query);
                coneccion.commit();

                btnEliminar.setEnabled(false);
                txtProductoE.setText("");
                txtProveedorE.setText("");
                txtPrecioE.setText("");
                txtContidadE.setText("");
                btnEliminar.setEnabled(false);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            btnEliminar.setEnabled(false);
            txtProductoE.setText("");
            txtProveedorE.setText("");
            txtPrecioE.setText("");
            txtContidadE.setText("");
            btnEliminar.setEnabled(false);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        boolean validar = true;

        if (txtCantidadM.getText() == "") {
            validar = false;
        }
        if (txtPrecioM.getText() == "") {
            validar = false;
        }
        if (comboProductoM.getSelectedIndex() == 0) {
            validar = false;
        }
        if (comboProveedorM.getSelectedIndex() == 0) {
            validar = false;
        }

        if (validar) {
            try {
                PreparedStatement pstm = coneccion.prepareStatement("UPDATE ingresopro SET CANTIDAD = ?,PRECIO = ?,PRODUCTO = ?,PROVEEDOR = ? WHERE ID = " + codAux );
                pstm.setString(1, txtCantidadM.getText());
                pstm.setString(2, txtPrecioM.getText());

                String cate = (String) comboProductoM.getSelectedItem();
                int pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(3, cate);

                cate = (String) comboProveedorM.getSelectedItem();
                pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(4, cate);
                pstm.execute();

                coneccion.commit();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            txtCantidadM.setText("");
            txtPrecioM.setText("");
            comboProductoM.setSelectedIndex(0);
            comboProveedorM.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Error en los Coampos");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean validar = true;

        if (txtCantidad.getText() == "") {
            validar = false;
        }
        if (txtPrecio.getText() == "") {
            validar = false;
        }
        if (comboProducto.getSelectedIndex() == 0) {
            validar = false;
        }
        if (comboProveedor.getSelectedIndex() == 0) {
            validar = false;
        }

        if (validar) {
            try {
                PreparedStatement pstm = coneccion.prepareStatement("INSERT INTO ingresopro (PRECIO, CANTIDAD, PROVEEDOR, PRODUCTO)  VALUES(?,?,?,?)");
                pstm.setString(1, txtPrecio.getText());
                pstm.setString(2, txtCantidad.getText());

                String cate = (String) comboProveedor.getSelectedItem();
                int pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(3, cate);

                cate = (String) comboProducto.getSelectedItem();
                pos = cate.indexOf(":");
                cate = cate.substring(0, pos);
                pstm.setString(4, cate);
                pstm.execute();

                coneccion.commit();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            txtCantidad.setText("");
            txtPrecio.setText("");
            comboProducto.setSelectedIndex(0);
            comboProveedor.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Error en los Coampos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboProductoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductoMActionPerformed

    private void txtProductoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoEKeyTyped

    private void txtProveedorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorEKeyTyped

    private void txtPrecioEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEKeyTyped

    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void crudIngresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_crudIngresoStateChanged
        int ir = crudIngreso.getSelectedIndex();
        if (ir == 3) {
            String[] usuarioslist = new String[6];
            String sql = "select ip.ID as ID, ip.PRECIO as PRECIO, ip.CANTIDAD as CANTIDAD, pp.NOMBRE PRODUCTO, pr.NOMBRE  as PROVEEDOR"
                    + " from ingresopro ip, productos pp, proveedor pr "
                    + "WHERE pp.ID = ip.PRODUCTO AND pr.ID = ip.PROVEEDOR ";
            try {
                Statement se = coneccion.createStatement();
                ResultSet seter = se.executeQuery(sql);

                modelotabla = new DefaultTableModel();
                Object[] datoscliente;
                modelotabla.addColumn("ID");
                modelotabla.addColumn("PROVEEDOR");
                modelotabla.addColumn("PRODUCTO");
                modelotabla.addColumn("PRECIO UN");
                modelotabla.addColumn("CANTIDAD");
                tabla.setModel(modelotabla);

                datoscliente = new Object[6];
                while (seter.next()) {
                    datoscliente[0] = seter.getInt("ID");
                    datoscliente[1] = seter.getString("PROVEEDOR");
                    datoscliente[2] = seter.getString("PRODUCTO");
                    datoscliente[3] = seter.getString("PRECIO");
                    datoscliente[4] = seter.getString("CANTIDAD");

                    modelotabla.addRow(datoscliente);
                    tabla.setModel(modelotabla);
                }
            } catch (SQLException ex) {
                System.out.println("Error de lectura :" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_crudIngresoStateChanged

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        String sql = "select ip.ID as ID, ip.PRECIO as PRECIO, ip.CANTIDAD as CANTIDAD, pp.NOMBRE PRODUCTO, pr.NOMBRE  as PROVEEDOR"
                + " from ingresopro ip, productos pp, proveedor pr "
                + "WHERE pp.ID = ip.PRODUCTO AND pr.ID = ip.PROVEEDOR AND ip.ID = '" + txtBuscarE.getText() + "'";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);

            if (seter.getRow() == 0) {
                txtProductoE.setText("");
                txtProveedorE.setText("");
                txtPrecioE.setText("");
                txtContidadE.setText("");
                btnEliminar.setEnabled(false);

            }
            while (seter.next()) {
                txtProductoE.setText(seter.getString("PROVEEDOR"));
                txtProveedorE.setText(seter.getString("PRODUCTO"));
                txtPrecioE.setText(seter.getString("PRECIO"));
                txtContidadE.setText(seter.getString("CANTIDAD"));

                btnEliminar.setEnabled(true);
                codAux = seter.getInt("ID");
            }
        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar3ActionPerformed

    private void buscarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarmActionPerformed
        String sql = "select ip.ID as ID, ip.PRECIO as PRECIO, ip.CANTIDAD as CANTIDAD, pp.ID AS IDPP, pp.NOMBRE PRODUCTO, pr.ID AS IDPR, pr.NOMBRE  as PROVEEDOR"
                + " from ingresopro ip, productos pp, proveedor pr "
                + "WHERE pp.ID = ip.PRODUCTO AND pr.ID = ip.PROVEEDOR AND ip.ID = '" + txtBuscarM.getText() + "'";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);

            if (seter.getRow() == 0) {
                comboProductoM.setSelectedItem(0);
                comboProveedorM.setSelectedItem(0);
                txtProveedorE.setText("");
                txtPrecioM.setText("");
                txtCantidadM.setText("");
                btnActualizar.setEnabled(false);
                comboProductoM.setEnabled(false);
                comboProveedorM.setEnabled(false);
                txtPrecioM.setEnabled(false);
                txtCantidadM.setEnabled(false);
            }
            while (seter.next()) {
                System.out.println("proveerdor >>> " + seter.getString("IDPR") + ": " + seter.getString("PROVEEDOR"));
                comboProveedorM.setSelectedItem(seter.getString("IDPR") + ": " + seter.getString("PROVEEDOR"));
                comboProductoM.setSelectedItem(seter.getString("IDPP") + ": " + seter.getString("PRODUCTO"));

                txtPrecioM.setText(seter.getString("PRECIO"));
                txtCantidadM.setText(seter.getString("CANTIDAD"));

                btnActualizar.setEnabled(true);
                comboProductoM.setEnabled(true);
                comboProveedorM.setEnabled(true);
                txtPrecioM.setEnabled(true);
                txtCantidadM.setEnabled(true);

                codAux = seter.getInt("ID");
            }
        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscarmActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        if (evt.getKeyChar() != '.') {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
       if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtBuscarMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtBuscarMKeyTyped

    private void txtPrecioMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMKeyTyped
       if (evt.getKeyChar() != '.') {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrecioMKeyTyped

    private void txtCantidadMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtCantidadMKeyTyped

    private void txtBuscarEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event_txtBuscarEKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton buscar3;
    private javax.swing.JButton buscarm;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JComboBox<String> comboProductoM;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JComboBox<String> comboProveedorM;
    private javax.swing.JTabbedPane crudIngreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscarE;
    private javax.swing.JTextField txtBuscarM;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadM;
    private javax.swing.JTextField txtContidadE;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioE;
    private javax.swing.JTextField txtPrecioM;
    private javax.swing.JTextField txtProductoE;
    private javax.swing.JTextField txtProveedorE;
    // End of variables declaration//GEN-END:variables
}
