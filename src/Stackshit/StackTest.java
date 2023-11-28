package Stackshit;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Hallo");
        stack.push("!");
        stack.push("Wie");
        stack.push("geht");
        stack.push("es");
        stack.push("dir");
        stack.push("?");
        printStack(stack);
        System.out.println("\n");
        printStack(reverseStack(stack));
    }
    public static void printStack(Stack<String> stack) {
        if (stack.isEmpty())
            return;
        String top = stack.top();
        System.out.print(top + " | ");
        stack.pop();
        printStack(stack);
        stack.push(top);
    }
    public static void reverseStack(Stack<String> stack){

        while(!stack.isEmpty()){

        }
    }
}
