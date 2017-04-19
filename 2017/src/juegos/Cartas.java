/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import javax.swing.ImageIcon;

/**
 *
 * @author ALEX
 */
public class Cartas {
    private int cartaA;
    private String ganador="";
    private int paloA;
    private int paloB;
    private int cartaB;
    private boolean ganadortotal=false;
    private int conta=0;
    private int contb=0;
    private String palo="";
    private String naipeA="";
    private String ruta="F:\\2017\\Naipes\\";
    private String color="";
    
    
    public ImageIcon obtenerIcono(){
        
        ImageIcon icon = new ImageIcon(ruta+"REVERSE.png");
        return icon;
    }
    
    public ImageIcon obtenerCarta1(){
        
       
        cartaA=(int)(Math.random()*13+2);
        paloA= (int)(Math.random()*4+1);
        while(paloA==paloB){
        paloA= (int)(Math.random()*4+1);    
        }
        if (paloA==1) {
            palo="-C";
            color="CORAZONES\\";
        }if (paloA==2) {
            palo="-E";
            color="ESPADAS\\";
        }if (paloA==3) {
            palo="-T";
            color="TREBOL\\";
        }if (paloA==4) {
            palo="-P";
            color="PICAS\\";
        }
        ImageIcon icono =new ImageIcon(ruta+color+cartaA+palo+".png");
        
        return icono;
    }
    
    public ImageIcon obtenerCarta2(){
        cartaB=(int)(Math.random()*13+2);
        paloB=(int)(Math.random()*4+1); 
        while(paloA==paloB){
        paloB=(int)(Math.random()*4+1);    
        }
        if (paloB==1) {
            palo="-C";
            color="CORAZONES\\";
        }if (paloB==2) {
            palo="-E";
            color="ESPADAS\\";
        }if (paloB==3) {
            palo="-T";
            color="TREBOL\\";
        }if (paloB==4) {
            palo="-P";
            color="PICAS\\";
        }
        ImageIcon icon= new ImageIcon(ruta+color+cartaB+palo+".png");
        return icon;
    }
    
    public String obtenerGanador(){
        
        if (cartaA!=cartaB) {
            if (cartaA>cartaB) {
                ganador ="EL jugador A Gana";
                conta++;
                if (conta==3) {
                    ganadortotal=true;
                    ganador="Ganador final A";
                    conta=0;
                    contb=0;
                }
            }else{
                ganador= "El jugador B gana";
                contb++;
                if (contb==3) {
                    ganadortotal=true;
                    ganador="Ganador final B";
                    contb=0;
                    conta=0;
                }
            }
        }else{
            ganador="Naipes Iguales";
        }
       return  ganador;
      }
    
    public int obtenerPuntosA(){
        return conta;
    }
    public int obtenerPuntosB(){
        return contb;
    }
    
   
   
    }
    
    
    
    

