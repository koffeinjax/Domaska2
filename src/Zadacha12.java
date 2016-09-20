public class Zadacha12 {
    public static void main(String[] args) {
        int fib[] = new int[11];

        for (int i = 0; i <11; i++) {
            if (i == 0) fib[i] = 1;
            if (i == 1) fib[i] = 1;
            if (i > 1) fib[i] = fib[i-1] + fib[i-2];
            System.out.print(fib[i] + ", ");
        }
    }
}
