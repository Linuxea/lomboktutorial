package com.linuxea.lomboktutorial;

import lombok.Data;
import lombok.NonNull;

@Data
public class NonnullDataTest {

    @NonNull
    private final String content;

}
