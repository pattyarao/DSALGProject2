import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		while (userInput.equals("QUIT") == false) {
			userInput = scanner.nextLine();
			if (userInput.equals("QUIT")) {
				break;
			} else {
				System.out.println(Algorithms.infixToPostfix(userInput));

				try {
					int evaluation = Algorithms.evaluatePostfix(Algorithms.infixToPostfix(userInput));
					System.out.println(evaluation);
				}
				catch (Exception e){
					System.out.println("Division by zero error!");
				}

			}
			System.out.println();
		}

		scanner.close();
	}

}