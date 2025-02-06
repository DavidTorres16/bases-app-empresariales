package org.example;

import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;


public class JavaExercise1 {
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] encontrarMayorYMenor(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        int menor = Collections.min(numeros);
        int mayor = Collections.max(numeros);
        return new int[]{menor, mayor};
    }
    
    public static boolean esPalindromo(String palabra) {
        if (palabra == null) {
            return false;
        }
        String limpia = palabra.replaceAll("\\s", "").toLowerCase();
        return limpia.equals(new StringBuilder(limpia).reverse().toString());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prueba de número primo
        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();
        System.out.println("¿Es primo? " + esPrimo(numero));
        
        // Prueba de mayor y menor en una lista
        List<Integer> numeros = Arrays.asList(34, 78, 12, 56, 89, 23);
        int[] resultado = encontrarMayorYMenor(numeros);
        System.out.println("Número más pequeño: " + resultado[0]);
        System.out.println("Número más grande: " + resultado[1]);
        
        // Prueba de palíndromo
        System.out.print("Ingrese una palabra para verificar si es palíndromo: ");
        scanner.nextLine();
        String palabra = scanner.nextLine();
        System.out.println("¿Es palíndromo? " + esPalindromo(palabra));
        
        scanner.close();
    }
}