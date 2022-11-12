import java.util.Scanner;

public class HomeWorkLewelTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne == 36 && numberTwo == 17){
            System.out.println("Джекпот");
        }
        else if (numberOne == 36 || numberTwo == 17) {
            System.out.println("Маленький выигрыш");
        }
        else {
            System.out.println("Все проиграл");
        }
    }
}
