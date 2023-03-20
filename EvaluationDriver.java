public class EvaluationDriver {
    public static void main(String[] args) {
        String test = "1 3 7 / + 4 +";
		String test2 = "300 23 + 43 21 − ∗ 84 7 + /";
        String test3 = "4 8 + 6 5 - * 3 2 - 2 2 + * /";
        String test4 = "1 2 3 * + 4 +";
		System.out.println(Algorithms.evaluatePostfix(test));
		System.out.println(Algorithms.evaluatePostfix(test2));
        System.out.println(Algorithms.evaluatePostfix(test3));
        System.out.println(Algorithms.evaluatePostfix(test4));

    }
}