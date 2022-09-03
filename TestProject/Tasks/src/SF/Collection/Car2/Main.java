//package SF.Collection.Car2;
//
//import SF.Collection.TaskCar.Car;
//
//import java.util.*;
//
//public class Main {
//    private static final String TOYOTA = "TOYOTA";
//    private static final String BMW = "BMW";
//    private static final String KIA = "Kia";
//
//    public static void main(String[] args) {
//
//        Car car1 = new Car(TOYOTA, "Camry", false);
//        Car car2 = new Car(BMW, "X6", false);
//        Car car3 = new Car(KIA, "Rio", false);
//        Car car4 = new Car(TOYOTA, "RAV 4", true);
//        Car car5 = new Car(KIA, "Sorento", false);
//        Car car6 = new Car(BMW, "X5", false);
//        Car car7 = new Car(BMW, "x4", false);
//        Car car8 = new Car(TOYOTA, "LC200", false);
//        Car car9 = new Car(TOYOTA, "LC300", false);
//        Car car10 = new Car(KIA, "Stinger", false);
//        Car car11 = new Car(TOYOTA, "Camry", false);
//        Car car12 = new Car(BMW, "X6", false);
//        Car car13 = new Car(KIA, "Rio", false);
//        Car car14 = new Car(TOYOTA, "RAV 4", true);
//        Car car15 = new Car(KIA, "Sorento", false);
//        Car car16 = new Car(BMW, "X5", false);
//        Car car17 = new Car(BMW, "x4", false);
//        Car car18 = new Car(TOYOTA, "LC200", false);
//        Car car19 = new Car(TOYOTA, "LC300", false);
//        Car car20 = new Car(KIA, "Stinger", false);
//        Car car21 = new Car(TOYOTA, "Camry", false);
//        Car car22 = new Car(BMW, "X6", false);
//        Car car23 = new Car(KIA, "Rio", false);
//        Car car24 = new Car(TOYOTA, "RAV 4", true);
//        Car car25 = new Car(KIA, "Sorento", false);
//        Car car26 = new Car(BMW, "X5", false);
//        Car car27 = new Car(BMW, "x4", false);
//        Car car28 = new Car(TOYOTA, "LC200", false);
//        Car car29 = new Car(TOYOTA, "LC300", false);
//        Car car30 = new Car(KIA, "Stinger", false);
//
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        carList.add(car4);
//        carList.add(car5);
//        carList.add(car6);
//        carList.add(car7);
//        carList.add(car8);
//        carList.add(car9);
//        carList.add(car10);
//        carList.add(car11);
//        carList.add(car12);
//        carList.add(car13);
//        carList.add(car14);
//        carList.add(car15);
//        carList.add(car16);
//        carList.add(car17);
//        carList.add(car18);
//        carList.add(car19);
//        carList.add(car20);
//        carList.add(car21);
//        carList.add(car22);
//        carList.add(car23);
//        carList.add(car24);
//        carList.add(car25);
//        carList.add(car26);
//        carList.add(car27);
//        carList.add(car28);
//        carList.add(car29);
//        carList.add(car30);
//
//        Set<Car> carSet = new TreeSet<>(new CarComparator().reversed());
//
//        carSet.addAll(carList);
//        for (Car car : carSet) {
//            System.out.println(car.getModel());
//        }
//    }
//}