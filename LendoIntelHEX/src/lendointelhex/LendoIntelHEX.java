/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendointelhex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zeld.intelhex.LineHEX;

/**
 *
 * @author Vitor
 */
public class LendoIntelHEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileReader read = new FileReader("C:/IntelHex/intelhex.hex");
           // BufferedReader bread = new BufferedReader(read);
            StringBuilder append = new StringBuilder();
           
            Scanner sc = new Scanner(read);
            int numberline = 0;

            System.out.println(LineHEX.parserHEX(sc.nextLine())[0]);
            
            
               
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LendoIntelHEX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LendoIntelHEX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
