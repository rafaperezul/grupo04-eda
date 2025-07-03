/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import Entidades.UserData;
import TDA.Simple.*;

/**
 *
 * @author migue
 */
public class UserManager {
    private static LinkedList<UserData> users = new LinkedList<>();
    
    public static void initialize() {
        UserData user = new UserData("admin", "12345");
        users.addLast(user);
        
        System.out.println("UserManager data loaded!");
    }
    
    public static LinkedList<UserData> users() {
        return users;
    }
    
    public static void addUser(UserData userData) {
        users.addLast(userData);
    }
    
    public static boolean validateCred(String username, String password) {
        Node<UserData> ptr = users.L();
        
        while (ptr != null) {
            UserData user = ptr.item();
            
            if (user.username.equals(username) && user.password.equals(password)) {
                return true;
            }
            
            ptr = ptr.next();
        }
        return false;
    }
}
