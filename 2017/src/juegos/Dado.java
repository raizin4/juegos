/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class Dado {
    private int n;
    private int dadoA=0;
    private int dadoB=0;
    private int aux=0;
    private int auxx=0;
    
    public Dado(int n){
        this.n=n;
    }
    //version 1
  /*  public void obtenerJugadaV1(){
        while(dadoA!=n && dadoB!=n){
            this.dadoA=(int)(Math.random()*6+1);
            System.out.println("jugador A saco: "+dadoA);
            if (dadoA==n) {
                break;
            }
            this.dadoB=(int)(Math.random()*6+1);
            System.out.println("jugador B saco: "+dadoB);
            if (dadoB==n) {
                break;
            }
        }
    
    public void obtenerGanadorV1(){
        if (this.dadoA==n) {
            aux++;
            if (aux==3) {
                System.out.println("el ganador del Juego es Fabian");
            }
            
            System.out.println("El ganador de la partida es Fabian");
        }else{
            auxx++;
            if (auxx==3) {
                System.out.println("el ganador de  juego es Alex");
                
            }
            System.out.println("El ganador de la partida es Alex");
        }
    }
    }*/
    
    //version 2
    public void obtenerJugada(){
        Scanner sc= new Scanner(System.in);
        
        while(dadoA!=n && dadoB!=n){     
            this.dadoA=(int)(Math.random()*6+1);
            System.out.println("jugador A saco: "+dadoA);
            if (dadoA==n) {
                aux++;
                System.out.println("ganador de la partida es Fabian ");
                System.out.println("==================================");
                if (aux==3) {
                    break;
                }
                dadoA=0;
                System.out.println("ingrese nuevo numero: ");  
                n=sc.nextInt();
                while(n<1||n>6){
                    System.out.println("numero incorrecto");
                    System.out.println("ingrese nuevo numero");
                    n=sc.nextInt();
                }
            }
            
            this.dadoB=(int)(Math.random()*6+1);
            System.out.println("jugador B saco: "+dadoB);
            if (dadoB==n) {
                auxx++;
                System.out.println("ganador de la partida es Alex");
                System.out.println("================================");
                if (auxx==3) {
                    break;
                }
                dadoB=0;
                System.out.println("ingrese nuevo numero: ");
                n=sc.nextInt();
                while(n<1||n>6){
                    System.out.println("numero incorrecto");
                    System.out.println("ingrese nuevo numero");
                    n=sc.nextInt();
                }
            }     
          }
        }
    
    public void obtenerGanador(){
        if (aux==3) {
            System.out.println("EL GANADOR DEL JUEGO ES FABIAN");
        }
        if (auxx==3) {
            System.out.println("EL GANADOR DEL JUEGO ES ALEX");
        }
    }
        
        
    
    
   
   

    
    
    
}
