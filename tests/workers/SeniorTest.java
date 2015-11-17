package workers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SeniorTest {
    Senior seniorTest;

    @Before
    public void setUp(){
        this.seniorTest = new Senior();
    }

    @Test
    public void testHourCost(){
        assertEquals("Test hour salary", 15, seniorTest.getHourCost());
    }

    @Test
    public void testOverWorkLimit(){
        assertEquals("Test overwork limit", 8, seniorTest.getOverworkLimit());
    }

    @Test
    public void testOverWorkMultiplier(){
        assertEquals("Test overwork multiplier", 2, seniorTest.getOverworkMultiplier());
    }

    @Test
    public void testHeroBonus(){
        assertEquals("Test hero bonus", 20, seniorTest.getHeroBonus());
    }
}
