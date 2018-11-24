/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author walter
 */
public class GroupEm {
    final static HomePage hp = new HomePage();
    final static Container c = hp.getContentPane();
    
    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();
    public static String userPass;
    public static String userUsername;
    public static boolean loggedIn = false;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        usernames.add("walter");
        usernames.add("ian");
        usernames.add("leigh");
        passwords.add("s");
        passwords.add("a");
        passwords.add("w");
        
        Login log = new Login(hp,true);
        log.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
