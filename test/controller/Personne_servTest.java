
package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class Personne_servTest {
    
    public Personne_servTest() {
    }
    
   
    
   
    @Test
    public void testDoPost() throws Exception {
       //mock
        HttpServletRequest  request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher   dispatcher=mock(RequestDispatcher.class);
       //intance
         
       //whene
        when(request.getParameter("nom")).thenReturn("YOUNES");
        when(request.getParameter("age")).thenReturn("50");
        when(request.getRequestDispatcher("affiche.jsp")).thenReturn(dispatcher);
        Personne P=new Personne();
        String message = P.calculerRest(50);
      
        Personne_serv personne_serv = new Personne_serv();
        
         personne_serv.doPost(request, response);
       //verify
       
        verify(request).setAttribute("message", message);
        verify(dispatcher).forward(request, response);
        
       
    

    
    }
    
}
