package com.example.testcsaebyjunit.example;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {

    @Test
    public void test(){

        Number number = new Number(1,-2,1);

        Assert.assertEquals("Phương trình có nghiệm kép: "
                + "x1 = x2 = " + 1.0 , number.giaiphuongtrinhbac2());

    }
}
