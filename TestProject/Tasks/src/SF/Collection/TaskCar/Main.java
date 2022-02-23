package SF.Collection.TaskCar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static final String TOYOTA = "TOYOTA";
    private static final String BMW = "BMW";
    private static final String KIA = "Kia";

    public static void main(String[] args) {

        Car car1 = new Car(TOYOTA, "Camry", false);
        Car car2 = new Car(BMW, "X6", false);
        Car car3 = new Car(KIA, "Rio", false);
        Car car4 = new Car(TOYOTA, "RAV 4", true);
        Car car5 = new Car(KIA, "Sorento", false);
        Car car6 = new Car(BMW, "X5", false);
        Car car7 = new Car(BMW, "x4", false);
        Car car8 = new Car(TOYOTA, "LC200", false);
        Car car9 = new Car(TOYOTA, "LC300", false);
        Car car10 = new Car(KIA, "Stinger", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

//        for (Car car : carList) {
//            if (car.getBrand().equals(KIA)) {
//                carList.remove(car);
//            } else if (car.getBrand().equals(BMW)) {
//                car.setOnSale(true);
//            }
//        }

        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getBrand().equals(KIA)) {
                iterator.remove();
            } else if (car.getBrand().equals(BMW)) {
                car.setOnSale(true);
            }
        }

            for (Car car : carList) {
                System.out.println(car);
            }

        }
    }
