
package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonneTest {
    
    public PersonneTest() {
    }
    
  

    @Test
    public void testCalculerRest() {
        
       int age =64;
        Personne personne = new Personne();
       
        String result = personne.calculerRest(50);
        if (age>=65) 
        {
             assertEquals("Vous êtes déjà à la retraite.", "");
        } 
        else 
        { 
            assertEquals("Il vous reste " + 15 + " ans avant la retraite.", result);
        }
       
        
    }
    
}
