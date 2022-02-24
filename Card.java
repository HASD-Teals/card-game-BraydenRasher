public class Card {
    // PROPERTIES
    private String color;
    private String rank;
    private boolean playable;
    private int value;
    private String symbol;

    // CONSTRUCTORS
    public Card() {}

    public Card(String color, String rank, boolean playable, int value, String symbol) {
        this.color = color;
        this.rank = rank;
        this.playable = playable;
        this.value = value;
        this.symbol = symbol;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public String getRank() {
        return this.rank;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void getSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void getValue(int value) {
        this.value = value;
    }

    public void getPlayable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String toString() {
        String temp = "";
        temp += this.color + " " + this.rank + " " + this.symbol + " " + this.value + " " + this.playable + "\n";
        return temp;
    }
}
