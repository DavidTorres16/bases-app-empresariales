package org.example;

import org.example.entities.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = List.of(
                new Empleado("Juan Pérez", 5000, "Desarrollador"),
                new Empleado("María Gómez", 6000, "Gerente"),
                new Empleado("Carlos Ramírez", 5500, "Analista")
        );

        Empresa empresa = new Empresa(listaEmpleados);
        empresa.mostrarEmpleados();
        System.out.println("Salario promedio: " + empresa.calcularSalarioPromedio());

        Vehiculo carro = new Carro("Toyota");
        Vehiculo moto = new Moto("Honda");

        carro.acelerar();
        carro.mostrarVelocidad();

        moto.acelerar();
        moto.mostrarVelocidad();

        Pagable pagoTarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pagable pagoTransferencia = new TransferenciaBancaria("0987654321");

        pagoTarjeta.procesarPago(150.75);
        pagoTransferencia.procesarPago(500.00);
    }
}