import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [][]tablica = new int[3][3];
        int licznik = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        do{
            System.out.println("Podaj 9 liczb do tablicy:");
            tablica[0][0] = scanner.nextInt();
            licznik++;
            tablica[0][1] = scanner.nextInt();
            licznik++;
            tablica[0][2] = scanner.nextInt();
            licznik++;
            tablica[1][0] = scanner.nextInt();
            licznik++;
            tablica[1][1] = scanner.nextInt();
            licznik++;
            tablica[1][2] = scanner.nextInt();
            licznik++;
            tablica[2][0] = scanner.nextInt();
            licznik++;
            tablica[2][1] = scanner.nextInt();
            licznik++;
            tablica[2][2] = scanner.nextInt();
            licznik++;

        }while(licznik < 9);

        int sum1 = tablica[0][0] + tablica[0][1] + tablica[0][2];
        int sum2 = tablica[1][0] + tablica[1][1] + tablica[1][2];
        int sum3 = tablica[2][0] + tablica[2][1] + tablica[2][2];

        if(sum1 > sum2 && sum1 > sum3){
            System.out.println("Największa suma jest w wierszu 1 i wynosi " + sum1);
        }
        else if(sum2 > sum1 && sum2 > sum3){
            System.out.println("Największa suma jest w wierszu 2 i wynosi " + sum2);
        }
        else {
            System.out.println("Największa suma jest w wierszu 3 i wynosi " + sum3);
        }
    }
}
