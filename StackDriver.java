public class StackDriver {
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        stack1.push("D");
        stack1.displayStack();
        System.out.println("TOP(): " + stack1.top());

        System.out.println();

        stack1.pop();
        stack1.displayStack();
        System.out.println("TOP(): " + stack1.top());

        System.out.println();

        stack1.pop();
        stack1.displayStack();
        System.out.println("TOP(): " + stack1.top());

        System.out.println(stack1.pop());
    }
}
