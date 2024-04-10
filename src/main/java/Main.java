import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

      
        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba; j++) {
              
                if (i == 0 || i == liczba - 1 || j == 0 || j == liczba - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}