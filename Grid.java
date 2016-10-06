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
 * H class Grid einai to plegma sto opoio tha topothetountai oi kartes .
 * Einai parent twn classes "FixGrid" & "RandomGrid"
 */
public abstract class Grid {
    
    private Card[] cards;
    
    
    public Grid(int numberOfCards){
    
        cards = new Card[numberOfCards];
        
        
    }
    
    public void shuffle(){ 
        /**
         * Edo tha anakateuotai oi kartes sto plegma kata tin eisodo
         */
        
    }
    
    
    
}
