public class c322 {
    public static void main(String[] args) {
        String a = "Иван Иванович";
        String b = "иван иванович";
        checkName(a, b);
    }

    private static void checkName(String a, String b) {
        String acopy = a.replace(" ","");
        if(a.equalsIgnoreCase(b)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        System.out.println("Длина вашего имени:" + a.length()+ "символов");
        "Иван Иванович ".replace("Иван","Вован");
        System.out.println(a);
        System.out.println("А без пробелов длина вашего имени:"+ acopy.length()+ "символов");
    }
}



