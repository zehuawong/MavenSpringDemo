package com.wang;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
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
        Demo demo=new Demo();
        Assert.assertEquals(3,demo.add(1,2));
//        assertTrue( true );
    }

}
