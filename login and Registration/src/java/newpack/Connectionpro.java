/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpack;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author L2S-1
 */
public class Connectionpro {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","L2s2b2s");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

