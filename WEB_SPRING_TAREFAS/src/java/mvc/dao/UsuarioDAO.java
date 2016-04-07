/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import mvc.bean.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joyce
 */

@Repository
public class UsuarioDAO {
    
    private final Connection connection;
    
    @Autowired
    public UsuarioDAO(DataSource dataSource){
        try {
            this.connection = dataSource.getConnection();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public boolean validaUsuario(Usuario user){
       String sql = "select * from usuarios where login = ? and senha = ? ";
       try ( 
        PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1,user.getLogin());
        stmt.setString(2,user.getSenha());
        ResultSet rs = stmt.executeQuery();
        if(rs.next()) {
          return true;        
        }else{
            return false;
        }
       } catch (SQLException e) {
         throw new RuntimeException(e);
       }
    }
}
