package student;

public class CardPile {

    /**
     * Size of Pile.
     */
    private int size;

    /**
     * Card on top of Pile.
     */
    private Card topCard;

    /**
     * Initalize new card pile with given topCard.
     * Size of pile is 1
     * @param topCard to start off pile
     */
    public CardPile(Card topCard) {
        this.topCard = topCard;
        size = 1;
    }

    /**
     * @return if card is playable.
     */
    public boolean canPlay(Card card) {
        return card != null
                && ( card.getRankNum() >= topCard.getRankNum()
                || card.getSuitName().equals(topCard.getSuitName()) );
    }

    /**
     * Plays the current card if possible.
     * Otherwise prints error message
     * @param card to play
     */
    public void play(Card card) {
        if (canPlay(card)) {
            topCard = card;
            size++;
        } else {
            System.out.println("Illegal move detected!");
        }
    }

    /**
     * @return number of cards in pile.
     */
    public int getNumCards() {
        return size;
    }

    /**
     * @return topCard on pile.
     */
    public Card getTopCard() {
        return topCard;
    }




}
