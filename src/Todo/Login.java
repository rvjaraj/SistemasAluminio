/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author vinic
 */
public class Login {

    public static void main(String[] args) {
        coneccion con = new coneccion();
        Connection coneccion = con.conectar();
        Hashtable<String, String> logininformation = new Hashtable<String, String>();

        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setPreferredSize(new Dimension(300, 100));
        JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
        label.add(new JLabel("CORREO", SwingConstants.RIGHT));
        label.add(new JLabel("CONTRACEÑA", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        JTextField correo = new JTextField();
        controls.add(correo);
        JPasswordField contra = new JPasswordField();
        controls.add(contra);
        panel.add(controls, BorderLayout.CENTER);

        JOptionPane.showMessageDialog(null, panel, "login", JOptionPane.QUESTION_MESSAGE);
        String sql = "select * from usuarios where correo = '" + correo.getText() + "' AND CONTRACENIA = '" + contra.getText() + "'";
        System.out.println(sql);
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            System.out.println(seter.toString());

            boolean bandera = true;
            while (seter.next()) {
                String rol = seter.getString(7);
                boolean cambio = seter.getBoolean(10);
                int codigo = seter.getInt(1);
                if (cambio == false) {
                    panel = new JPanel(new BorderLayout(10, 10));
                    panel.setPreferredSize(new Dimension(300, 100));
                    label = new JPanel(new GridLayout(0, 1, 2, 2));
                    label.add(new JLabel("NUEVA CONTRACEÑA", SwingConstants.RIGHT));
                    label.add(new JLabel("CONFIRMAR CONTRACEÑA", SwingConstants.RIGHT));
                    panel.add(label, BorderLayout.WEST);

                    controls = new JPanel(new GridLayout(0, 1, 2, 2));
                    JPasswordField contra1 = new JPasswordField();
                    controls.add(contra1);
                    JPasswordField contra2 = new JPasswordField();
                    controls.add(contra2);
                    panel.add(controls, BorderLayout.CENTER);
                    boolean valida = true;
                    while (valida) {
                        JOptionPane.showMessageDialog(null, panel, "ACTUALIZAR LA CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);
                        if(contra1.getText().equals(contra2.getText())){
                            sql = "update usuarios set CAMBIO = TRUE, CONTRACENIA = '" +contra1.getText() +"' where ID="+codigo;
                            se = coneccion.createStatement();
                            se.executeUpdate(sql);
                            coneccion.commit();
                            valida = false;
                            JOptionPane.showMessageDialog(null, "CONTRASEÑIA ACTUALIZADA");
                        }else{
                            JOptionPane.showMessageDialog(null, "LA CONTRACEÑA NO COINCIDE");
                        }
                    }
                    
                }
                if (rol.equals("ADMIN")) {
                    Principal p = new Principal();
                    p.main(args);
                    bandera = false;
                } else if (rol.equals("USER")) {
                    JOptionPane.showMessageDialog(null, "ES USER");
                    User u = new User();
                    u.setCodAux(codigo);
                    u.setVisible(true);
                    u.llenarDatos();
                    bandera = false;

                }
            }
            if (bandera) {
                JOptionPane.showMessageDialog(null, "No se encotro correo o contraseña");
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
    }

}
