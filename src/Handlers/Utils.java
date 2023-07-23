
package Handlers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n \n Pressione Enter para continuar. \n \n");
        scanner.nextLine();    
    }
    public static void pauseAndClean() throws IOException, InterruptedException {
        pause();
        Terminal.CleanTerminal();
    }
  public static String[] addString(String[] array, String item) {
    String[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[newArray.length - 1] = item;
  return newArray;
}
  public static String[][] addArrayString(String[][] array, String[] item) {
    String[][] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[newArray.length - 1] = item;
    return newArray;
  }
  public static boolean isStringNaN(String input) {
      try {
          double number = Double.parseDouble(input);
          return Double.isNaN(number);
      } catch (NumberFormatException e) {
          return false;
      }
  }
}
