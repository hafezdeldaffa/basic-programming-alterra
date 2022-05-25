import java.util.Scanner;

public class Problem6 {
  public static void main(String[] args) {
    /*
    * Problem 6 - Exponentation
    * */

    System.out.print("Masukkan input x anda : ");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();

    System.out.print("Masukkan input x anda : ");
    int n = input.nextInt();

    int result = (int) Math.pow(x, n);

    System.out.println("Output : " + result);
  }
}
