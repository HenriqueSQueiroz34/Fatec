import java.sql.*;

public class GenericDao {
    
    private Connection c;
    
    public GenericDao(){
        super();
    }
    
    public Connection getConn() throws ClassNotFoundException, SQLException{
        String host = "localhost"; // IP máquina do server
        String dbName = "Clinica"; // DB name
        String user = "sa"; // Username
        String senha = "T*e33l555ef33333"; // Senha do User
        
        Class.forName("net.sourceforge.jtds.jdbc.Driver"); // Referenciando Classe lib
        
        // String da Conexão
        c = DriverManager.getConnection(
                String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;"
                        + "user=%s;password:%s;", host,dbName,user,senha));
        
        return c;
    }
}
