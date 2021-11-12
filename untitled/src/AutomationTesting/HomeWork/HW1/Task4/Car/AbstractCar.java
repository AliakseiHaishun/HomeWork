package AutomationTesting.HomeWork.HW1.Task4.Car;

import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.Color;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.Model;

public abstract class AbstractCar {
    protected final Model model;
    protected final Color color;
    public final int maxSpeed;
    public final int fuelСonsumption;
    public final int price;

    public AbstractCar(Model model, Color color, int maxSpeed, int fuelСonsumption, int price) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuelСonsumption = fuelСonsumption;
        this.price = price;
    }
}
