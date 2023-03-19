public class Algorithms {

	//public static String infixToPostfix(String infix) {
		
		
	//}
	
	public static int evaluatePostfix(String postfix) {
		int length = postfix.length();

		Stack stack1 = new Stack(length);
		String[] arrToken = postfix.split("\\s+");

		for (String token : arrToken)
		{
			if (isANumber(token)) {
				stack1.push(token);
			} else {
				int operand1 = Integer.parseInt(stack1.pop());
				int operand2 = Integer.parseInt(stack1.pop());
				int result = tokenOperation(token, operand1, operand2);
				stack1.push(Integer.toString(result));
			}
		}

		return Integer.parseInt(stack1.pop());
	}

	public static boolean isANumber(String token) {
		try {
			Integer.parseInt(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int tokenOperation (String token, int operand1, int operand2) {
		int oResult = 0;
		if (token.equals("+")){
			oResult = operand1+operand2;
		} else if (token.equals("-")){
			oResult = operand1-operand2;
		} else if (token.equals("*")){
			oResult = operand1*operand2;
		} else if (token.equals("/")){
			oResult = operand1/operand2;
		}
		return oResult;
	}
}
