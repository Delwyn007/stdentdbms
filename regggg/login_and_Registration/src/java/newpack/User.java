                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpack;

/**
 *
 * @author L2S-1
 */
public class User {
    int user_id;
    String name;
    int role_id;
    String email;
    String password_hash;

    public User() {
    }

    public User(int user_id, String name,int role_id, String email, String password_hash) {
        this.user_id = user_id;
        this.name = name;
        this.role_id = role_id;
        this.email = email;
        this.password_hash = password_hash;
    }

    public User(String name,int role_id, String email, String password_hash) {
        this.name = name;
        this.role_id = role_id;
        this.email = email;
        this.password_hash = password_hash;
    }

    public User(int role_id, String email, String password_hash) {
        this.role_id = role_id;
        this.email = email;
        this.password_hash = password_hash;
     }
    
      public User(String email, String password_hash) {
        this.email = email;
        this.password_hash = password_hash;
      }

    public int getU_Id() {
        return user_id;
    }

    public void setU_Id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public int getR_Id() {
        return role_id;
    }

    public void setR_Id(int role_id) {
        this.role_id = role_id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password_hash;
    }

    public void setPassword(String password_hash) {
        this.password_hash = password_hash;
    }
    
    
    
}



