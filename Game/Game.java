// MAKE ASCII OBJ ANIMATABLE SO THAT IT CAN CHANGE BETWEEN FRAMES

import java.io.IOException;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) throws IOException, InterruptedException {

      Scanner scan = new Scanner(System.in);

      System.out.println("Type a text figure: ");
      String obj = scan.nextLine();
      System.out.println("Type the distance for it to move: ");
      int distance = Integer.parseInt(scan.nextLine());
      System.out.println("Type the delay of the animation (milliseconds): ");
      int delay = Integer.parseInt(scan.nextLine());

      Animate(obj, distance, delay);

  }

  private static void Animate(String obj, int distance, int delay) throws IOException, InterruptedException {

    if (distance > 0 && delay > 0) {

      for (int i = 0; i < distance; i++) {
        // Puts a space in front of obj, causing it to move forward
        // Powershell frame is 118 spaces long
          obj = " " + obj;
          System.out.println(obj);
          Thread.sleep(delay);
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

      }

    }

    else if (distance < 0 && delay > 0) {

      for (int i = 0; i > distance; i--) {

        obj = " " + obj;

      }

      for (int i = 0; i > distance; i--) {

        obj = obj.substring(1);
        System.out.println(obj);
        Thread.sleep(delay);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

      }

    }

    else {



    }

  }

}
