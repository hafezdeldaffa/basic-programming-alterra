import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
    /*
     * Problem 4 - Bilangan Prima
     * */
    System.out.print("Masukkan input anda : ");

    Scanner input = new Scanner(System.in);
    int angka = input.nextInt();

    var check = false;

    for (int i = 2; i <= angka / 2; ++i) {
      if (angka % i == 0) {
        check = true;
        break;
      }
    }

    if (!check) {
      System.out.println("Output : Bilangan Prima");
    } else {
      System.out.println("Output : Bukan Bilangan Prima");
    }
  }
}
