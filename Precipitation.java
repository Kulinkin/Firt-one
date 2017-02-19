import java.util.Scanner;

/**
 * Created by Артём on 19.02.2017.
 */
public class Precipitation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество дней:");
        double day=sc.nextDouble();
        double sum=0;
        double max=0;
        for(int i=1;i<=day;i++){
            System.out.println("Введите кол во осадков за " + i + " день");
            double precLvl=sc.nextDouble();
            if(max<precLvl){
                max=precLvl;
            }
            sum+=precLvl;
        }
        double middle=sum/day;
        System.out.println("Колличество дней: " + day);
        System.out.println("Сумма осадков: " + sum);
        System.out.println("Среднее количество осадков: " + middle);
        System.out.println("Максимальное количество осадков: " + max);

    }
}
