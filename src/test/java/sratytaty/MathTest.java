package sratytaty;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sratytaty.Math.getFactors;

/**
 * Created by RENT on 2017-01-05.
 */
public class MathTest {

    @Test
    public void FactorsFor10() {
        // given
        int number = 10;

        // when
        List<Factors> factorsList = getFactors(10);
        Factors factor1 = new Factors(1,10);
        Factors factor2 = new Factors(2,5);
        Factors factor3 = new Factors(5,2);
        Factors factor4 = new Factors(1,10);

        // then
        assertTrue(factorsList.contains(factor1));
        assertTrue(factorsList.contains(factor2));
        assertTrue(factorsList.contains(factor3));
        assertTrue(factorsList.contains(factor4));

    }
}
