package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckParentesis {
    public static boolean validateExpression(String exp) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char symbol : exp.toCharArray()) {
            if (symbol == '(') {
                stack.push(symbol);
                continue;
            }
            if (symbol == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validateExpression("(1+2)"));
        System.out.println(validateExpression("((1+4"));
        System.out.println(validateExpression("((1+4))"));
        System.out.println(validateExpression("((1+4) + (2+2))"));
    }
}
