package com.linuxea.lomboktutorial;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqHashTest {

    @EqualsAndHashCode.Include
    private String parent;

    @EqualsAndHashCode.Exclude
    private String son;

}
