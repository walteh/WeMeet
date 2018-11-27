/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import java.util.ArrayList;

/**
 * Event Class for GroupEm
 * CSC 3380 Project
 * @author Walter Scott, Ian Andrepont, Leigh Wright, Scott Walker
 * @since 11/27/18
 * @see GroupEm, Login, HomePage, EventPage, CreatePage
 */

public class Event {
    String name;
    String date;
    String description;
    String creator;
    ArrayList<String> invites = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();
    
    public Event(String n, String c, String desc, String dat){
        name = n;
        date = dat;
        description = desc;
        creator = c;
        //invites = i;
        
    }
    
    public void addComment(String c, String user){
        comments.add(user + ": " + c);
        
    }
    
    public String commentToString(){
        String output = "";
        for(int i = 0; i < comments.size(); i++){
            output += String.format("%s%n", comments.get(i));
        }
        return output;
    }
    
    public void addInvitee(String user){
        invites.add(user);
    }
    
    public String inviteeToString(){
        String output = "";
        for(int i = invites.size() - 1; i >= 0; i--){
            if (i>0) output += String.format("%s, ", invites.get(i));
            else output += invites.get(i);
        }
        return output;
    }
    
}
