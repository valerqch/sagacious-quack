import logic.Calc;
import workers.Specialist;
import workers.Worker;

public class Main {

    public static void main(final String[] args) {
        Calc c = new Calc();
        Worker specialistWorker = new Specialist();
        System.out.println(c.pay(specialistWorker, 3) + " should be 66");
    }
}
