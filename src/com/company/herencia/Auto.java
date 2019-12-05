package com.company.herencia;

//practica de herencia en java

public class Auto {
    double peso;
    String modelo;
    double largo;
    double ancho;
    boolean estado;

    public Auto(){
        this.peso = 1000;
        this.ancho = 2.3 ;
        this.largo = 4.1;
        this.estado = true;
    }

    public double getPeso() {
        return peso;
    }

    public String getModelo() {
        return modelo;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public boolean isEstado() {
        return estado;
    }

    public void obtenerEstado(){
        if (this.estado==true){
            System.out.println("El auto esta encendido");
        }else{
            System.out.println("El auto esta apagado");
        }
    }
}

class Bmw extends Auto{

    public Bmw(){
        this.modelo = "BMW";
    }

    public void turbo(){
        System.out.println("Tu velocidad es de 1000 km/h");
    }
}

class Toyota extends Auto{

    public Toyota(){
        this.modelo = "Toyota";
    }

    public void asientos (){
        System.out.println("Tu auto tiene mas de 2 asientos");
    }
}