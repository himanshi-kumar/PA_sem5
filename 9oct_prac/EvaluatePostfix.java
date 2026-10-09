public class EvaluatePostfix {

    static class MyStack {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node top;

        void push(int val) {
            Node node = new Node(val);
            node.next = top;
            top = node;
        }

        int pop() {
            if (top == null) {
                throw new IllegalStateException("Stack is empty");
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    static int evaluatePostfix(String expression) {
        MyStack stack = new MyStack();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            if (token.matches("[0-9]+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        result = a / b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                stack.push(result);
            }
        }

        int ans = stack.pop();
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }
        return ans;
    }

    public static void main(String[] args) {
        String expression = "12 3 4 * + 2 /";

        try {
            System.out.println("Expression: " + expression);
            System.out.println("Result: " + evaluatePostfix(expression));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
