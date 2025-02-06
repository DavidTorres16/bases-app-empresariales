package org.example.entities;

public class Carro extends Vehiculo{

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("El carro acelera rápidamente.");
    }

}
