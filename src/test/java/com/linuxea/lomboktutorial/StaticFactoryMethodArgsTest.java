package com.linuxea.lomboktutorial;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
public class StaticFactoryMethodArgsTest<K, V> {


    private Map<K, V> map;

}
