package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char actual = s.charAt(i);
            if (actual == '(' || actual == '[' || actual == '{') {
                pila.push(actual);
            }
            else if (actual == ')' || actual == ']' || actual == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                char tope = pila.pop();
                if (actual == ')' && tope != '(') {
                    return false;
                }
                if (actual == ']' && tope != '[') {
                    return false;
                }
                if (actual == '}' && tope != '{') {
                    return false;
                }
            }   
        }
        return pila.isEmpty();
    }    
}

