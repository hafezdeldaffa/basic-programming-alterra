import java.util.Scanner;

public class Problem5 {
  public static void main(String[] args) {
    /*
     * Problem 5 - Palindrome
     * */

    System.out.print("Masukkan input : ");
    Scanner input = new Scanner(System.in);
    String string = input.next();
    string = string.toLowerCase();

    for (int i = 0; i < string.length(); i++) {
      int nilaiAwal = i;
      int nilaiAkhir = string.length() - i - 1;

      if (string.charAt(nilaiAwal) == string.charAt(nilaiAkhir)) {
        System.out.println("Output : " + true);
        break;
      }
      System.out.println("Output : " + false);
      break;
    }
  }
}
