
package com.mycompany.examtp3;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class NewMain {
static Double[] spese = new Double[8];
static Double prezzo;
static Double strant;

static int maxsp=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        strant = Double.parseDouble(JOptionPane.showInputDialog("dimmi l 'anticipo"));
        
        for(int i=0; i<maxsp; i++ ){
            
        String strprezzo = JOptionPane.showInputDialog("dimmi il prezzo " + (i+1) +"di"+maxsp);
        // converto il prezzo in float
        try {
            prezzo = Double.parseDouble(strprezzo);
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
        Double tot = 0.0;
        Double saldo = 0.0;
        for(int i=0; i<maxsp; i++ ){
            ris+="€ "+spese[i]+"\n";
            tot = Double.sum(tot, spese[i]);
        }
        saldo = strant-tot;
        
        if(saldo>0){
            String diffString = saldo.toString();
            return ris+"Totale € "+tot+"\n"+"Rimangono:"+diffString+"€";
        }else{
            saldo=saldo*-1;
            String diffString = saldo.toString();
            return ris+"Totale € "+tot+"\n"+"Devo avere:"+diffString+"€";
        }
        
    }
    
    
    
}
