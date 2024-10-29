package student;

public class Hand {

    private Card[] hand;
    private Deck deck;
    private int count;

    /**
     * Creates a hand of Cards
     * @param deck to draw from
     * @param size of hand to initalize
     */
    public Hand(Deck deck, int size) {
        this.deck = deck;
        count = size;
        hand = new Card[size];
        for (int i = 0; i < size; i++) {
            hand[i] = deck.draw();
        }
    }

    /**
     * @return Size of hand
     */
    public int getSize(){
        return count;
    }

    /**
     * @param  i card to get
     * @return Card at [i]
     * otherwise [0] if index invalid
     */
    public Card get(int i) {
        if (i >= count || i < 0){
            System.out.println("Invalid hand index!");
            return hand[0];
        }
        return hand[i];
    }

    /**
     * Removes card from deck and draws new card after
     * @param card to remove from deck
     * @return whether card removed or not
     */
    public boolean remove(Card card) {
        if (card == null) return false;
        for (int i = 0; i < count; i++) {
            if (hand[i].equals(card)) {
                hand[i] = this.deck.draw();
                return true;
            }
        }
        return false;
    }
}
