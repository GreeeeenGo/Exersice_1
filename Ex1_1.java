import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите значение а:");
        int a = vvod.nextInt();
        System.out.println("Введите значение b:");
        int b = vvod.nextInt();
        System.out.println("Введите значение c:");
        int c = vvod.nextInt();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}
