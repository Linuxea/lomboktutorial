package com.linuxea.lomboktutorial;

import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
public class ToStringTest {

    @ToString.Include(name = "anotherName", rank = 2)
    private String name;

    private Integer age;
}
