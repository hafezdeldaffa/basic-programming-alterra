import java.util.Scanner;

public class Problem8 {
  public static void main(String[] args) {
    /*
    * Problem 8 - Cetak tabel perkalian
    * */

    System.out.print("Masukkan input anda : ");
    Scanner input = new Scanner(System.in);

    int angka = input.nextInt();

    for (int i = 1; i <= angka; i++) {
      for (int j = 1; j <= angka; j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }
}
