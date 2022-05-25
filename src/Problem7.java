import java.util.Scanner;

public class Problem7 {
  public static void main(String[] args) {
    /*
    * Problem 7 - Play with asterisk
    * */

    System.out.print("Masukkan input : ");
    Scanner input = new Scanner(System.in);

    int baris = input.nextInt();

    int k = 0;

    for (int i = 1; i <= baris; ++i, k = 0) {
      for (int jarak = 1; jarak <= baris - i; ++jarak) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
  }
}
