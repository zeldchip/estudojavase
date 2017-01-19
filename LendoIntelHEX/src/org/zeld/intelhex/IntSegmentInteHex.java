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
public interface IntSegmentInteHex {
    
    public byte[] getBytes();
    public int getNumberBytes();
    public byte[] getAddress();
    public void setAddress(byte[] end);
    public byte getCRC();        
    
}
