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
 * Periexontai oi koines leitourgies tou anthropinou paikti kai tou CPU 
 * Einai parent twn classes "Human" & "Cpu"
 */
public abstract class Player {
    
    private int attemps ;
    private String name  ;
    
    public Player (String name){
        this.name = name ;
        attemps = 0;
    }
    
    public void countAttemps() {
        /*
        *Metraei tis prospatheies tou paikti mexri to telos 
        */
        attemps++;
    }
    
    public String setName () {
        
        return name ;
    }
    
    
    
}
