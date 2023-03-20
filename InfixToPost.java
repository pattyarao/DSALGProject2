public class InfixToPost {
    public static void main(String[] args) {
        String test = "! ( 2 > 1 && 3 < 2 )";
        // (4) * (2) + (2) = 10

        System.out.println(Algorithms.infixToPostfix(test));
    }
}
