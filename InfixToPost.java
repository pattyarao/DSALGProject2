public class InfixToPost {
    public static void main(String[] args) {
        String test = "( 4 + 8 ) * ( 6 - 5 ) / ( ( 3 - 2 ) * ( 2 + 2 ) )";
        // (4) * (2) + (2) = 10

        System.out.println(Algorithms.infixToPostfix(test));
    }
}
