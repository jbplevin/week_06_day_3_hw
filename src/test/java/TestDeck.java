import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulateDeck(){
//        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canRemoveCard(){
        deck.removeCard();
        assertEquals(51, deck.cardCount());
    }
}
