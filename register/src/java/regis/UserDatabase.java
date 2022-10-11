/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regis;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author L2S-1
 */
public class UserDatabase {
 Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(user user){
        boolean set = false;
        try{
           
           PreparedStatement pt = this.con.prepareStatement("insert into l2s.user values(?,?,?,?,?)");
           pt.setInt(1, user.getUser());
           pt.setString(2, user.getName());
           pt.setInt(3, user.getRole());
           pt.setString(4, user.getEmail());
           pt.setString(5, user.getPassword());
           pt.executeUpdate();
           System.out.println("status success");
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}


