package Todo;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class coneccion {
   Connection con;
    
public Connection conectar(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=(Connection) DriverManager.getConnection("jdbc:ucanaccess://Tablas.accdb");
           // System.out.println(" La base fue conectada"  );
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Nose conecto con la base de datos  "+e.getMessage()  );
            System.exit(0);
        }
        return con ;
    }
    
    
}
