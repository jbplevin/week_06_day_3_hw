import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void populate() {
        Suit[] suitValues = Suit.values();
        Rank[] rankValues = Rank.values();
        for(Suit suit: suitValues){
            for(Rank rank: rankValues){
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Card removeCard() {
        return this.cards.remove(0);
    }
}
