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
        List<Factors> factorsList = Math.getFactors(number);
//        Factors factor1 = new Factors(1,10);
//        Factors factor2 = new Factors(2,5);
        Factors factor3 = new Factors(5,2);
        Factors factor4 = new Factors(1,10);

        // then
        assertEquals(4, factorsList.size());
//        assertEquals(1, factorsList.get(0).getX());
//        assertEquals(10, factorsList.get(0).getY());
        assertTrue(factorsList.contains(new Factors(1,10)));
        assertTrue(factorsList.contains(new Factors(2,5)));
        assertTrue(factorsList.contains(factor3));
        assertTrue(factorsList.contains(factor4));

    }
}
