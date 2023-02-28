package com.jgallego;

public class Main {

    public static void main(String[] args) {
	    Perro perro = new Perro();
        System.out.println("Hola soy: "+perro.mostrarNombre());
        perro.tipoDeAnimal();
        perro.mostrarVida();
    }
}
