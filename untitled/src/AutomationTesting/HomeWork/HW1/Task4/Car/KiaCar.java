package AutomationTesting.HomeWork.HW1.Task4.Car;

import AutomationTesting.HomeWork.HW1.Task4.Car.AbstractCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.Color;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.Model;

public class KiaCar extends AbstractCar {
    private boolean bluetooth;
    public KiaCar(Model model, Color color, int maxSpeed, int fuelСonsumption, int price, boolean bluetooth) {
        super(model, color, maxSpeed, fuelСonsumption, price);
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "KiaCar{" +
                "model=" + model +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", fuelСonsumption=" + fuelСonsumption +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
