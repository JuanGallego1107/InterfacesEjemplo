package com.jgallego;


public class Perro implements Animal,serVivo {

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un mamifero");
    }

    @Override
    public String mostrarNombre() {
        return "Toby";
    }

    @Override
    public void mostrarVida() {
        System.out.println("Holaaa estoy vivo");
    }
}
