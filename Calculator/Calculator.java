import java.util.Scanner;

public class Calculator {

		public static Scanner scan = new Scanner(System.in);
		public static String input = "";

	public static void main(String[] args) {

		input = scan.nextLine();
		int inputNum = Integer.parseInt(input);

		System.out.println(isPrime(inputNum));

	}

	public static boolean isPrime(int num) {

		while (!input.equals("quit")) {

					for (int i = 2; i < num; i--) {

						if (num % i == 0) {

							input = "quit";
							return false;

						}
						else {

							return true;

						}

					}

				}

			return false;

		}

	}
