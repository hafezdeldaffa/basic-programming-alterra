import java.util.Scanner;

public class Problem1 {
  /*
   * Problem 1 - Vokal, Konsonan
   * */
  public static void main(String[] args) {
    System.out.print("Masukan string input anda : ");
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    str = str.toLowerCase();

    int vocal = 0;
    int konsonan = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'u'
              || str.charAt(i) == 'e' || str.charAt(i) == 'o') {
        vocal++;
      } else if (str.charAt(i) == ' ') {
        continue;
      } else {
        konsonan++;
      }
    }

    System.out.println("Jumlah Vokal : " + vocal);
    System.out.println("Jumlah Konsonan : " + konsonan);
    System.out.println("Total Karakter : " + str.replace(" ", "").length());
  }
}