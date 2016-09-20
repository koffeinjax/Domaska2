import java.util.Scanner;


public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int n;
        int sum =0;
        n = scanner.nextInt();
        while (n!=0){
            sum=sum +(n%10);
            n=n/10;
        }
        System.out.println("Сумма заданного числа = " + sum);
    }
}
