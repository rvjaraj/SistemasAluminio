package Todo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 * VentanaCrudClientes
 *
 * @author Fanny
 */
public class Usuarios extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    coneccion con = new coneccion();
    Connection coneccion = con.conectar();

    public Usuarios(JButton b) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();
        modelotabla = new DefaultTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelesCrudCliente = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        direcion5 = new javax.swing.JLabel();
        direcion6 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<>();
        txtDirecion = new javax.swing.JTextField();
        agregarClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listadeClientes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarclientes = new javax.swing.JLabel();
        txtCedulaB = new javax.swing.JTextField();
        ingreseCedula = new javax.swing.JLabel();
        panelBuscarCliente = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        apillido2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtApellidoB = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();
        txtTelefonoB = new javax.swing.JTextField();
        telefono2 = new javax.swing.JLabel();
        direcion2 = new javax.swing.JLabel();
        txtDirecionB = new javax.swing.JTextField();
        direcion3 = new javax.swing.JLabel();
        txtCorreoB = new javax.swing.JTextField();
        direcion4 = new javax.swing.JLabel();
        txtRolB = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        txtCedulaM = new javax.swing.JTextField();
        modificarcliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JLabel();
        direccion3 = new javax.swing.JLabel();
        actulizarM = new javax.swing.JButton();
        txtCedulaMM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtTelefonoM = new javax.swing.JTextField();
        txtDirecionM = new javax.swing.JTextField();
        nombre5 = new javax.swing.JLabel();
        direcion9 = new javax.swing.JLabel();
        txtCorreoM = new javax.swing.JTextField();
        direcion10 = new javax.swing.JLabel();
        comboRolM = new javax.swing.JComboBox<>();
        buscar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        eliminarcliente = new javax.swing.JLabel();
        cedula4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtTelefonoE = new javax.swing.JTextField();
        telefono4 = new javax.swing.JLabel();
        direccion4 = new javax.swing.JLabel();
        txtDirecionE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        direcion7 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        txtRolE = new javax.swing.JTextField();
        direcion8 = new javax.swing.JLabel();
        txtCedulaE = new javax.swing.JTextField();
        buscar3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ingreseCedula1 = new javax.swing.JLabel();
        txtCorreoAC = new javax.swing.JTextField();
        buscar4 = new javax.swing.JButton();
        direcion11 = new javax.swing.JLabel();
        txtCedulaAC = new javax.swing.JTextField();
        actulizarAC = new javax.swing.JButton();
        controladorCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                cerrando(evt);
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

        panelesCrudCliente.setBackground(new java.awt.Color(0, 204, 102));
        panelesCrudCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelesCrudClienteStateChanged(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, 150, -1));

        apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido.setText("APELLIDOS:   ");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 67, 140, -1));

        cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula.setText("CEDULA:   ");
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 11, 140, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 11, 146, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 67, 146, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 37, 146, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion.setText("DIRECCION : ");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 122, 120, -1));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 146, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono.setText("TELEFONO:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 96, 120, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 96, 146, -1));

        direcion5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion5.setText("CORREO:");
        jPanel1.add(direcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        direcion6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion6.setText("ROL:");
        jPanel1.add(direcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, -1));

        comboRol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "ADMIN", "USER" }));
        jPanel1.add(comboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 140, -1));

        txtDirecion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 122, 146, -1));

        agregarClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        agregarClientes.setText("Agregar Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarClientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agregarClientes)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("CREAR", jPanel2);

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NombreyApellido", "Direccion", "Telefono", "Codigo", "Cedula", "aaaaaaaaaa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        listadeClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        listadeClientes.setText("LISTA DE CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(listadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(listadeClientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarclientes.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        buscarclientes.setText("BUSCAR CLIENTES");
        jPanel6.add(buscarclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 298, 37));

        txtCedulaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaBKeyTyped(evt);
            }
        });
        jPanel6.add(txtCedulaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 64, 153, -1));

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE CEDULA: ");
        jPanel6.add(ingreseCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 164, 20));

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("NOMBRE: ");

        apillido2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apillido2.setText("APELLIDOS: ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoB.setEditable(false);

        txtNombreB.setEditable(false);

        txtTelefonoB.setEditable(false);

        telefono2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono2.setText("TELEFONO:");

        direcion2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion2.setText("DIRECCION");

        txtDirecionB.setEditable(false);

        direcion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion3.setText("CORREO");

        txtCorreoB.setEditable(false);

        direcion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion4.setText("ROL");

        txtRolB.setEditable(false);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(direcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreB)
                                .addComponent(txtApellidoB)
                                .addComponent(txtTelefonoB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDirecionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelBuscarClienteLayout.setVerticalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre2)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direcion2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDirecionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direcion4)
                    .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel6.add(panelBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 300));

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jPanel6.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        panelesCrudCliente.addTab("BUSCAR", jPanel6);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula3.setText("CEDULA: ");
        jPanel8.add(cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 158, -1));

        txtCedulaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyTyped(evt);
            }
        });
        jPanel8.add(txtCedulaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        modificarcliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        modificarcliente.setText("MODIFICAR CLIENTE");
        jPanel8.add(modificarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 253, -1));

        jPanel11.setEnabled(false);

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("CEDULA:");

        apellido3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido3.setText("APELLIDOS: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        telefono3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono3.setText("TELEFONO:");

        direccion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion3.setText("DIRECCION");

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        txtCedulaMM.setEditable(false);
        txtCedulaMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMMActionPerformed(evt);
            }
        });
        txtCedulaMM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMMKeyTyped(evt);
            }
        });

        txtNombreM.setEditable(false);
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        txtApellidoM.setEditable(false);
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        txtTelefonoM.setEditable(false);
        txtTelefonoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoMKeyTyped(evt);
            }
        });

        txtDirecionM.setEditable(false);
        txtDirecionM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionMKeyTyped(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre5.setText("NOMBRE: ");

        direcion9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion9.setText("CORREO:");

        txtCorreoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoMKeyTyped(evt);
            }
        });

        direcion10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion10.setText("ROL:");

        comboRolM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRolM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "ADMIN", "USER" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(direccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addGap(372, 372, 372))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCedulaMM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecionM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoM, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(direcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(direcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(actulizarM)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre5))
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido3)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirecionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion9)
                    .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion10)
                    .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addGap(32, 32, 32)
                .addComponent(actulizarM)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 350));

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel8.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        eliminarcliente.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        eliminarcliente.setText("Eliminar Cliente");

        cedula4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula4.setText("CEDULA: ");

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("NOMBRE: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("APELLIDOS: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoE.setEditable(false);

        txtNombreE.setEditable(false);

        txtTelefonoE.setEditable(false);

        telefono4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono4.setText("TELEFONO:");

        direccion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion4.setText("DIRECCION");

        txtDirecionE.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        direcion7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion7.setText("CORREO");

        txtCorreoE.setEditable(false);

        txtRolE.setEditable(false);

        direcion8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion8.setText("ROL");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(direccion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecionE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoE)
                                .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnEliminar)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direcion7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre4)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellido4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono4)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion4)
                            .addComponent(txtDirecionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion7))
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion8)
                    .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnEliminar))
        );

        txtCedulaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEKeyTyped(evt);
            }
        });

        buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar3.setText("BUSCAR");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaE, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("ELIMINAR", jPanel4);

        ingreseCedula1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula1.setText("INGRESE CEDULA: ");

        txtCorreoAC.setEditable(false);

        buscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar4.setText("BUSCAR");
        buscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar4ActionPerformed(evt);
            }
        });

        direcion11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion11.setText("CORREO");

        txtCedulaAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaACKeyTyped(evt);
            }
        });

        actulizarAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarAC.setText("ACTUALIZAR");
        actulizarAC.setEnabled(false);
        actulizarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(ingreseCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCedulaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar4)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(actulizarAC)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(direcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtCorreoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar4)
                    .addComponent(ingreseCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion11)
                    .addComponent(txtCorreoAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(actulizarAC)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("RECUPERAR CONTRASEÑA", jPanel5);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("CONTROLADOR CLIENTES");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteP.png"))); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesCrudCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (codAux != -500) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR AL CLIENTE");
            if (JOptionPane.OK_OPTION == resp) {
                try {
                    String Query = "DELETE from usuarios WHERE ID = '" + codAux + "'";
                    Statement se = (Statement) coneccion.createStatement();
                    se.executeUpdate(Query);
                    coneccion.commit();

                    JOptionPane.showMessageDialog(this, "CLIENTE ELMINADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                    txtCedulaE.setText("");
                    txtNombreE.setText("");
                    txtApellidoE.setText("");
                    txtTelefonoE.setText("");
                    txtDirecionE.setText("");
                    btnEliminar.setEnabled(false);
                    System.out.println(Query);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                txtCedulaE.setText("");
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                btnEliminar.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "REVISE EL CONPO DE CEDULA", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed


    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed
        int cont = 0;
        if ("" != txtCedulaMM.getText()) {
            cont++;
        }
        if ("" != txtNombreM.getText()) {
            cont++;
        }
        if ("" != txtApellidoM.getText()) {
            cont++;
        }
        if ("" != txtTelefonoM.getText()) {
            cont++;
        }
        if ("" != txtDirecionM.getText()) {
            cont++;
        }
        if (cont == 5) {
            try {
                String Query = "UPDATE usuarios SET CEDULA = ?,NOMBRE = ?,APELLIDO = ?,TELEFONO = ?,DIRECCION = ?, ROL = ?, CORREO = ? WHERE ID = " + codAux;
                PreparedStatement statement = coneccion.prepareStatement(Query);

                statement.setString(1, txtCedulaMM.getText());
                statement.setString(2, txtNombreM.getText());
                statement.setString(3, txtApellidoM.getText());
                statement.setString(4, txtTelefonoM.getText());
                statement.setString(5, txtDirecionM.getText());
                statement.setString(6, comboRolM.getSelectedItem().toString());
                statement.setString(7, txtCorreoM.getText());
                statement.execute();
                coneccion.commit();

                txtCedulaM.setText("");
                txtCedulaMM.setText("");
                txtNombreM.setText("");
                txtApellidoM.setText("");
                txtTelefonoM.setText("");
                txtDirecionM.setText("");
                txtCorreoM.setText("");
                comboRolM.setSelectedIndex(0);

                txtCedulaMM.setEditable(false);
                txtNombreM.setEditable(false);
                txtApellidoM.setEditable(false);
                txtTelefonoM.setEditable(false);
                txtDirecionM.setEditable(false);
                actulizarM.setEnabled(false);
                codAux = -500;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "CLUETE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actulizarMActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean bander = true;
        if (0 >= txtCedula.getText().length()) {
            bander = false;
        }
        if (0 >= txtNombre.getText().length()) {
            bander = false;
        }
        if (0 >= txtApellido.getText().length()) {
            bander = false;
        }
        if (0 >= txtTelefono.getText().length()) {
            bander = false;
        }
        if (0 >= txtDirecion.getText().length()) {
            bander = false;
        }
        if (0 >= txtCorreo.getText().length()) {
            bander = false;
        }
        if (0 == comboRol.getSelectedIndex()) {
            bander = false;
        }
        if (bander) {

            try {
                String Query = "INSERT INTO usuarios(CEDULA,NOMBRE,APELLIDO,TELEFONO,DIRECCION,CORREO,ROL,CONTRACENIA)values(?,?,?,?,?,?,?,?) ";
                PreparedStatement statement = coneccion.prepareStatement(Query);

                statement.setString(1, txtCedula.getText());
                statement.setString(2, txtNombre.getText());
                statement.setString(3, txtApellido.getText());
                statement.setString(4, txtTelefono.getText());
                statement.setString(5, txtDirecion.getText());
                statement.setString(6, txtCorreo.getText());
                statement.setString(7, comboRol.getSelectedItem().toString());
                String contra = "";
                for (int i = 0; i < 8; i++) {
                    int numero = (int) (Math.random() * 10) + 1;
                    contra = contra + String.valueOf(numero);
                }
                Properties propiedad = new Properties();
                propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
                propiedad.setProperty("mail.smtp.starttls.enable", "true");
                propiedad.setProperty("mail.smtp.port", "587");
                propiedad.setProperty("mail.smtp.auth", "true");

                Session sesion = Session.getDefaultInstance(propiedad);

                String correoEnvia = "franciscovera873@gmail.com";
                String contrasena = "vmhhqkxzxjbogghp";
                String destinatario = txtCorreo.getText();
                String asunto = "CONTRASEÑA DE REGISTRO";
                String mensaje = "la contraseña para que pueda ingresar es: " + contra;

                MimeMessage mail = new MimeMessage(sesion);

                try {
                    mail.setFrom(new InternetAddress(correoEnvia));
                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                    mail.setSubject(asunto);
                    mail.setText(mensaje);

                    Transport transporte = sesion.getTransport("smtp");
                    transporte.connect(correoEnvia, contrasena);
                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                    transporte.close();

                    JOptionPane.showMessageDialog(null, "Correo enviado");

                } catch (AddressException ex) {
                    JOptionPane.showMessageDialog(this, "No se pudo enviar el correo");
                }
                statement.setString(8, contra);
                statement.execute();
                coneccion.commit();

                txtCedula.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtCorreo.setText("");
                txtDirecion.setText("");
                comboRol.setSelectedIndex(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Correo invalido");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "USUARIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        int x = panelesCrudCliente.getSelectedIndex();
        if (x == 1) {
            String sql = "select * from usuarios";
            try {
                Statement se = coneccion.createStatement();
                ResultSet seter = se.executeQuery(sql);
                modelotabla = new DefaultTableModel();
                Object[] datoscliente;
                modelotabla.addColumn("ID");
                modelotabla.addColumn("CEDULA");
                modelotabla.addColumn("NOMBRES");
                modelotabla.addColumn("APELLIDOS");
                modelotabla.addColumn("TELEFONO");
                modelotabla.addColumn("DIRECCION");
                modelotabla.addColumn("ROL");
                modelotabla.addColumn("CORREO");
                tabla.setModel(modelotabla);
                datoscliente = new Object[8];
                while (seter.next()) {
                    datoscliente[0] = seter.getInt(1);
                    datoscliente[1] = seter.getString(2);
                    datoscliente[2] = seter.getString(3);
                    datoscliente[3] = seter.getString(4);
                    datoscliente[4] = seter.getString(5);
                    datoscliente[5] = seter.getString(6);
                    datoscliente[6] = seter.getString(7);
                    datoscliente[7] = seter.getString(8);
                    modelotabla.addRow(datoscliente);
                    tabla.setModel(modelotabla);
                }
            } catch (SQLException ex) {
                System.out.println("Error de lectura :" + ex.getMessage());
            }

        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void txtCedulaMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMMActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        String sql = "select * from usuarios where CEDULA = '" + txtCedulaB.getText() + "'";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());
            if (seter.getRow() == 0) {
                txtNombreB.setText("");
                txtApellidoB.setText("");
                txtTelefonoB.setText("");
                txtDirecionB.setText("");
                txtRolB.setText("");
                txtCorreoB.setText("");
            }
            while (seter.next()) {
                txtNombreB.setText(seter.getString(3));
                txtApellidoB.setText(seter.getString(4));
                txtTelefonoB.setText(seter.getString(5));
                txtDirecionB.setText(seter.getString(6));
                txtRolB.setText(seter.getString(7));
                txtCorreoB.setText(seter.getString(8));
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        String sql = "select * from usuarios where CEDULA = '" + txtCedulaM.getText() + "'";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            if (seter.getRow() == 0) {
                codAux = -500;
                txtCedulaMM.setText("");
                txtNombreM.setText("");
                txtApellidoM.setText("");
                txtTelefonoM.setText("");
                txtDirecionM.setText("");
                comboRolM.setSelectedIndex(0);
                txtCorreoM.setText("");

                txtCedulaMM.setEditable(false);
                txtNombreM.setEditable(false);
                txtApellidoM.setEditable(false);
                txtTelefonoM.setEditable(false);
                txtDirecionM.setEditable(false);
                actulizarM.setEnabled(false);
            }
            while (seter.next()) {
                codAux = seter.getInt(1);
                txtCedulaMM.setText(seter.getString(2));
                txtNombreM.setText(seter.getString(3));
                txtApellidoM.setText(seter.getString(4));
                txtTelefonoM.setText(seter.getString(5));
                txtDirecionM.setText(seter.getString(6));
                comboRolM.setSelectedItem(seter.getString(7));
                txtCorreoM.setText(seter.getString(8));

                txtCedulaMM.setEditable(true);
                txtNombreM.setEditable(true);
                txtApellidoM.setEditable(true);
                txtTelefonoM.setEditable(true);
                txtDirecionM.setEditable(true);
                actulizarM.setEnabled(true);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar2ActionPerformed

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        String sql = "select * from usuarios where CEDULA = '" + txtCedulaE.getText() + "'";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            if (seter.getRow() == 0) {
                codAux = -500;
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                txtRolE.setText("");
                txtCorreoE.setText("");
                btnEliminar.setEnabled(false);
            }
            while (seter.next()) {
                codAux = seter.getInt(1);
                txtNombreE.setText(seter.getString(3));
                txtApellidoE.setText(seter.getString(4));
                txtTelefonoE.setText(seter.getString(5));
                txtDirecionE.setText(seter.getString(6));
                txtRolE.setText(seter.getString(7));
                txtCorreoE.setText(seter.getString(8));
                btnEliminar.setEnabled(true);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar3ActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDirecionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDirecionKeyTyped

    private void txtCorreoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoMKeyTyped
        
    }//GEN-LAST:event_txtCorreoMKeyTyped

    private void buscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar4ActionPerformed
        String sql = "select * from usuarios where CEDULA = '" + txtCedulaAC.getText() + "'";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());
            if (seter.getRow() == 0) {
                txtCorreoAC.setText("");
                actulizarAC.setEnabled(false);
                codAux = -500;
            }
            while (seter.next()) {
                txtCorreoAC.setText(seter.getString(8));
                actulizarAC.setEnabled(true);
                codAux = seter.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }//GEN-LAST:event_buscar4ActionPerformed

    private void actulizarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarACActionPerformed
            String contra = "";
        for (int i = 0; i < 8; i++) {
            int numero = (int) (Math.random() * 10) + 1;
            contra = contra + String.valueOf(numero);
        }
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);

        String correoEnvia = "franciscovera873@gmail.com";
        String contrasena = "vmhhqkxzxjbogghp";
        String destinatario = txtCorreoAC.getText();
        String asunto = "CONTRASEÑA DE REGISTRO";
        String mensaje = "la contraseña para que pueda ingresar es: " + contra;

        MimeMessage mail = new MimeMessage(sesion);

        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            JOptionPane.showMessageDialog(this, "Correo enviado");
            String sql = "update usuarios set CONTRACENIA = '" + contra + "', CAMBIO = FALSE where id=" + codAux;
            Statement se = coneccion.createStatement();
            se.executeUpdate(sql);
            coneccion.commit();
            txtCorreoAC.setText("");
            actulizarAC.setEnabled(false);
            codAux = -500;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se pudo enviar el correo");
        }
    }//GEN-LAST:event_actulizarACActionPerformed

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtDirecionMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDirecionMKeyTyped

    private void txtCedulaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaBKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaBKeyTyped

    private void txtCedulaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyTyped

    private void txtCedulaMMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMMKeyTyped

    private void txtTelefonoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTelefonoMKeyTyped

    private void txtCedulaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaEKeyTyped

    private void txtCedulaACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaACKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaACKeyTyped
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarAC;
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel agregarClientes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JLabel apillido2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton buscar3;
    private javax.swing.JButton buscar4;
    private javax.swing.JLabel buscarclientes;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel cedula4;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JComboBox<String> comboRolM;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion3;
    private javax.swing.JLabel direccion4;
    private javax.swing.JLabel direcion10;
    private javax.swing.JLabel direcion11;
    private javax.swing.JLabel direcion2;
    private javax.swing.JLabel direcion3;
    private javax.swing.JLabel direcion4;
    private javax.swing.JLabel direcion5;
    private javax.swing.JLabel direcion6;
    private javax.swing.JLabel direcion7;
    private javax.swing.JLabel direcion8;
    private javax.swing.JLabel direcion9;
    private javax.swing.JLabel eliminarcliente;
    private javax.swing.JLabel ingreseCedula;
    private javax.swing.JLabel ingreseCedula1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listadeClientes;
    private javax.swing.JLabel modificarcliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel telefono4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoB;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaAC;
    private javax.swing.JTextField txtCedulaB;
    private javax.swing.JTextField txtCedulaE;
    private javax.swing.JTextField txtCedulaM;
    private javax.swing.JTextField txtCedulaMM;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoAC;
    private javax.swing.JTextField txtCorreoB;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtCorreoM;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtDirecionB;
    private javax.swing.JTextField txtDirecionE;
    private javax.swing.JTextField txtDirecionM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtRolB;
    private javax.swing.JTextField txtRolE;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoB;
    private javax.swing.JTextField txtTelefonoE;
    private javax.swing.JTextField txtTelefonoM;
    // End of variables declaration//GEN-END:variables
}
