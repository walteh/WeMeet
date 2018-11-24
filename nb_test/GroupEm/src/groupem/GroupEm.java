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
    //public static ArrayList<Event> userEvents = new ArrayList<>();
    public static String[] userEventNames = new String[0];
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
        
        
        
        
        Event one = new Event("carnival", "1", "1", "1");
        one.addInvitee("walter");
        one.addInvitee("ian");
        one.addInvitee("leigh");
        one.addComment("walter", "yo1");
        one.addComment("ian", "sup1");
        one.addComment("leigh","bro1");
        eventss.add(one);
        
        

        Event two = new Event("hot dog contest", "2", "2", "2");
        two.addInvitee("walter");
        two.addInvitee("ian");
        two.addInvitee("leigh");
        two.addComment("walter", "yo2");
        two.addComment("ian", "sup2");
        two.addComment("leigh","bro2");
        eventss.add(two);
        
        
        Event three = new Event("funeral", "3", "3", "3");
        three.addInvitee("walter");
        three.addInvitee("ian");
        three.addInvitee("leigh");
        three.addComment("walter", "yo3");
        three.addComment("ian", "sup3");
        three.addComment("leigh","bro3");
        eventss.add(three);
        
        
        
        Login log = new Login(hp,true);
        log.setLocation(797, 426);
        log.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    log.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static Event getEvent(String eventName){
        for(Event e : eventss){
            if(e.name.equals(eventName)) return e;
        }
        return null;
    }
    
    public static void updateUserEvents(String user){
//        int count = 0;
//        for(Event e : eventss){
//             if(e.invites.contains(user)) count++;
//        }
//        String[] temp = new String[count];
//        for(int e = 0; e < temp.length; e++){
//             if(eventss.get(e).invites.contains(user)) {
//                // userEvents.add(eventss.get(e));
//                 temp[e] = eventss.get(e).name;
//             }
//             
//        }
//        userEventNames = temp;
        int count = 0;
        ArrayList<String> templist = new ArrayList<>();
        for(Event e : eventss){
             for(String s : e.invites){
                 if (s.equals(user)) {
                     count++;
                     templist.add(e.name);
                 }
             }
        }
        String[] temp = new String[templist.size()];
        for(int i = 0; i < temp.length; i++){
             temp[i] = templist.get(i);
        }
        userEventNames = temp;
    }
    
    public static int getUserIndex(String user){
        for (int i = 0; i < usernames.size(); i++){
            if (usernames.get(i).equals(user)) return i;
        }
        return -1;
    }
    
}
