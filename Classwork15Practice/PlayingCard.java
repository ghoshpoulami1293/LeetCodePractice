package Classwork15Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCard implements Comparable<PlayingCard> {

    enum Suit {
        CLUBS(1),
        DIAMONDS(2),
        HEARTS(3),
        SPADES(4);

        public final int order;

        private Suit(int order) {
            this.order = order;
        }

        public int getOrder() {
            return this.order;
        }
    }

    enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private final int value;

        private Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private final Suit suit;
    private final Rank rank;

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return rank + "of" + suit;
    }

    @Override
    public int compareTo(PlayingCard other){
        int diff = this.suit.getOrder() - other.suit.getOrder();
        if(diff ==0){
            diff = this.rank.getValue() - other.rank.getValue();
        }
        return diff;
    }

    public static void main(String[] args) {
        List<PlayingCard> cards = new ArrayList<>(); 
        cards.add(new PlayingCard(Suit.CLUBS, Rank.FOUR));
        cards.add(new PlayingCard(Suit.SPADES, Rank.ACE));
        cards.add(new PlayingCard(Suit.HEARTS, Rank.QUEEN));
        cards.add(new PlayingCard(Suit.SPADES, Rank.TWO));
        cards.add(new PlayingCard(Suit.DIAMONDS, Rank.SEVEN));
        System.out.println(cards);
        Collections.sort(cards);
        System.out.println(cards);

        Collections.sort(cards, new RankComparator());
        System.out.println(cards);
        }
}
