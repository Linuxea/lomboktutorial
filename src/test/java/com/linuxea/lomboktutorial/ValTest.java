package com.linuxea.lomboktutorial;

import lombok.val;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ValTest {

    @Test
    public void testDeclareLocalVariable() {
        val name = "linuxea";
        System.out.println(name);
    }

    @Test
    public void testDeclareWithinForeach() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        Consumer<Integer> printInteger = it -> {
            val tempInteger = it;
            System.out.println(tempInteger);
        };

        integers.forEach(printInteger);
    }

}
