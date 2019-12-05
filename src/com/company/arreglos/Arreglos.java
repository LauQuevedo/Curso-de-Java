package com.company.arreglos;
import java.util.Random;
public class Arreglos {

//Declaracion de arreglos y muestreo de su contenido     

    public static void main (String [] args){
        arreglo();
        matriz();
    }
    
    public static void arreglo(){
        /*int x[];
        x = new int [5];
        x[0] = 12;
        x[1] = 4;
        x[2] = 56;
        x[3] = 7;
        x[4] = 23;*/

        int x[] = {12,4,56,7,23};

        for (int i=0;i<x.length;i++){
            System.out.println("Valor " + (i + 1) + ": " + x[i]);
        }
    }

    public static void matriz(){
        // matriz llenada aleatoriamente con mumeros del 1 al 100
        int matr [][] = new int [2][3];
        Random rm = new Random();
        for (int i=0;i<2;i++){
            for (int j=0; j<3; j++) {
                matr[i][j] =rm.nextInt(100+0);
                System.out.println("Valor [" + i + "][" + j + "] : " + matr[i][j]);
            }
        }
    }
}
