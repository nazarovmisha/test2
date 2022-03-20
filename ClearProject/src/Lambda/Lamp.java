package Lambda;

public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Light on");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
