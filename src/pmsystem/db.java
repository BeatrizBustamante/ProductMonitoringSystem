
package pmsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
     public static Connection mycon (){
    
    Connection con = null ;
        
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monitoringsystemdb","root","");
        
    } catch (Exception e){
        
        System.out.println(e.getMessage());
    }
       
    return con;
    }
}

