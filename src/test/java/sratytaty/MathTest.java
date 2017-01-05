package sratytaty;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RENT on 2017-01-05.
 */
public class MathTest {

    @Test
    public void Factors {
        // given
        int x = 10;
        int y = 5;
        int z = 2;

        // when
        Factors factors = new Factors(x, y);
        factors.getIloczyn((z*y), (y*z), (x*1));

        // then
        assertEquals(x, factors.getIloczyn());
        assertEquals(y, factors.getIloczyn());
    }
}
