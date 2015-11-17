package workers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SpecialistTest {
    Specialist specialistTest;

    @Before
    public void setUp(){
        this.specialistTest = new Specialist();
    }

    @Test
    public void testHourCost(){
        assertEquals("Test hour salary", 22, specialistTest.getHourCost());
    }

    @Test
    public void testOverWorkLimit(){
        assertEquals("Test overwork limit", 9, specialistTest.getOverworkLimit());
    }

    @Test
    public void testOverWorkMultiplier(){
        assertEquals("Test overwork multiplier", 3, specialistTest.getOverworkMultiplier());
    }

    @Test
    public void testHeroBonus(){
        assertEquals("Test hero bonus", 30, specialistTest.getHeroBonus());
    }
}
