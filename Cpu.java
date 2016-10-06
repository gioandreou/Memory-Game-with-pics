/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author giorgos andreou 2334 & kostas tsioukas 2421
 * 
 * CPU = O paiktis pou tha elegxetai apo ton upologisti 
 * Oi leitourgies pou tha kanei mono o CPU kai i dunatotita mnimis ton kiniseon
 * Einai child tis class "Player"
 */

import java.util.HashMap;
        
public class Cpu extends Player {
    
    /*
    * Apothikeusi ton karton kai ton id auton gia ti mnimi tou upologisti
    */
    
    private HashMap<Integer,Integer> CpuMemory ;
    private int choice ;
    
    
    public Cpu(String name) {
        super(name);
        CpuMemory = new HashMap<>() ;
    }
    /*
    *Epilogi tou epipedou mnimis tou upologisti
    *1.xrusopsaro
    *2.kagkouro
    *3.elefanta
    */
    public int ChoiceLevel () {
        
        return choice ;
    }
    
    
    
    public void AmauterCpu (){
        
        
    }
    
   
    public void MediumCpu () {
        
    }
    
   
    public void VeteranCpu (){
    
    }
        
    
    
    
}
