import java.util.Scanner;

public class Zadacha31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите любое позитивное число: ");
            n = in.nextInt();
        } while (n < 1);
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n >= 1) {
            return n + sum(n - 1);
        }
        return 0;
    }
}

