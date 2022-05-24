import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    /*
     * Problem 3 - Faktor Bilangan
     * */

    System.out.print("Masukkan input anda : ");
    Scanner input = new Scanner(System.in);
    var angka = input.nextInt();

    for (int i = 1; i <= angka; i++) {
      if (angka % i == 0) {
        System.out.println(i + " ");
      }
    }
  }
}
