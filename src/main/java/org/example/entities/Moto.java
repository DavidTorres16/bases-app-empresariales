package org.example.entities;

public class Moto extends Vehiculo{
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("La moto acelera ágilmente.");
    }
}
