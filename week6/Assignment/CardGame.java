public // HW PROBLEM 3: Game and CardGame Objects

import java.util.Objects;

class Game {
    protected String title;

    public Game(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Game -> Title: " + title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Game)) return false;
        Game other = (Game) obj;
        return Objects.equals(this.title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

public class CardGame extends Game {
    private int numberOfCards;

    public CardGame(String title, int numberOfCards) {
        super(title);
        this.numberOfCards = numberOfCards;
    }

    @Override
    public String toString() {
        return super.toString() + ", CardGame -> Cards: " + numberOfCards;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CardGame)) return false;
        CardGame other = (CardGame) obj;
        return this.numberOfCards == other.numberOfCards;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCards);
    }

    public static void main(String[] args) {
        CardGame c1 = new CardGame("Poker", 52);
        CardGame c2 = new CardGame("Poker", 52);
        CardGame c3 = new CardGame("Rummy", 54);

        System.out.println(c1);
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals c3? " + c1.equals(c3));
    }
}
 {
    
}
