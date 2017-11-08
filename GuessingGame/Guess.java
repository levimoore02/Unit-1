import java.util.Scanner;
import java.io.IOException;

public class Guess {

  public static int numMax = 100;
  public static int numMin = 0;
  public static int answer = (int) Math.floor(Math.random() * 101);
  public static String lvl = "**********@**********";
  public static int pos = 10;

  public static void main(String[] args) throws IOException, InterruptedException {

    System.out.println(lvl.substring(pos, pos + 10));

    Scanner scan = new Scanner(System.in);
    System.out.println("Guess my number between 1-100!\nType anything to continue:");
    String input = scan.nextLine();

    if (!input.isEmpty()) {

      HigherLower(input, scan);

    }

    else {

      System.out.println("Invalid Command");

    }

  }

  private static void HigherLower(String input, Scanner scan)  throws IOException, InterruptedException {

    while (input != "quit") {

        input = scan.nextLine();

          int inputNum = Integer.parseInt(input);

        if (input.isEmpty()) {

          System.out.println("Please type a number.");

        }

        else if (inputNum < answer) {

          checkWall(input);
          System.out.println("Your guess is too low, try again.");

        }
        else if (inputNum > answer) {

          checkWall(input);
          System.out.println("Your guess was too high, try again.");

        }
        else if (inputNum == answer) {

          System.out.println("You are correct!");
          input = "quit";

        }
        else {

          System.out.println("Unrecognized command.");

      }

    }

  }

  private static void checkWall(String input) throws IOException, InterruptedException {

    if (pos <= 1) {

        System.out.println("The number was " + answer);
        System.out.println("You have lost the game!");
        input = "quit";

    }
    else {

      cls();
      pos--;
      System.out.println(lvl.substring(pos, pos + 10));

    }

  }

  private static void cls() throws IOException, InterruptedException {

      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

  }

}
