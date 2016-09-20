/**
 * Created by User on 20.09.2016.
 */
public class Zadacha22 {
    public static void main(String[] args) {
        int[][] Mas = new int[7][4];
        int[] Mas1 = new int[Mas.length];
        for (int i = 0; i < Mas.length; i++) {
            System.out.print("Индекс" + i + " ");
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(Mas[i][j] + " ");
                if (j == 0) Mas1[i] = Mas[i][j];
                else Mas1[i] *= Mas[i][j];
                if (j == Mas[i].length - 1)
                    System.out.println(" ");
            }
        }
        int max = 0, max_i = 0;
        for (int i = 0; i < Mas1.length; i++) {
            if (Math.abs(Mas1[i]) > max) {
                max = Mas1[i];
                max_i = i;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов (" + max + ") имеет индекс - " + max_i);

    }
}