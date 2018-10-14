/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhco
 */
public class Jdbcconnection {

    /**
     * @param args the command line arguments
     */


/**
 *
 * @author anhco
     * @return 
     * @throws java.sql.SQLException
 */

    public static Connection getConnection() throws SQLException
    {
        final String URL="jdbc:mysql://localhost:3306/edict";
        final String USER="root";
        final String password="lecong";
        try {
            Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection(URL, USER, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jdbcconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
    

