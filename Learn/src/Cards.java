//Создайте класс Card (Карта) с полями «масть» типа String и «ранг» типа String.
//Определите в нем методы equals() и hashCode() (подумайте, какие лучше поля включить в оба метода).
//Создайте HashSet, заполните его полностью колодой карт от 6 до туза, плюс еще 3-4 повторяющиеся карты.
//Убедитесь, что длина Set в итоге после добавления карт = 36.

import java.util.*;

public class Cards {
    String suit;
    String rang;

    public Cards(String suit, String rang) {
        this.suit = suit;
        this.rang = rang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(suit, cards.suit) && Objects.equals(rang, cards.rang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rang);
    }

    public static void main(String[] args) {
        Set<Cards> set = new HashSet<>();
        set.add(new Cards("Черви", "6"));
        set.add(new Cards("Черви", "7"));
        set.add(new Cards("Черви", "8"));
        set.add(new Cards("Черви", "8"));
        set.add(new Cards("Черви", "9"));
        set.add(new Cards("Черви", "10"));
        set.add(new Cards("Черви", "Валет"));
        set.add(new Cards("Черви", "Дама"));
        set.add(new Cards("Черви", "Король"));
        set.add(new Cards("Черви", "Король"));
        set.add(new Cards("Черви", "Туз"));
        set.add(new Cards("Бубны", "6"));
        set.add(new Cards("Бубны", "7"));
        set.add(new Cards("Бубны", "8"));
        set.add(new Cards("Бубны", "9"));
        set.add(new Cards("Бубны", "10"));
        set.add(new Cards("Бубны", "Валет"));
        set.add(new Cards("Бубны", "Дама"));
        set.add(new Cards("Бубны", "Король"));
        set.add(new Cards("Бубны", "Туз"));
        set.add(new Cards("Вини", "6"));
        set.add(new Cards("Вини", "7"));
        set.add(new Cards("Вини", "8"));
        set.add(new Cards("Вини", "9"));
        set.add(new Cards("Вини", "10"));
        set.add(new Cards("Вини", "Валет"));
        set.add(new Cards("Вини", "Дама"));
        set.add(new Cards("Вини", "Король"));
        set.add(new Cards("Вини", "Туз"));
        set.add(new Cards("Вини", "Туз"));
        set.add(new Cards("Крести", "6"));
        set.add(new Cards("Крести", "7"));
        set.add(new Cards("Крести", "8"));
        set.add(new Cards("Крести", "9"));
        set.add(new Cards("Крести", "10"));
        set.add(new Cards("Крести", "Валет"));
        set.add(new Cards("Крести", "Валет"));
        set.add(new Cards("Крести", "Дама"));
        set.add(new Cards("Крести", "Король"));
        set.add(new Cards("Крести", "Туз"));
        System.out.println(set.size());
    }
}