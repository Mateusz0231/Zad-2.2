import java.util.Scanner;
class Main {
  public static void main(String[] args)
  {
    Scanner lit = new Scanner(System.in);
    System.out.println("Napisz słowo");
    String slowo = lit.next();
    char a=(slowo.toUpperCase().charAt(0));
    System.out.println("Twoje słowo to"+a+slowo.toLowerCase());
  }
}