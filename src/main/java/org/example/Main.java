package org.example;

import org.example.entities.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. calcular el salario promedio de los empleados");
            System.out.println("2. jerarquía de clases con Vehiculo");
            System.out.println("3. interfaz Pagable");
            System.out.println("4. salir");
            System.out.print("seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarEjercicioEmpleados();
                    break;
                case 2:
                    ejecutarEjercicioVehiculos();
                    break;
                case 3:
                    ejecutarEjercicioPagos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

    }

    private static void ejecutarEjercicioEmpleados() {
        List<Empleado> listaEmpleados = List.of(
                new Empleado("Juan Pérez", 5000, "Desarrollador"),
                new Empleado("María Gómez", 6000, "Gerente"),
                new Empleado("Carlos Ramírez", 5500, "Analista")
        );

        Empresa empresa = new Empresa(listaEmpleados);
        empresa.mostrarEmpleados();
        System.out.println("Salario promedio: " + empresa.calcularSalarioPromedio());
    }

    private static void ejecutarEjercicioVehiculos() {
        Vehiculo carro = new Carro("Toyota");
        Vehiculo moto = new Moto("Honda");

        carro.acelerar();
        carro.mostrarVelocidad();

        moto.acelerar();
        moto.mostrarVelocidad();
    }

    private static void ejecutarEjercicioPagos() {
        Pagable pagoTarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pagable pagoTransferencia = new TransferenciaBancaria("0987654321");

        pagoTarjeta.procesarPago(150.75);
        pagoTransferencia.procesarPago(500.00);
    }
}