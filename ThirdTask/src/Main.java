//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int number = console.nextInt();
        boolean check = true;

        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Введите массив чисел: ");
        for (int j = 0; j < number; j++){
            array.add(console.nextInt());
        }
        System.out.print("Кратные 3 числа: ");
        for (int j = 0; j < number; j++){
            if (array.get(j) % 3 == 0){
                check = false;
                System.out.print(array.get(j) + " ");
            }
        }
        if (check){
            System.out.print("отсутствуют");
        }
    }
}