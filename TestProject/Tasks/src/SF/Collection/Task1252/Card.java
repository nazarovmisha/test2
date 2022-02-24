package SF.Collection.Task1252;

import java.util.Objects;

public class Card {

    private final String suit;
    private final String rank;

    public Card(String rank, String suit) {
        if (suit == null || rank == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;

    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit.equals(card.suit) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}

