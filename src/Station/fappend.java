/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Station;

import java.io.*;

/**
 *
 * @author marwansalem
 */
public class fappend {
    
    public void write(String s,File f) throws IOException {
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.close();
        
        }
    
    
    
    
    
    
    
    
    
    
}
