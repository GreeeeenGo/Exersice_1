import java.util.Scanner;

public class Ex3_8 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое число");
        int i = vvod.nextInt();
        System.out.println("Введите второе число");
        int j = vvod.nextInt(), q = i, w = j;
        String str1 = Integer.toString(i);
        String str2 = Integer.toString(j);
        for (int k = 0; k < str1.length(); k++) {
            j = w;
            int a = i % 10;
            for (int l = 0; l < str2.length(); l++) {
                int b = j % 10;
                if (a == b)
                {
                    System.out.println("Цифры " + q + " и " + w + " имеют одинаковое число " + a);
                }
                j /= 10;
            }
            i /= 10;
        }
    }
}
