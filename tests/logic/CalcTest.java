package logic;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import workers.*;

import java.lang.reflect.Array;


public class CalcTest {
    Calc testCalc;
    Junior testJunior;
    Senior testSenior;
    Specialist testSpecialist;

    @Before
    public void setUp(){
        this.testCalc = new Calc();
        this.testJunior = new Junior();
        this.testSenior = new Senior();
        this.testSpecialist = new Specialist();
    }

    @Test
    public void testBasicSalaryCalculation(){
        Worker[] workers = {testJunior, testSenior, testSpecialist};

        for(Worker worker: workers){
            int hoursWorkedJunior = worker.getOverworkLimit() - 1;
            assertEquals("Basic salary test for " + worker.getClass().getName(), worker.getHourCost()*hoursWorkedJunior,
                    testCalc.calculateBasicSalary(worker, hoursWorkedJunior));
            hoursWorkedJunior += 1;
            assertEquals("Basic salary special case test for " + worker.getClass().getName(), worker.getHourCost()*hoursWorkedJunior,
                    testCalc.calculateBasicSalary(worker, hoursWorkedJunior));
            hoursWorkedJunior += 1;
            assertEquals("Basic salary should not change with overwork for " + worker.getClass().getName(), worker.getHourCost()*worker.getOverworkLimit(),
                    testCalc.calculateBasicSalary(worker, hoursWorkedJunior));
        }
    }

    @Test
    public void testOverworkBonusCalculation(){
        Worker[] workers = {testJunior, testSenior, testSpecialist};

        for(Worker worker: workers){
            int hoursWorked = worker.getOverworkLimit()-1;
            assertEquals("Basic salary for " + worker.getClass().getName(), 0, testCalc.calculateOverworkBonus(worker, hoursWorked));

            hoursWorked += 1;
            assertEquals("Basic salary special case for " +  worker.getClass().getName(), 0, testCalc.calculateOverworkBonus(worker, hoursWorked));

            hoursWorked += 1;
            int hoursOverworked = hoursWorked - worker.getOverworkLimit();
            assertEquals("Basic salary overwork positive  for " + worker.getClass().getName(), worker.getOverworkMultiplier()*worker.getHourCost()*hoursOverworked,
                    testCalc.calculateOverworkBonus(worker, hoursWorked));
        }
    }

    @Test
    public void testHeroBonusCalculation(){
        Worker[] workers = {testJunior, testSenior, testSpecialist};
        int hoursForHeroBonusMinLimit = 20;
        int hoursWorked = hoursForHeroBonusMinLimit + 1;

        for(Worker worker: workers){
            assertEquals("Hero bonus salary for " + worker.getClass().getName(), worker.getHeroBonus(), testCalc.calculateHeroBonus(worker, hoursWorked));
        }
    }

    @Test
    public void testTotalSalaryCalculation(){
        int hoursWorked = 3;
        assertEquals("Salary for Junior test", 30, testCalc.pay(testJunior, hoursWorked));
        assertEquals("Salary for Senior test", 45, testCalc.pay(testSenior, hoursWorked));
        assertEquals("Salary for Specialist test", 66, testCalc.pay(testSpecialist, hoursWorked));

        hoursWorked = 25;
        assertEquals("Salary for Junior test", 430, testCalc.pay(testJunior, hoursWorked));
        assertEquals("Salary for Senior test", 650, testCalc.pay(testSenior, hoursWorked));
        assertEquals("Salary for Specialist test", 1284, testCalc.pay(testSpecialist, hoursWorked));

    }
}
