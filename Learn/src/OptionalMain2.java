import java.util.Optional;

public class OptionalMain2 {
    public static void main(String[] args) {

        Optional<Double> average = OptionalMain.average(10,100);
        if(average.isPresent()){
            System.out.println(average.get());
        }
    }
}