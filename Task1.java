import java.util.Scanner;

/**
 * Created by Артём on 15.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число ");
        int day = scan.nextInt();
        System.out.print("Введите месяц ");
        int month = scan.nextInt();
        System.out.print("Введите год ");
        int year = scan.nextInt();
            if (day == 31 && month == 12) {
                year++;
                day -= 30;
                month -= 11;
                format(day,month,year);
            } else if ((day == 31) && (month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10)) {
                month++;
                day -= 30;
                format(day,month,year);
            } else if ((day == 30) && (month == 4 || month == 6 || month == 9 ||
                    month == 11)) {
                month++;
                day -= 29;
                format(day,month,year);
            } else if (day == 28 && month == 2&&year%4!=0) {
                month++;
                day -= 27;
                format(day,month,year);
            } else if (day == 29 && month == 2&&year%4==0) {
                month++;
                day -= 28;
                format(day,month,year);
            } else if (day > 31 || day < 1 || month < 1 || month > 12) {
                wrong();
            } else if ((day > 30) && (month == 4 || month == 6 || month == 9 ||
                    month == 11)) {
                wrong();
            } else if (day > 28 && month == 2 && year%4!=0) {
                wrong();
            } else {
                day ++;
                format(day,month,year);
            }
    }
    public static void format (int day,int month,int year){
        String format= "Следующая дата: "+day+"."+month+"."+year;
        System.out.println(format);
    }
    public static void wrong (){
        String wrong= "Проверьте введенную дату";
        System.out.println(wrong);
    }
    public static int nextMonth (int month) {
        month++;
        return month;
    }
}
