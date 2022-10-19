package PeopleQueue;

public class Main {
    public static void main(String[] args) {
        PeopleQueue p1 = new PeopleQueue("Ваня","Паша", "Sasha", "Kolya", "Sergei");
        PeopleQueue p2 = new PeopleQueue("Даша","Маша","Глаша","Простокваша","Няша","Люда","Катя");
        System.out.println("Погнали!!!");
        p1.start();
        p2.start();
    }
}