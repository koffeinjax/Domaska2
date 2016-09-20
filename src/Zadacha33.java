import java.util.Scanner;

public class Zadacha33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =0;
        do {
            System.out.println("Введите число: ");
            n = in.nextInt();
        } while (n <= 2);

        for (int i = 2; i <= n; i++) {
            boolean a= true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}

