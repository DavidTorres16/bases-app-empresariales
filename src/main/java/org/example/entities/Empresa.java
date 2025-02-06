package org.example.entities;

import java.util.List;

public class Empresa {

    private List<Empleado> empleados;

    public Empresa(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double calcularSalarioPromedio() {
        return empleados.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.0);
    }

    public void mostrarEmpleados() {
        empleados.forEach(System.out::println);
    }

}
