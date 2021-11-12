package AutomationTesting.HomeWork.HW1.Task4.Car;

import AutomationTesting.HomeWork.HW1.Task4.Car.AbstractCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.Color;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.Model;

public class FiatCar extends AbstractCar {
    private boolean alarm;

    public FiatCar(Model model, Color color, int maxSpeed, int fuelСonsumption, int price, boolean alarm) {
        super(model, color, maxSpeed, fuelСonsumption, price);
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "FiatCar{" +
                "model=" + model +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", fuelСonsumption=" + fuelСonsumption +
                ", alarm=" + alarm +
                '}';
    }
}
