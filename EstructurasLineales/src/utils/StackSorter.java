package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("\n--- No hay elementos paraordenar ---\n");
        }
        Stack<Integer> pila = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!pila.isEmpty() && pila.peek() > temp) {
                stack.push(pila.pop());
            }
            pila.push(temp);
        }
        while (!pila.isEmpty()) {
            stack.push(pila.pop());
        }
    }
}
