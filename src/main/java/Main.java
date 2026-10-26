// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Co wykonać: (1 - suma, 2 - różnica, 3- iloczyn, 4 - iloraz) ");
    int wykonanie = scanner.nextInt();

    System.out.println("Podaj pierwsze: ");
    double a = scanner.nextDouble();

    System.out.println("Podaj drugie: ");
    double b = scanner.nextDouble();

    switch (wykonanie)
      {
        case 1:
          System.out.println("Wynik to: " + (a + b));
          break;
          case 2:
          System.out.println("Wynik to: " + (a - b));
          break;
          case 3:
          System.out.println("Wynik to: "+ (a * b));
          break;
          case 4:
          if (b == 0) {
            System.out.println("Błąd! Zakaz dzielenia przez zero");
          }
          else
          {
            System.out.println("Wynik to: "+ (a / b));
          }
          break;
        default:
          System.out.println("Brak opcji");
      }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}