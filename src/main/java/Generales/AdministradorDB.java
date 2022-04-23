
package Generales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AdministradorDB {
    
    private final String url = "jdbc:postgresql://localhost:5432/cinesV",
                        user = "postgres",
                        pass = "daMurq.15";
    
    private Connection con;
    
    public AdministradorDB(){
        this.con = null;
    }
    
    public Connection conectar(){
        try {
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return con;
    }
    
    public ResultSet queryConsultar(String sql){
        try {
            java.sql.Statement ejecutorQuery = con.createStatement();
            ResultSet r = ejecutorQuery.executeQuery(sql);
            return r;
            
        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }
    
    public void queryInsert(String sql){
        try {
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
