/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author at560075
 */
public class Panier {
    
    ArrayList<Orange> panier;
    int maxOrange;
    int nbOrange;
    
    public Panier(){
        
         this.panier=new ArrayList<Orange>();
         this.maxOrange = 20;
         this.nbOrange = 0;
    }
    
    public int getMaxOrange(){
        
        return this.maxOrange;
    }
    
    public int getNbOrange(){
        
        return this.nbOrange;
    }
    
    public Orange getOrange(int i)
    {
        return this.panier.get(i-1);
        
    }
  
    
    public boolean estPlein()
    {
        if (nbOrange == this.maxOrange)
        {
            return true;
        }else
        {
            return false;
        }
        
    }
    
    public boolean estVide()
    {
        if(nbOrange > 0)
        {
            return false;
        }else
        {
            return true;
        }
    }
    
    public String toString(){
        
        String texte="";
        
        for (int i = 0 ; i < nbOrange ; i++)
        {
            texte = texte + this.panier.get(i).toString();
            texte = texte + "\n";
        }
            
        return texte;
    }
    
    public boolean Equals(Panier thePanier){
        
        boolean test = true;
        
        for ( int i = 0 ; i < this.nbOrange ; i++)
        {
            if (!this.panier.get(i).equals(thePanier.panier.get(i)))
            {
                test = false;
                
            }
        }
        
        return test;
        
        
    }
    
    public void ajouterOrange(Orange orange){
        
        if (this.nbOrange < this.maxOrange)
        {
            this.panier.add(orange);
            nbOrange ++;
        }
        
        
    }
    
    public void retirerOrange(){
        
        if(!this.estVide() && nbOrange > 0)
        {
            this.panier.remove(nbOrange-1);
            nbOrange--;
        }
        
    }
    
    public int getPrix(){
        
        int prixTotale = 0;
        
        for ( int i = 0 ; i < nbOrange ; i++)
        {
            prixTotale = prixTotale + this.panier.get(i).getPrix();
            
        }
       return prixTotale; 
        
    }
    
    public void boycotteOrigine(String theOrigine)
    {
        if(nbOrange > 0)
        {
              for (int i = 0; i < nbOrange ; i++)
        {
            if (this.panier.get(i).getOrigine().equals(theOrigine))
            {
                this.panier.remove(i);
                this.nbOrange--;
            }
        }
        }
        
      
        
    }


}