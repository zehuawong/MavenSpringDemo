package com.wang;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testAdd(){
        Demo demo=new Demo();
        Assert.assertEquals(3,demo.add(1,2));
    }
}
