package com.linuxea.lomboktutorial;

import lombok.With;

public class WithTest {

    @With
    private final String name;

    @With
    private final Integer age;

    private Integer abe;


    public WithTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public WithTest(String name, Integer age, Integer abe) {
        this.name = name;
        this.age = age;
        this.abe = abe;
    }
}
