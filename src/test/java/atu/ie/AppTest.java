package atu.ie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnHello()
    {
        String x = App.returnHello();
        assertEquals(x, "Hello World!");
    }
    /*just some comment aldskhf;lahksd;flha; */
}
