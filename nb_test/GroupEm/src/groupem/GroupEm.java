/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author walter
 */
public class GroupEm {
    public static HomePage hp;
    //final static Container c = hp.getContentPane();
    public static Panel pan;
    
    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();
    public static ArrayList<Event> eventss = new ArrayList<>();
    public static ArrayList<Event> userEvents = new ArrayList<>();
    public static String[] userEventNames = new String[]{"yo","Yo"};
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
        
        ArrayList<String> in1 = new ArrayList<>();
        in1.add("walter");
        in1.add("ian");
        in1.add("leigh");
        Event one = new Event("carnival", "1", "1", "1", in1);
        eventss.add(one);
        
        ArrayList<String> in2 = new ArrayList<>();
        in2.add("walter");
        in2.add("ian");
        in2.add("leigh");
        Event two = new Event("hot dog contest", "2", "2", "2", in2);
        eventss.add(two);
        
        ArrayList<String> in3 = new ArrayList<>();
        in3.add("walter");
        in3.add("ian");
        in3.add("leigh");
        Event three = new Event("funeral", "3", "3", "3", in3);
        eventss.add(three);
        
        
        
        Login log = new Login(hp,true);
        log.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    log.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static void updateUserEvents(String user){
        int count = 0;
        for(Event e : eventss){
             if(e.invites.contains(user)) count++;
        }
        String[] temp = new String[count];
        for(int e = 0; e < temp.length; e++){
             if(eventss.get(e).invites.contains(user)) {
                 userEvents.add(eventss.get(e));
                 temp[e] = eventss.get(e).name;
             }
             
        }
        userEventNames = temp;
    }
    
}
