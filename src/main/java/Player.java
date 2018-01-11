import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int handCardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
        }
    }

