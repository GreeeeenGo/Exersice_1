import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите значение а:");
        int a = vvod.nextInt();
        System.out.println("Введите значение b:");
        int b = vvod.nextInt();
        System.out.println("Введите значение c:");
        int c = vvod.nextInt();
        double z = z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("z = " + z);
    }
}
