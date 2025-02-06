package org.example.entities;

public abstract class Vehiculo {
    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public abstract void acelerar();

    public void mostrarVelocidad() {
        System.out.println(marca + " velocidad actual: " + velocidad + " km/h");
    }
}
