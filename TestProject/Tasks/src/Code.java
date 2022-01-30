public class Code {
    String code = "secret message";

    public static void main(String[] args) {
        Code c1 = new Code();
        c1.replaceAll();
        c1.decoder();
    }

    public void replaceAll() {
        code = code.replaceAll("e", "Xww12").replaceAll("s", "Bmmj44")
                .replaceAll("c", "rtt").replaceAll("a", "qwerasdf");

        System.out.println(code);
    }

    public void decoder() {
        code = code.replaceAll("Xww12", "e").replaceAll("Bmmj44", "s")
                .replaceAll("rtt", "c").replaceAll("qwerasdf", "a");
        System.out.println(code);

    }
}

