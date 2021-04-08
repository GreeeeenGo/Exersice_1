import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int number = vvod.nextInt();
        int hours = number / 3600, minutes = (number - hours*3600) / 60, seconds = number - hours*3600 - minutes*60;
        System.out.println(number + " секунд - это " + hours + " часов " + minutes + " минут " + seconds + " секунд.");
    }
}
