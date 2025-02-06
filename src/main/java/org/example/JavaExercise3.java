package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class JavaExercise3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Marlon", "Santiago", "David", "Braian", "Alejandro", "Estefania", "Ana");

        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nombres que comienzan con A: " + nombresConA);

        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas: " + nombresMayusculas);

        long cantidadNombresLargos = nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .count();
        System.out.println("Cantidad de nombres con más de 5 letras: " + cantidadNombresLargos);

        List<String> palabras = Arrays.asList("java", "python", "java", "c++", "python", "java", "c#", "c++", "java");

        Map<String, Long> frecuenciaPalabras = palabras.stream()
                .collect(Collectors.groupingBy(palabra -> palabra, Collectors.counting()));

        System.out.println("Frecuencia de palabras: " + frecuenciaPalabras);
    }
}