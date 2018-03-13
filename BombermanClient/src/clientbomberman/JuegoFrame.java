/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbomberman;

import javax.swing.JFrame;

/**
 * Pablo Arriola: 131115
 * Olga Cobaquil;13020
 * Andres Oliva; 12149
 */
public class JuegoFrame extends JFrame{

    public JuegoFrame(ControlJugador control) {
        getContentPane().add(control);
        pack();
        setSize(620,640);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);     
    }
    
    
    
}
