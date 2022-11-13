package ExamenPrograII;
import ExamenPrograII.*;
import com.mysql.jdbc.Connection;
import static ExamenPrograII.conexion.con;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class  conexion {
   
    public static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8";
    
    public Connection conectar(){
        
        con=null;  
        try{
           con=(Connection) DriverManager.getConnection(url, user,pass);
           if(con!=null){   
           }   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    } 
}