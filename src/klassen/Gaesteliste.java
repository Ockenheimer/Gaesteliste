/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus
 */
public class Gaesteliste extends ArrayList<Gast>{

    public Gaesteliste() {
    }

    public int getSumme() {
        return modCount;
    }

   @Override
    public String toString() {
        String ausgabeString = "";

        for (Gast gast : this) {
            ausgabeString += gast + "\n";
        }

        return ausgabeString;
    }
    
    public static void TestGaesteliste(){
        Gaesteliste gaesteliste = new Gaesteliste();
        
        
        try {
            gaesteliste.add(new Gast("Johannes Tragesser", 4));
            gaesteliste.add(new Gast("Chuck Norris", 2));
            gaesteliste.add(new Gast("Roger Rabit", 0));
            
        } catch (GastExceptions ex) {
            Logger.getLogger(Gaesteliste.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(gaesteliste);
    }
    
}
