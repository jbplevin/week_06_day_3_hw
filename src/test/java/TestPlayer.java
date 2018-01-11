import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player( "Jimmy");
        card = new Card( Suit.SPADES, Rank.ACE );
    }

    @Test
    public void hasName(){
        assertEquals("Jimmy", player.getName());
    }

    @Test
    public void canAddCard(){
        player.addCard(card);
        assertEquals( 1, player.handCardCount());
    }
}

