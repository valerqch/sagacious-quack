package workers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JuniorTest {
    Junior juniorTest;

    @Before
    public void setUp(){
        this.juniorTest = new Junior();
    }

    @Test
    public void testHourCost(){
        assertEquals("Test hour salary", 10, juniorTest.getHourCost());
    }

    @Test
    public void testOverWorkLimit(){
        assertEquals("Test overwork limit", 8, juniorTest.getOverworkLimit());
    }

    @Test
    public void testOverWorkMultiplier(){
        assertEquals("Test overwork multiplier", 2, juniorTest.getOverworkMultiplier());
    }

    @Test
    public void testHeroBonus(){
        assertEquals("Test hero bonus", 10, juniorTest.getHeroBonus());
    }
}
