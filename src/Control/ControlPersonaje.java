/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import ventana.Personaje;
import ventana.MostrarDatos;
import ventana.Equipo;
/**
 *
 * @author Francisco Puas
 */
public class ControlPersonaje {
    
    // sumar stats
   public String botonSuma(String boton)
   {
       
            int Istr= Integer.parseInt(boton);
            int sumaStr=Istr+1;
            String botonS= (Integer.toString(sumaStr));
            return botonS;
   }
   // restar stats
   public String botonResta(String boton)
   {
       String botonR;
       int menosInt;
       int Iint= Integer.parseInt(boton);
       menosInt=Iint-1;
       botonR=(Integer.toString(menosInt));
       
       return botonR;
   }
   
   // asignar stats a label
   
   public int stats(String stats)
   {
       int Istats= Integer.parseInt(stats);
       return Istats;
   }
   
   //metodo para esconder ventanas al iniciar ventana mostrar
   public void esconder(Personaje personaje, MostrarDatos mostrar, Equipo equipo)
   {
       equipo.setVisible(false);
       personaje.setVisible(false);
       
       mostrar.setVisible(true);
   }
  
}
