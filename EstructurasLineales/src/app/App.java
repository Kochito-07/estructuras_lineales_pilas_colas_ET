package app;

import utils.SignValidator;
import utils.StackSorter;

import java.util.Stack;

import utils.QueuePalindrome;

public class App {
public static void main(String[] args) {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "([]){}";
        String cadena2 = "({)}";
        System.out.println("\n--- EJERCICIO 1 VALIDACIÓN DE SIGNOS ---\n");
        System.out.println("Input: " + cadena1);
        System.out.println("Output: " + signValidator.isValid(cadena1));
        System.out.println();
        System.out.println("Input: " + cadena2);
        System.out.println("Output: " + signValidator.isValid(cadena2));
    }
    private static void runStackSorter() {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        
        StackSorter sorter = new StackSorter();
        
        System.out.println("\n--- EJERCICIO 2 ORDENAR STACK ---\n");
        System.out.println("Stack original: " + stack);
        
        sorter.sortStack(stack);
        
        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }

    private static void runQueuePalindrome() {
        QueuePalindrome queuePalindrome = new QueuePalindrome();
        
        System.out.println("\n--- EJERCICIO 3 PALÍNDROMO USANDO COLAS");
        System.out.println("ana | Resultado: " + queuePalindrome.isPalindrome("ana"));
        System.out.println("radar | Resultado: " + queuePalindrome.isPalindrome("radar"));
        System.out.println("java | Resultado: " + queuePalindrome.isPalindrome("java"));
     }
}
