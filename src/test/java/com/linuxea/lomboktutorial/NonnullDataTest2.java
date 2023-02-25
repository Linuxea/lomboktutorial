package com.linuxea.lomboktutorial;

import lombok.NonNull;

public class NonnullDataTest2 {


    public void say(@NonNull String content) {
        if(content == null) {
            return;
        }
        System.out.println(content);
    }

}
