//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
        else System.out.println("Выход");
    }
}