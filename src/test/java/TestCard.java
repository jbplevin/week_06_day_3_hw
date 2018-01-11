import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.QUEEN, card.getRank());
    }

    @Test
    public void queenHasValue12(){
        int value = card.getRank().getValue();
        assertEquals(12, value);
    }
}
