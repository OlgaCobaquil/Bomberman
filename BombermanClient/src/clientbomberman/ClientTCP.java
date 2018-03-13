/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbomberman;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * Pablo Arriola: 131115
 * Olga Cobaquil;13020
 * Andres Oliva; 12149
 */
public class ClientTCP {
    private String ip="127.0.0.1"; 

    public ClientTCP(String ip) {
        this.ip = ip;
    }

    public ClientTCP() {
    }
    
    
    
    public Jugador init() throws IOException{
        //Loading
        
        //URL url = ClientTCP.class.getResource("loading_1.gif");
        //Icon icon = new ImageIcon("loading_1.gif");
        //JLabel label = new JLabel(icon);
        /**
        JFrame f = new JFrame();
        f.getContentPane().add(label);
        f.setSize(800,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);**/
        /////////////////////7
        Socket socket= new Socket(ip,2407);
        InputStream input=new DataInputStream(socket.getInputStream());
        InputStreamReader isr= new InputStreamReader(input);
        BufferedReader br= new BufferedReader(isr);
        
        String response = "";
        OutputStream os = socket.getOutputStream();
        // Send HELO command and get server response.
        response=""; 
        while(response.startsWith("HELO")==false){
            String command = "HELO\n";
            System.out.print(command);
            os.write(command.getBytes());
            response = br.readLine();
            System.out.println(response);
        }
        response=response.replace("HELO ", "");
        int id=Integer.parseInt(response);
        id=id+1;
        int x=1; 
        int y=1;  
        if(id==2){
            x=18;
        }if(id==3){
            y=18; 
        }if(id==4){
            x=18; 
            y=18;
        }
        Jugador j=new Jugador(id,x,y); 
        System.out.println("Jugador Iniciado");
        while (!response.startsWith("START")){
            //System.out.println("okokok");
            response = br.readLine();
            System.out.println(response);
        }
        System.out.println("cerrando socket");
        //socket.close();
        //f.setVisible(false)
        //GET EL PRIMER ESTADO**/
        //Jugador j=new Jugador(1,1,1); 
        return j; 
        //
        
    }
    
}
