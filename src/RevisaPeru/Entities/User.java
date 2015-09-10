/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.Entities;


/**
 *
 * @author user
 */
public class User extends Person {
    private int id;
    private String userName;
    private String password;
    private int rolId;

    public User() {
    }

    public User(int id, String userName, String password, int rolId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.rolId = rolId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }


    
}
