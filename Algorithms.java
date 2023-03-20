public class Algorithms {

	public static boolean isANumber(String token) {
		try {
			Integer.parseInt(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static String infixToPostfix(String infix) {

		StringBuilder postfix = new StringBuilder();

		String[] strArr = infix.split(" ");

		int length = infix.length();
		Stack stack = new Stack(length);

		for (String s : strArr) {

			// String current = String.valueOf(infix.charAt(i));

			if (isANumber(s)) {
				postfix.append(s + " ");
			} else if (s.equals("(")) {
				stack.push(s);
			} else if (s.equals(")")) {
				while (stack.isStackEmpty() == false && stack.top().equals("(") == false) {
					postfix.append(stack.pop() + " ");
				}

				if (stack.isStackEmpty() == false && stack.top().equals("(") == false) {
					return "Invalid expression!";
				} else {
					stack.pop();
				}
			} else {
				while (stack.isStackEmpty() == false && getPrecedence(s) <= getPrecedence(stack.top())) {
					if (stack.top().equals("(")) {
						return "Invalid expression";
					}
					postfix.append(stack.pop() + " ");
				}

				stack.push(s);
			}
		}

		while (stack.isStackEmpty() == false)

		{
			if (stack.top().equals("(") == true || stack.top().equals(")") == true) {
				return "Invalid.";
			}
			postfix.append(stack.pop() + " ");
		}

		return postfix.toString();

	}

	public static int getPrecedence(String token) {

		if (token.equals("+") || token.equals("-")) {
			return 1;
		} else if (token.equals("*") || token.equals("/")) {
			return 2;
		} else if (token.equals("^")) {
			return 3;
		}

		return -1;
	}

	public static int evaluatePostfix(String postfix) {
		int length = postfix.length();

		Stack stack1 = new Stack(length);
		String[] arrToken = postfix.split("\\s+");

		for (String token : arrToken) {
			if (isANumber(token)) {
				stack1.push(token);
			} else {
				int operand2 = Integer.parseInt(stack1.pop());
				int operand1 = Integer.parseInt(stack1.pop());
				int result = tokenOperation(token, operand1, operand2);
				stack1.push(Integer.toString(result));
			}
		}

		return Integer.parseInt(stack1.pop());
	}

	// public static boolean isANumber(String token) {
	// try {
	// Integer.parseInt(token);
	// return true;
	// } catch (NumberFormatException e) {
	// return false;
	// }
	// }

	public static int tokenOperation(String token, int operand1, int operand2) {
		int oResult = 0;
		String sub = "−";
		String add = "+";
		String mult = "∗";
		String div = "/";

		if (token.equals(add)) {
			oResult = operand1 + operand2;
		} else if (token.equals(sub) || token.equals("-")) {
			oResult = operand1 - operand2;
		} else if (token.equals(mult) || token.equals("*")) {
			oResult = operand1 * operand2;
		} else if (token.equals(div)) {
			oResult = operand1 / operand2;
		}
		return oResult;
	}
}
