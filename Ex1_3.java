import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите значение x:");
        int x = vvod.nextInt();
        System.out.println("Введите значение y:");
        int y = vvod.nextInt();
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("z = " + z);
    }
}
