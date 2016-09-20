/**
 * Created by User on 20.09.2016.
 */
public class Zadacha13 {
    public static void main(String[] args) {
        int ticket=1;
        for (int i = 0; i<1000000; i++){
            int i1=i/100000%10;
            int i2=i/10000%10;
            int i3=i/1000%10;
            int i4=i/100%10;
            int i5=i/10%10;
            int i6=i%10;
            if ((i1+i2+i3)==(i4+i5+i6)) {
                ticket++;
            }
        }
        System.out.println("Количество счастливых билетов " +ticket);
    }
}
