package workers;

/**
 * Created by v-varand on 3.11.2015.
 */
public class Specialist implements Worker {
    private final int hourCost = 22;
    private final int overworkHours = 9;
    private final int overworkMultiplier = 3;
    private final int heroBonus = 30;


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
