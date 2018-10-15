/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import be.empleadobe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class empleadodao {

    public empleadodao() {
    }
    
    public List<empleadobe> MostrarEmpleado(){
        List<empleadobe> lista = new ArrayList();
        Connection c = null;
        
        String sql = "insert into empleado (dni,nombre,ape_pat,ape_mat,fecha_nac,email,ubigeo,domicilio,num_tel,nivel_estudio,sueldo_base,num_hijos) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            c = new bd().getMysql();
            PreparedStatement pst = c.prepareStatement(sql);
            
          /*  pst.set
                    
            pst.executeUpdate(sql);*/
            
            
        } catch (SQLException ex) {
            Logger.getLogger(empleadodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
