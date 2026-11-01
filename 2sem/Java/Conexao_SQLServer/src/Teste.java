import java.sql.*;

public class Teste {
    public static void main(String args[]){
        GenericDao genericDao = new GenericDao();
        
        try{
            Connection c = genericDao.getConn();
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.out.println(sgbd);
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
