/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Station;

/**
 *
 * @author marwansalem
 */
public abstract class Employee {
  public  String loginid;
  public  String password;


    
    
 public String empchecker(String l){
       if (l.startsWith("m") || l.startsWith("M")){
           return "m";
       }
       else return "d";
    }
        
    }


    

