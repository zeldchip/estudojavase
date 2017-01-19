/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.zeld.intelhex;

/**
 *
 * @author Vitor
 */
public class LineHEX {
    
    String line;
    
    public LineHEX(String line) {
       if (line.matches(":[0-9a-fA-F]+"))
       {
           this.line = line;
       }
    }
    
    public static short[] parserHEX(String line)
    {
        if (line.matches(":[0-9a-fA-F]+")) // Verifica se a linha é valida
       {
            String replaceFirst = line.replaceFirst(":", ""); // apaga o initiator line
            short parseInt = Byte.parseByte(replaceFirst.substring(0, 2),16);
            short[] tmp = new short[parseInt+5];
            tmp[0] = parseInt; 
            int a;
            int j = 2;
            
            for(int i=1;i<parseInt+5;i++,j+=2)
            {  
               tmp[i] = Short.parseShort(replaceFirst.substring(j,j+2), 16);           
            }
           return tmp;
       }
        return null;
    } 
    
    
    
}
