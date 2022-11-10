import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOne = (number / 100);
        int numberThree = (number % 10);
        int numberTwo = (number % 100 - numberThree) / 10;
      //  int numberThree = (number % 10);
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
    }
}
