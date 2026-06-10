package app;

import utils.SignValidator;

public class App {
    public static void main(String[] args) throws Exception {
        SignValidator inicio = new SignValidator();
        String cadena1 = "([() clouds ]){}";
        String cadena2 = "{[(])}";
        System.out.println("\n--- EJERCICIO 1 VALIDACIÓN DE SIGNOS ---\n");
        System.out.println("Input: " + cadena1);
        System.out.println("Output: " + inicio.isValid(cadena1));
        System.out.println();
        System.out.println("Input: " + cadena2);
        System.out.println("Output: " + inicio.isValid(cadena2));
    }
}
