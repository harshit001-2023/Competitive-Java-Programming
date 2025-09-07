import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        // Use a stack of Characters, not Integers
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket
            else if (c == ')' || c == '}' || c == ']') {
                // FIRST check: If the stack is empty, there's no matching opener
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element and check for a mismatch
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }

        // FINAL check: After the loop, the stack must be empty
        // If it's not, there are unclosed opening brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // First, create an object of your class so you can call its methods
        ValidParenthesis solver = new ValidParenthesis();

        // Create a few test cases
        String test1 = "()";       // Should be true
        String test2 = "()[]{}";   // Should be true
        String test3 = "(]";       // Should be false
        String test4 = "([)]";     // Should be false
        String test5 = "{[]}";     // Should be true
        String test6 = "[";        // Should be false

        // Call your method for each test case and print the result
        System.out.println("Is '" + test1 + "' valid? " + solver.isValid(test1));
        System.out.println("Is '" + test2 + "' valid? " + solver.isValid(test2));
        System.out.println("Is '" + test3 + "' valid? " + solver.isValid(test3));
        System.out.println("Is '" + test4 + "' valid? " + solver.isValid(test4));
        System.out.println("Is '" + test5 + "' valid? " + solver.isValid(test5));
        System.out.println("Is '" + test6 + "' valid? " + solver.isValid(test6));
    }
}