import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) {
    /*
     * Problem 2 - x dan o
     * */

    System.out.print("Masukkan input anda : ");

    Scanner input = new Scanner(System.in);
    String string = input.next();
    string = string.toLowerCase();

    int countX = 0;
    int countO = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == 'x') {
        countX++;
      } else if (string.charAt(i) == 'o') {
        countO++;
      }
    }

    System.out.println("Output : " + (countX == countO));
  }
}
