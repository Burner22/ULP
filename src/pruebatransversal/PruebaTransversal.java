
package pruebatransversal;

import java.sql.Connection;
import modelo.Conexion;

public class PruebaTransversal {

    public static void main(String[] args) {
        Conexion con = new Conexion ();
        
        Connection c = con.getConnection();
        
    }
    
}
