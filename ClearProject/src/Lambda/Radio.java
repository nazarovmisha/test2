package Lambda;

public class Radio implements ElectricityConsumer {
    void playMusic(){
        System.out.println("Music play!!!");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
