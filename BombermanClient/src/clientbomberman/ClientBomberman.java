/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbomberman;

import com.google.gson.Gson;
import java.io.IOException;
import javax.swing.JFrame;

/**
 * Pablo Arriola: 131115
 * Olga Cobaquil;13020
 * Andres Oliva; 12149
 */
public class ClientBomberman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
      Inicio i=new Inicio();
      i.setVisible(true);
      /**String ip="127.0.0.1";
      ControlJugador j=new ControlJugador(new Jugador(1,1,1),ip,4001);
      new JuegoFrame(j);
      ControlJugador j1=new ControlJugador(new Jugador(2,18,1),ip,4002);
      new JuegoFrame(j1);
       **/ 
               
       
       //ventana.setSize(800, 800);
        
    }
    
}
