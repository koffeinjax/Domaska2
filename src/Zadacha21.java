/**
 * Created by User on 20.09.2016.
 */
public class Zadacha21 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
