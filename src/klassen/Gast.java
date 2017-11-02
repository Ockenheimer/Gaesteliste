/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen;

/**
 *
 * @author Markus
 */
public class Gast implements Comparable<Gast>{

    //Name öffentlich
    String name;
    //Anzahl nicht öffentlich
    private int anzahl;
    //Getter Anzahl

    public String getName() {
        return name;
    }

    public int getAnzahl() {
        return anzahl;
    }
    //Setter Anzahl

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    //Constructer
    public Gast(String name, int anzahl) throws GastExceptions {
        if (name.isEmpty()) {
            throw new GastExceptions("Name darf nicht leer sein.");
        }
       
        if (anzahl < 0) {
            throw new GastExceptions("Anzahl der Gäste darf nicht negativ sein.");
        }
        this.name = name;
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return name + " - " + anzahl + " Personen";
    }

    @Override
    public int compareTo(Gast o) {
        return this.name.compareTo(o.name);
    }

}
