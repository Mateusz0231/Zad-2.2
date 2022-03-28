import java.util.Scanner;

 
public class Main {
 
  
    public static String upperCase(String napis)
  {
      String wynik=""; 
      char znak;    
      int kod_ascii;
      for (int i = 0 ; i < napis.length() ; i++)   
      {
          znak = napis.charAt(i);  
          kod_ascii = (int) znak; 
 
         
          if (kod_ascii >=97 && kod_ascii <=122)
          {
              kod_ascii = kod_ascii - 32;
              znak = (char)kod_ascii; 
          }
          wynik = wynik + znak; 
      }
 
      return wynik;
  }
 
    public static void main(String[] args) 
  {
    Scanner napis1 = new Scanner(System.in);
     System.out.println("Podaj napis");
       String napis = napis1.next();
       napis = upperCase(napis);
       System.out.println(napis);
   }
}