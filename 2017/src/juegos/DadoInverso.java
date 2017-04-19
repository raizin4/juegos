/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

/**
 *
 * @author ALEX
 */
public class DadoInverso {
    private int a;
    private int b;
    private int dadoA=0;
    private int dadoB=0;
    public DadoInverso(int a,int b){
        this.a=a;
        this.b=b;
    }
    //version 1.0
    public void obtenerJugadas(){
        while(dadoA!=b && dadoB!=a){
        dadoA=(int)(Math.random()*6+1);
            System.out.println("el jugador A saco : "+dadoA);
        dadoB=(int)(Math.random()*6+1);
            System.out.println("el jugador B saco : "+dadoB);
        }
    }
    
    public void obtenerGanador(){
        if (dadoA==b) {
            System.out.println("PIERDE JUGADOR A");
            System.out.println("GANA JUGADOR B");
        }else{
            System.out.println("PERDE JUGADOR B");
            System.out.println("GANA JUGADOR A");
        }
    }
}
