package stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        if (input == null)
            throw new IllegalArgumentException();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.empty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
}
