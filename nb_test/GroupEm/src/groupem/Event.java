/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import java.util.ArrayList;

/**
 *
 * @author walter
 */
public class Event {
    String name;
    String date;
    String description;
    String creator;
    ArrayList<String> invites = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();
    
    public Event(String n, String c, String desc, String dat, ArrayList i){
        name = n;
        date = dat;
        description = desc;
        creator = c;
        invites = i;
        
    }
    
    public void addComment(String c, String user){
        comments.add(user + ": " + c);
        
    }
    
    public String commentToString(){
        String output = "";
        for(int i = comments.size() - 1; i >= 0; i--){
            output += String.format("%S%n", comments.get(i));
        }
        return output;
    }
    
}
