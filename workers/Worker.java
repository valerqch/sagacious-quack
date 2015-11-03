package workers;

/**
 * Created by v-varand on 3.11.2015.
 */
public interface Worker {

    int getHourCost();

    int getOverworkLimit();

    int getOverworkMultiplier();

    int getHeroBonus();


}
