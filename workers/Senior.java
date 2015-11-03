package workers;

/**
 * Created by v-varand on 3.11.2015.
 */
public class Senior implements Worker {
    private final int hourCost = 15;
    private final int overworkHours = 8;
    private final int overworkMultiplier = 2;
    private final int heroBonus = 20;


    @Override
    public int getHourCost() {
        return hourCost;
    }

    @Override
    public int getOverworkLimit() {
        return overworkHours;
    }

    @Override
    public int getOverworkMultiplier() {
        return overworkMultiplier;
    }

    @Override
    public int getHeroBonus() {
        return heroBonus;
    }
}
