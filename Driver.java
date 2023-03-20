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
				System.out.println(Algorithms.evaluatePostfix(Algorithms.infixToPostfix(userInput)));
			}
		}

		scanner.close();
	}

}