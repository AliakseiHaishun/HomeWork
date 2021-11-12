package AutomationTesting.HomeWork.HW1.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите число или введите слово Stop для результатов:");

        while (true) {
            try {
                if (in.hasNext("Stop")) {
                    int minNumber = list.get(0);
                    int maxNumber = list.get(0);
                    int lengthOfMinNumber;
                    int lengthOfMaxNumber;
                    for (int i = 0; i < list.size(); i++) {
                        if (String.valueOf(Math.abs(list.get(i))).length() <
                                String.valueOf(Math.abs(minNumber)).length()) {
                            minNumber = list.get(i);
                        }
                        if (String.valueOf(Math.abs(list.get(i))).length() >
                                String.valueOf(Math.abs(maxNumber)).length()) {
                            maxNumber = list.get(i);
                        }
                    }
                    lengthOfMinNumber = String.valueOf(Math.abs(minNumber)).length();
                    lengthOfMaxNumber = String.valueOf(Math.abs(maxNumber)).length();

                    System.out.println("Самое короткое число: " + minNumber);
                    System.out.println("Его длинна: " + lengthOfMinNumber);
                    System.out.println("Самое длинное число: " + maxNumber);
                    System.out.println("Его длинна: " + lengthOfMaxNumber);
                    System.out.println("Максимальное число: " + Collections.max(list));
                    System.out.println("Минимальное число: " + Collections.min(list));
                    break;
                }
                if (!in.hasNextInt()) {
                    System.out.println("Введите число формата int");
                    in.next();
                } else {
                    list.add(in.nextInt());
                }
            } catch (Exception e) {
            }
        }
    }

}
