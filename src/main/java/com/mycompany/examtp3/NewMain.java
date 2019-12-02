/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examtp3;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class NewMain {
static Float[] spese = new Float[8];
static Float prezzo;
static int maxsp=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        for(int i=0; i<maxsp; i++ ){
            
        
        String strprezzo = JOptionPane.showInputDialog("dimmi il prezzo " + (i+1) +"di"+maxsp);
        // converto il prezzo in float
        try {
            prezzo = Float.parseFloat(strprezzo);
            spese[i]=prezzo;
            
        } catch (Exception e) {
            prezzo=null;
            spese[i]=prezzo;
            JOptionPane.showMessageDialog(null, "hai scritto un valore errato e ti è stato assegnato il valore null"); 
        }
            
        }
        System.out.println(getSpese());
    }

    public static String getSpese() {
        String ris="";
        for(int i=0; i<maxsp; i++ ){
            ris+="€."+spese[i]+"\n";
        }
        return ris;
    }
    
    
    
}
