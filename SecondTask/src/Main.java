//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите имя: ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        }
        else System.out.println("Нет такого имени");
    }
}