import java.util.Scanner;

public class Calculator {

	public static boolean loop = true;

	public static void main(String[] args) {

			while (loop) {

					Scanner scan = new Scanner(System.in);
					System.out.println("Check if a number is prime:\n");
					String input = scan.nextLine();

					System.out.println("");

					if (input.equals("")) {

						System.out.println("Invalid number.");

					}
					else {

						System.out.println(isPrime(Integer.parseInt(input)));
						loop = false;

					}

			}

	}

	// public static boolean isDivisible(int div1, int div2) {
	//
	// 	return (div1 % div2 == 0);
	//
	// }

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i--) {

			if (num % i == 0) {

				return false;

			}
			else {

				return true;

			}

		}

		return false;

	}

}
