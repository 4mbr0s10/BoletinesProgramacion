
package testbdjugadores;
import java.sql.*;
/**
 *
 * @author celta
 */
public class TestBdJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Connection con = null;
String url = "jdbc:mysql://localhost/manualbd";
try {
  con = DriverManager.getConnection(url,"root","");
  Statement st = con.createStatement();
  st.execute("create database if not exists lineadecodigo");
 
} catch (SQLException e) { 
  System.out.println("Error en la conexión:" + e.toString() );
} finally {
  try {
    // Cerramos posibles conexiones abiertas
    if (con!=null) con.close();    
  } catch (Exception e) {
    System.out.println("Error cerrando conexiones: "
      + e.toString());
  } 
}
        
        
        
        MarcoBD mb = new MarcoBD();
        mb.show();
    }
    
}
