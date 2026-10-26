// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Podaj pierwsze: ");
    int a = scanner.nextInt();

    System.out.println("Podaj drugie: ");
    int b = scanner.nextInt();

    int wynik;
    wynik = a+b;

    System.out.println("Suma to "+ wynik);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}