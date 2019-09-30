package curso.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteConexao {
    
    public static void main(String[] args) {
        System.out.println("Testando Conexão..");
        Connection con = 
                FabricaConexao.getConnection();
        if(con != null){
            try {
                System.out.println(
                        "Conexão estabelecida: " +
                                con.getCatalog());
            } catch (SQLException ex) {
                Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
        }
    }
    
}
