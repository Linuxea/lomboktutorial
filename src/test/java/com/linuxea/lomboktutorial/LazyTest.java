package com.linuxea.lomboktutorial;

import lombok.Getter;
import org.junit.Test;

public class LazyTest {

    @Getter(lazy = true)
    private final String expensive = expensiveCalculate();

    public String expensiveCalculate() {
        System.out.println("expensiveCalculate");
        return "abc";
    }

    @Test
    public void testLazy() {
        LazyTest lazyTest = new LazyTest();
        System.out.println(lazyTest.getExpensive());
        System.out.println(lazyTest.getExpensive());
        System.out.println(lazyTest.getExpensive());
    }

}
