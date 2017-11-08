// Create array to move @ forards in array of *

import java.util.Scanner;

public class Ascii {

  public static String lvl = "***************@***************";
  public static int pos = 15;

  public static void main(String[] args) {

    System.out.println(lvl.substring(pos, pos + 15));
    collectInput();

  }

  private static void collectInput() {

    String input = "";
    while(!input.equals("quit")) {

      Scanner scan = new Scanner(System.in);
      input = scan.nextLine();

      if (input.equals("right")) {

        if (pos <= 1) {

            System.out.println("You have hit the side of the room.");
            pos = 1;

        }
        else {

          pos--;
          System.out.println(lvl.substring(pos, pos + 15));

        }

      }
      else if (input.equals("left")) {

        if (pos > 14) {

          System.out.println("You have hit the side of the room.");
          pos = 14;

        }
        else {

          pos++;
          System.out.println(lvl.substring(pos, pos + 15));

        }

      }

    }

  }

}
