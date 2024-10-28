package student;

public class Card {
    private final int rank;
    private final int suit;

    /**
     * Sets fields = 1, 1 if incorrect param
     * @param rank int to set rank (1-13)
     * @param suit int to set suit (1-4)
     */
    public Card(int rank, int suit) {
        if (rank < 1 || rank > 13 || suit < 1 || suit > 4) {
            System.out.println("Invalid Card");
            this.rank = 1;
            this.suit = 1;
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }

    /**
     * @return rank in int type
     */
    public int getRankNum() {
        return this.rank;
    }

    /**
     * @return rank name in String type
     */
    public String getRankName() {
        if (rank == 1) {
            return "Ace";
        } else if (rank == 2) {
            return "Two";
        } else if (rank == 3) {
            return "Three";
        } else if (rank == 4) {
            return "Four";
        } else if (rank == 5) {
            return "Five";
        } else if (rank == 6) {
            return "Six";
        } else if (rank == 7) {
            return "Seven";
        } else if (rank == 8) {
            return "Eight";
        } else if (rank == 9) {
            return "Nine";
        } else if (rank == 10) {
            return "Ten";
        } else if (rank == 11) {
            return "Jack";
        } else if (rank == 12) {
            return "Queen";
        } else {
            return "King";
        }
    }

    /**
     * @return suit name in String type
     */
    public String getSuitName() {
        if (suit == 1) {
            return "Spades";
        } else if (suit == 2) {
            return "Hearts";
        } else if (suit == 3) {
            return "Clubs";
        } else {
            return "Diamonds";
        }
    }

    /**
     * Overrides default toString method
     * @return [rank] + [suit] representation of card
     */
    @Override
    public String toString() {
        return this.getRankName() + " + " + this.getSuitName();
    }


}
