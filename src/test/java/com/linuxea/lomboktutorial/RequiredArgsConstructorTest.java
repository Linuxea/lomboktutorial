package com.linuxea.lomboktutorial;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsConstructorTest {

    private final String name;
    @NonNull
    private Integer age = null;

}
