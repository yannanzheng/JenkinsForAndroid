package com.example.jfyang.jenkinsforandroid;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jfyang on 14/12/2016.
 */
public class OperateTest {
    @Test
    public void plus() {
        Operate operate=new Operate();

        int a=10;
        int b=29;
        assertEquals(39,operate.plus(a,b));

    }

}