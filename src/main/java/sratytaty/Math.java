package sratytaty;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RENT on 2017-01-05.
 */
public class Math {
    public static List<Factors> getFactors(int number) {
        List<Factors> factors = new LinkedList<Factors>();

        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                Factors factor = new Factors(0,0);
                factor.setX(i);
                factor.setY(number/i);
                factors.add(factor);
            }
        }
        return factors;
    }
}
