package com.linuxea.lomboktutorial;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class GetterSetterTest {


    @Setter(onParam = @__({@NonNull}))
    @Getter(onMethod = @__({@NonNull}))
    private String content;

}
