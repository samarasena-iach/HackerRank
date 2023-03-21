package InterviewPreparationKit.StacksAndQueues;

import java.util.Stack;

// Link: https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=stacks-queues
public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));

        // Other Inputs
        // "{[(])}"
        // "{{[[(())]]}}"
    }

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();

                if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
