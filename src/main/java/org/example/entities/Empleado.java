package org.example.entities;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
