package AutomationTesting.HomeWork.HW1.Task4.Cabsand;


import AutomationTesting.HomeWork.HW1.Task4.Car.AbstractCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.BMWCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.BMWColors;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.FiatColors;
import AutomationTesting.HomeWork.HW1.Task4.Car.Colors.KiaColors;
import AutomationTesting.HomeWork.HW1.Task4.Car.FiatCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.KiaCar;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.BMWModels;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.FiatModels;
import AutomationTesting.HomeWork.HW1.Task4.Car.Models.KiaModels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cabstand implements SortByFuelConsumption, FIndBySpeed, CabstandTotalPrice {
    List<AbstractCar> carList = new ArrayList<>() {{
       add(new BMWCar(BMWModels.BMW_I3, BMWColors.BLACK, 250, 24, 14000, true));
       add(new BMWCar(BMWModels.BMW_X5, BMWColors.WHITE, 260, 27, 23000, true));
       add(new KiaCar(KiaModels.KIA_CEED, KiaColors.YELLOW, 220, 15, 8000,false));
       add(new FiatCar(FiatModels.FIAT_132, FiatColors.BLUE, 180, 14, 6500, false));
       add(new KiaCar(KiaModels.KIA_SPORTAGE, KiaColors.BROWN, 200, 18, 13500, true));
    }};

    @Override
    public void findBySpeed(int minSpeed, int maxSpeed) {
        List result = carList.stream().filter(i -> i.maxSpeed <= maxSpeed && i.maxSpeed >= minSpeed).
                collect(Collectors.toList());
        if (result.isEmpty()) {
            System.out.println("Авто не найдено");
        } else {
            System.out.println(result);
        }
        return;
    }

    @Override
    public void sortByFuelConsumption() {
        List result2 = carList.stream().
                sorted(Comparator.comparing(i -> i.fuelСonsumption)).
                collect(Collectors.toList());
        System.out.println(result2);
    }

    @Override
    public void cabstandTotalPrice() {
        int sum = 0;
        for (int i = 0; i < carList.size(); i++) {
            sum = sum + carList.get(i).price;
        }
        System.out.println("Стоимость всех авто в таксопарке: " + sum + "$");
    }
}
