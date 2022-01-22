package CarEngine;

public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;

    }


    class Engine {
        boolean isWorking = false;
        int horsepower;


        public Engine(int horsePower) {
            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if (this.isWorking) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}

