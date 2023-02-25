package com.linuxea.lomboktutorial;

import lombok.SneakyThrows;

import java.nio.charset.StandardCharsets;

public class SneakThrowsTest {


    @SneakyThrows
    public String print() {
        return new String("abc".getBytes(), StandardCharsets.UTF_8);
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
