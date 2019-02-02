/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;


public class Ventana {
    
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        
        
           
       

        
         Hilo hilo= new Hilo();
         Personaje personaje= new Personaje();
        
        personaje.MostrarEquipo();
        personaje.setVisible(true);
        
        hilo.run(personaje);
        
        
           
        
        
        if(personaje.isVisible())
        {   
            
            hilo.start();
            
            
        }
        
        
        
    }
    
}


