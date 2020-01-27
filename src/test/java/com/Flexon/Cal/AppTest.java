package com.Flexon.Cal;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 30;
        Integer result = App.sum(x, y);
        assertEquals(expResult, result);
        assertEquals(null, App.sum(15, null));
        assertEquals(null, App.sum(null, 15));
        assertEquals(null, App.sum(null, null));
      }
}
