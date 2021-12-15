public class C2 {
    public static void main(String[] args) {

    }
    Boolean ding = true;

    void sound() {
        if (ding) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        ding = !ding;
    }
}
