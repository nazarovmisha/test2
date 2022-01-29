
public class Code {
    String code = "secret message";

    public static void main(String[] args) {
    }

    public void replaceAll() {
        code.replaceAll("e", "Xww12").replaceAll("s", "Bmmj44")
                .replaceAll("c", "rtt").replaceAll("a", "qwerasdf");

        System.out.println(code);
    }

    public void decoder() {
        code.replaceAll("Xww12", "e").replaceAll("Bmmj44", "s")
                .replaceAll("rtt", "s").replaceAll("qwerasdf", "a");
        System.out.println(code);

    }
}



