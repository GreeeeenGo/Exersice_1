import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите начальное значение промежутка");
        int m = vvod.nextInt();
        System.out.println("Введите конечное значение промежутка");
        int n = vvod.nextInt();

        for (int j = 2; j < n; j++) {
            System.out.print("Делители числа " + m + ":");
            for (int i = 2; i < n; i++) {
                if (m == i)
                    break;
                if (m % i == 0) {
                    System.out.print(" " + i + ",");
                }
            }
            m++;
            System.out.println();
        }
    }
}
