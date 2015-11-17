package workers;

public class Junior implements Worker {
    private final int hourCost = 10;
    private final int overworkHours = 8;
    private final int overworkMultiplier = 2;
    private final int heroBonus = 10;


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
