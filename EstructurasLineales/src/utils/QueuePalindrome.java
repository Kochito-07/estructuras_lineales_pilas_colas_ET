package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String textMin = text.toLowerCase();
        Queue<Character> cola = new LinkedList<>();
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < textMin.length(); i++) {
            cola.add(textMin.charAt(i));
            pila.push(textMin.charAt(i));
            
        }
        while (!cola.isEmpty()) {
            char letraCola = cola.remove();
            char letraPila = pila.pop();
            if (letraCola != letraPila) {
                return false;
            }
        }
        return true;
  
    }
}
