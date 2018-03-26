/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Station;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author marwansalem
 */
public class createfile {
    public Formatter x;
    
    public void openFile(){
        System.out.println("opening done");
        try{
            x = new Formatter("chinese.txt");
        }
        catch(Exception e){
            System.out.println("You have an error");
        }
    }
    
    public void addtoFILE(){
        System.out.println("addition done");
        x.format("%s","hamada");
    }
    
    public void closefile(){
        System.out.println("closing done");
        x.close();
    }
    
    
}
