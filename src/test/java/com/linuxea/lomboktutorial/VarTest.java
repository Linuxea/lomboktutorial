package com.linuxea.lomboktutorial;

import org.junit.Test;

public class VarTest {

    @Test
    public void testVar() {
        var a = "string"; // var infer a as a string from initial expression
        System.out.println(a);
    }

    @Test
    public void testVarInfer() {
        var content = "this is a content of string type";

//        content = 1; // compiled fail
    }

}
