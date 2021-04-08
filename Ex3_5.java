import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите e");
        double e = vvod.nextDouble();
        double n = 0, sum = 0, a;
        do {
            n++;
            a = 1 / Math.pow(2, n) + 1 / (Math.pow(3, n));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        while (n <= 20);

        System.out.println("Сумма = " + sum);
    }
}
