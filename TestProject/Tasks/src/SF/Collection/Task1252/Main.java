package SF.Collection.Task1252;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final String Spades = "Spades ";
    private static final String Clubs = "Clubs";
    private static final String Diamonds = "Diamonds";
    private static final String Hearts = "Hearts";

    public static void main(String[] args) {

        Card card1 = new Card(Spades, "ace");
        Card card2 = new Card(Spades, "king");
        Card card3 = new Card(Spades, "queen");
        Card card4 = new Card(Spades, "jack");
        Card card5 = new Card(Spades, "10");
        Card card6 = new Card(Spades, "9");
        Card card7 = new Card(Spades, "8");
        Card card8 = new Card(Spades, "7");
        Card card9 = new Card(Spades, "6");
        Card card10 = new Card(Clubs, "ace");
        Card card11 = new Card(Clubs, "king");
        Card card12 = new Card(Clubs, "queen");
        Card card13 = new Card(Clubs, "jack");
        Card card14 = new Card(Clubs, "10");
        Card card15 = new Card(Clubs, "9");
        Card card16 = new Card(Clubs, "8");
        Card card17 = new Card(Clubs, "7");
        Card card18 = new Card(Clubs, "6");
        Card card19 = new Card(Diamonds, "ace");
        Card card20 = new Card(Diamonds, "king");
        Card card21 = new Card(Diamonds, "queen");
        Card card22 = new Card(Diamonds, "jack");
        Card card23 = new Card(Diamonds, "10");
        Card card24 = new Card(Diamonds, "9");
        Card card25 = new Card(Diamonds, "8");
        Card card26 = new Card(Diamonds, "7");
        Card card27 = new Card(Diamonds, "6");
        Card card28 = new Card(Hearts, "ace");
        Card card29 = new Card(Hearts, "king");
        Card card30 = new Card(Hearts, "queen");
        Card card31 = new Card(Hearts, "jack");
        Card card32 = new Card(Hearts, "10");
        Card card33 = new Card(Hearts, "9");
        Card card34 = new Card(Hearts, "8");
        Card card35 = new Card(Hearts, "7");
        Card card36 = new Card(Hearts, "6");
        Card card37 = new Card(Hearts, "6");
        Card card38 = new Card(Hearts, "queen");
        Card card39 = new Card(Clubs, "king");

        Set<Card> cardSet = new HashSet<>();

        cardSet.add(card1);
        cardSet.add(card2);
        cardSet.add(card3);
        cardSet.add(card4);
        cardSet.add(card5);
        cardSet.add(card6);
        cardSet.add(card7);
        cardSet.add(card8);
        cardSet.add(card9);
        cardSet.add(card10);
        cardSet.add(card11);
        cardSet.add(card12);
        cardSet.add(card13);
        cardSet.add(card14);
        cardSet.add(card15);
        cardSet.add(card16);
        cardSet.add(card17);
        cardSet.add(card18);
        cardSet.add(card19);
        cardSet.add(card20);
        cardSet.add(card21);
        cardSet.add(card22);
        cardSet.add(card23);
        cardSet.add(card24);
        cardSet.add(card25);
        cardSet.add(card26);
        cardSet.add(card27);
        cardSet.add(card28);
        cardSet.add(card29);
        cardSet.add(card30);
        cardSet.add(card31);
        cardSet.add(card32);
        cardSet.add(card33);
        cardSet.add(card34);
        cardSet.add(card35);
        cardSet.add(card36);
        cardSet.add(card37);
        cardSet.add(card38);
        cardSet.add(card39);

        System.out.println(cardSet.size());
    }
}


