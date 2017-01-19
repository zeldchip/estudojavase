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
public class SegmentIntelHex implements IntSegmentInteHex {
    
    private byte[] records;
    private byte crc;
    private int size;
    private byte[] address;
    private int addresstype;
       

    @Override
    public byte[] getBytes() {
       if(records != null)
           return records;
       return null;           
    }

    public SegmentIntelHex(byte[] records, byte[] address) {
        this.records = records;
        this.address = address;
        addresstype=0;
    }
    
    public void parser(String s){
        
        
    }

    @Override
    public int getNumberBytes() {
       return records.length;
    }

   
    @Override
    public byte getCRC() {
      return crc;          
    }
    
   
    @Override
    public byte[] getAddress() {
        return address;
    }

    @Override
    public void setAddress(byte[] end) {
        if(end != null)        
            this.address = end;
        
    }
    
}
