/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Heiner Perez
 */
public class conectar {
      Connection conect = null;
     public Connection conexion(){
     
     try {
                Class.forName("org.gjt.mm.mysql.Driver");
		conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydb?characterEncoding=latin1&useConfigs=maxPerformance","root","hperez1989" );
                JOptionPane.showMessageDialog(null, "conectado");			
            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
		JOptionPane.showMessageDialog(null,"Error"+ e);			
            }	
         Connection conexion = null;
          return conexion;
     }
     
   
    
}
