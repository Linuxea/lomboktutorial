package com.linuxea.lomboktutorial;

import lombok.Cleanup;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CleanUpTest {


    public void testCleanUp() throws Exception {

        @Cleanup("shutdown") ExecutorService executorService = Executors.newFixedThreadPool(1);
    }

}
