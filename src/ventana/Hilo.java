/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author Francisco Puas
 */
public class Hilo extends Thread {

    
    public void run(Personaje per)
    {
        per.calculoHp();
    }
    
}


