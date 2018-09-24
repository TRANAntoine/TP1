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
    
    public class Orange {
    
        int prix;
        String origine;
    
        
    public Orange(){
     
        this.prix=0;
        this.origine="Inconnu";
        
    }
    
    public Orange(int p,String o){
        
        if (p < 0){
            
            this.prix = 0;
        }
        else{
            
            this.prix = p;
        }
        
        this.origine = o;
        
    }
    
    public int getPrix(){
        
        return this.prix;
    }
    
    public String getOrigine(){
        
        return this.origine;
    }

    
    public String toString(){
        
        return "Le prix de l'Orange est de " + this.prix + " et elle vient de " + this.origine;
        
    }   
    
    public boolean equals(Orange theOrange){
        
        if ( this.prix == theOrange.prix && this.origine.equals(theOrange.origine))
        {       
            return true;
        }else
        {
            return false;
        }
    
    }
    
    }
    