package AutomationTesting.HomeWork.HW1.Task4;

import AutomationTesting.HomeWork.HW1.Task4.Cabsand.Cabstand;


public class Main {
    public static void main(String[] args) {
        Cabstand cabstand = new Cabstand();
        cabstand.findBySpeed(100, 200);
        System.out.println();
        cabstand.sortByFuelConsumption();
        System.out.println();
        cabstand.cabstandTotalPrice();

    }
}
