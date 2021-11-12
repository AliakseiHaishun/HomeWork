package AutomationTesting.HomeWork.HW1.Task4.Car;

import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.BMWColors;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.Color;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.Model;

public class BMWCar extends AbstractCar{
    private boolean climateControl;
    public BMWCar(Model model, Color color, int maxSpeed, int fuelСonsumption, int price, boolean climateControl) {
        super(model, color, maxSpeed, fuelСonsumption, price);
        this.climateControl = climateControl;
    }


}
