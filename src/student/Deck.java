package student;

import java.util.Random;

public class Deck {

    private int cur;
    private Card[] deck;

    /**
     * Creates new Deck with 52 cards
     */
    public Deck() {
        deck = new Card[52];
        for (int i = 1; i <= deck.length;i += 4) {
            deck[i - 1] = new Card(i / 4 + 1, 1);
            deck[i] = new Card(i / 4 + 1, 2);
            deck[i + 1] = new Card(i / 4 + 1, 3);
            deck[i + 2] = new Card(i / 4 + 1, 4);
        }
        this.shuffle();
    }

    /**
     * Shuffles the deck using Fisher-Yates algorithm
     * Sets cur index to 51 (top of deck)
     */
    public void shuffle(){
        Random rn = new Random();
        for (int i = deck.length-1; i > 0; i--) {
            int j = rn.nextInt(i+1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        cur = 51;
    }

    /**
     * Draws next card from shuffled stack
     * Updates cur index
     * Reshuffles if deck all used
     * @return Card at index cur
     */
    public Card draw() {
        if (cur == -1) {
            this.shuffle();
        }
        cur -= 1;
        return deck[cur + 1];
    }

    /**
     * @return number of cards not yet dealt
     */
    public int cardsRemaining() {
        return this.cur + 1;
    }

    /**
     * @return whether all cards dealt or not
     */
    public boolean isEmpty() {
        return cur < 0;
    }
}
