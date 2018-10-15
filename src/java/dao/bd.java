/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */

public class bd {

    public bd(){
    }
    
    public Connection getMysql(){
        Connection c = null;
        
        String url="jdbc:mysql://localhost:3306/upn2018?useTimezone=true&serverTimezone=UTC";
        String usr="root";
        String pwd="06855645";
        
        try {
            DriverManager.registerDriver(new Driver());
            c = DriverManager.getConnection(url, usr, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
