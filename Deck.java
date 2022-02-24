import java.lang.reflect.Array;
import java.util.Random;

public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {

    // ljlk
    Card[] deck1 = new Card[52];

        // Clubs
        for (int i = 1; i <= 13; i++) {
            deck1[i] = new Card("black", " " + i, true, i, "c");
        }
        // Spades
        for (int i = 14; i <= 26; i++) {
            deck1[i] = new Card("black", " " + (i-13), true, i - 13, "s");
        }
        // Hearts
        for (int i = 27; i <= 39; i++) {
            deck1[i] = new Card("red", " " + (i-26), true, i - 26, "h");
        }
        // Diamonds
        for (int i = 39; i <= 52; i++) {
            deck1[i] = new Card("red", " " + (i-39), true, i - 39, "d");
        }
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void printDeck(Array[] deck1) {
        for (int i = 1; i <= 52; i++) {
            System.out.println(deck1[i]);
        }
    }

    public void shuffle(){
        for(int i=0; i<this.numberOfCards();i++){
        int swapIndex = (int) (this.numberOfCards()*Math.random());
        Card temp = this.getCardAt(i);
        this.getCards()[i] = this.getCardAt(swapIndex);
        this.getCards()[swapIndex] = temp;
        }
    }

    private Card getCardAt(int i, Array deck1[]) {
        = deck1[i];
        return cardGot;
    }

    public void shuffleCards(Array[] deck1) {
        int temp;
        
        // ok im just going to think on here
        // we've got this whole array of cards, they're all in order, and we need to make them not in order
        // how do we do that? i think we make a for loop that takes a random card and copies it to a temp
        // array and then appends it to the end of the deck array.
        // Shuffle this.cards in a random order
        for (int i = 0; i <= deck1.length; i++) {
            temp[deck1[upperbound]];
        }
    } 
}