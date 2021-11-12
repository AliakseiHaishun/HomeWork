package AutomationTesting.HomeWork.HW1.Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfDay;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите номер недели:");

            numberOfDay = in.nextInt();

            switch (numberOfDay) {
                case (1):
                    System.out.println("Monday");
                    break;
                    case (2):
                        System.out.println("Tuesday");
                        break;
                        case (3):
                        System.out.println("Wednesday");
                        break;
                        case (4):
                        System.out.println("Thursday");
                        break;
                        case (5):
                        System.out.println("Friday");
                        break;
                        case (6):
                        System.out.println("Saturday");
                        break;
                        case (7):
                        System.out.println("Sunday");
                        break;
                        default:
                        System.err.println("Введенное число < 1 || Введенное число > 7");
                        break;
                }
        } catch (Exception e) {
            System.err.println("Введено не число");
        }
    }
}
