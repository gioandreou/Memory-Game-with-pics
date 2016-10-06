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
 *  H class card me tis plirofories kai tis leitourgies twn kartwn tou paixnidiou
 */
public class Card {
    
    private int id;
    public int state ;
    private int value ;
    
    
    public Card (int id, int value){
        
        this.value = value ;
        this.id = id;
        state = 0 ; 
    }
    
    public void flip (){
        
        if(state == 0)
           state = 1;
        else if(state == 1)
           state = 0;
    
    }
    /*
    *elegxos gia ton an einai idies oi kartes
    */
    public boolean equalCard(Card anotherCard)
    {
        if((anotherCard.getId() == id) && (anotherCard.getValue() == value))
            return true;
        return false;
    }
    
    public void show(){
    // Oi kartes exoun brethei kai feugoun apo to grid   
        state = 1;
    }
    
    /*
    *pernei ton kodiko tis kathe kartas
    */
     public int getId(){
      
         return id;
    }
   
     /*
     *Pernei ti boithitiki timi-deikti gia to kathe group omoion karton
     */
     public int getValue(){
         
        return value;
    }
     
     
    
    
    
}
