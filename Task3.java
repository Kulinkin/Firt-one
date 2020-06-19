import java.util.Scanner;

/**
 * Created by Артём on 17.02.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,x,x1,x2;
        System.out.println("Вид квадратного уравнения: ax^2+bx+c=0\nВведите а:");
        a = scanner.nextDouble();
        System.out.println("Введите b:");
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        c = scanner.nextDouble();
        descriminant(a,b,c);
        double d=descriminant(a,b,c);
        if (d<0) {
            System.out.println("Нет корней");
        }else if (isZero(d,0)){
            x=b/(-2*a);
            System.out.println("Корень x=" + x);
        }else if (isPositive(d,0)){
            x1=((-b)+Math.sqrt(d))/2*a;
            x2=((-b)-Math.sqrt(d))/2*a;
            System.out.println("Корень x1= " + x1+"\nКорень x2= "+x2);
        }
    }

    public static double descriminant(double a,double b,double c) {
        double d = b*b-4*a*c;
        return d;
    }
    public static boolean isZero(double d,int z) {
        return d==z;
    }
    public static boolean isPositive(double d,int z) {
        return d>z;
    }
}
