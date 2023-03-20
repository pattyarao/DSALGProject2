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

		// if (token.equals("+") || token.equals("-")) {
		// return 1;
		// } else if (token.equals("*") || token.equals("/")) {
		// return 2;
		// } else if (token.equals("^")) {
		// return 3;
		// }

		// return -1;

		// logical ! (not)
		if (token.equals("!")) {
			return 13;

			// exponent
		} else if (token.equals("^")) {
			return 12;

			// arithmetic * and /
		} else if (token.equals("*") || token.equals("/")) {
			return 11;

			// arithmetic + and -
		} else if (token.equals("+") || token.equals("-")) {
			return 10;

			// relational operators are all EQUAL precedence
		} else if (token.equals("<") || token.equals("<=")
				|| token.equals(">") || token.equals(">=")
				|| token.equals("!=") || token.equals("==")) {
			return 8;

			// logical &&
		} else if (token.equals("&&")) {
			return 4;

			// logical ||
		} else if (token.equals("||")) {
			return 3;
		}

		return -1;
	}

	public static int evaluatePostfix(String postfix) {
		int length = postfix.length();
		int end = 0;
		String div = "/";
		String not = "!";
	
		Stack stack1 = new Stack(length);
		String[] arrToken = postfix.split("\\s+");
	
		for (String token : arrToken) {
			if (isANumber(token)) {
				stack1.push(token);
			} else if (token.equals(not)) {
				int operand1 = Integer.parseInt(stack1.pop());
				if (operand1 > 0) {
					operand1 = 0;
				} else {
					operand1 = 1;
				}
				stack1.push(Integer.toString(operand1));
			} else {
				int operand2 = Integer.parseInt(stack1.pop());
				int operand1 = Integer.parseInt(stack1.pop());
				if (token.equals(div) && operand2 == 0){
					end = -1;
					break;
				}
				int result = tokenOperation(token, operand1, operand2);
				stack1.push(Integer.toString(result));
			}
		}
	
		if (end == -1){
			System.out.println("Division by zero error!");
			return -1;
		} else {
			return Integer.parseInt(stack1.pop());
		}
		
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
		String greatThan = ">";
		String lessThan = "<";
		String gtEqual = ">=";
		String ltEqual = "<=";
		String notEqual = "!=";
		String isEqual = "==";
		String isEqual2 = "=";
		String andOp = "&&";
		String orOp = "||";
	
		if (token.equals(add)) {
			oResult = operand1 + operand2;
		} else if (token.equals(sub) || token.equals("-")) {
			oResult = operand1 - operand2;
		} else if (token.equals(mult) || token.equals("*")) {
			oResult = operand1 * operand2;
		} else if (token.equals(div)) {
			oResult = operand1 / operand2;
		} else if (token.equals(greatThan)) {
			if (operand1 > operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(lessThan)) {
			if (operand1 < operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(gtEqual)) {
			if (operand1 >= operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(ltEqual)) {
			if (operand1 <= operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(notEqual)) {
			if (operand1 != operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(isEqual) || token.equals(isEqual2)) {
			if (operand1 == operand2) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(andOp)) {
			if (operand1 > 0 && operand2 > 0 ) {
				oResult = 1;
			} else {
				oResult = 0;
			}
		} else if (token.equals(orOp)) {
			if (operand1 == 0 && operand2 == 0 ) {
				oResult = 0;
			} else {
				oResult = 1;
			}
		}
		return oResult;
	}
}
