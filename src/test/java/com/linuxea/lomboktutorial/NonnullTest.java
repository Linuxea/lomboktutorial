package com.linuxea.lomboktutorial;

import lombok.NonNull;

public class NonnullTest {

    // Nonnull constructor parameter
    public NonnullTest(@NonNull String string) {
        // pass
    }


    // Nonnull method parameter
    public void say(@NonNull String something) {
        System.out.println(something);
    }


}
