/**
 * Created by User on 20.09.2016.
 */
public class Zadacha14 {
    public static void main(String[] args) {
        int y=0;
        for(int hour=1;hour<=24;hour++){
            for(int min=0;min<=59;min++){
                if(hour/10%10 == min%10   &   hour%10 == min/10%10){
                    y++;
                }
            }
        }
        System.out.println("Числа на электронных часах симметричны "+y+ " раз");
    }
}
