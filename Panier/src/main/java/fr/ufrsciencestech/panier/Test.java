/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author at560075
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Panier test = new Panier();
        test.ajouterOrange(new Orange(5,"France"));
        test.ajouterOrange(new Orange(6,"Espagne"));
        test.ajouterOrange(new Orange(7,"Italie"));
        test.boycotteOrigine("Italie");
        System.out.println(test.toString());
    }
    
}
