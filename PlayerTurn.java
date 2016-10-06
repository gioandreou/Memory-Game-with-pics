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
 * Kathorizetai poios paiktis exei seira na paixei kai pos allazei h seira ston 
 * epomeno paikti
 */
public class PlayerTurn {
  
    
    private String name;
    private int move;
    private boolean turn;
    private boolean optionTurn ; 
    
    
    public PlayerTurn (String Name, int Move, boolean turn ){
		
	name = Name;
	move = Move;
        turn = false ;
    }
    
    public String getName(){

        return name;
    }
    
    public int getMove(){
       
        return move;
    }
    
    
    public void changeTurn () {
        
      //  Card card = new Card();
      // boolean turn = card.equalCard(); 
         
        /** elegxos (turn) me metabliti (OptionTurn)tin opoia tin perno apo tin
        * SwiftTurn . Otan tha energopoieietai h swiftTurn, tote h metabliiti
        * OptionTurn = false, oste o 2os elegxos stin AND na einai panta lathos .
        * Otan den tha energopoeite h SwiftTurn tote to OptionTurn=true, oste o elegxos 
        * AND na exartatai mono apo to "turn = card.equalCard() " .
        *
        */  
     
     }
         
    
    public String PlayerHasTurn () {
        /*
        * Kathorizetai poianou seira einai na paixei kai emfanizei to onoma 
        * tou paikti pou paizei
        */
        return name ;
    }
    
    
    
}


