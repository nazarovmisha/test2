package JavaMemory;

public class SOExample {
    public static void main(String[] args) {
        loop(50_000);
        System.out.println("Success!");
    }

    public static void loop(int repeats) {
        if (repeats > 0) {
            loop(repeats - 1);
        }
    }
}