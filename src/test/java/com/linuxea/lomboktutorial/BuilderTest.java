package com.linuxea.lomboktutorial;


import lombok.Builder;

@Builder(builderClassName = "classBuilder")
public class BuilderTest {


    @Builder.Default
    private String name = "linuxea";
    @Builder.Default
    private Integer age = 20;


    @Builder(builderClassName = "constructorBuilder")
    public BuilderTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Builder(builderClassName = "methodBuilder")
    public BuilderTest make(String name, Integer age) {
        return new BuilderTest(name, age);
    }

    void test() {
        // class builder
        BuilderTest classBuilder = new classBuilder().name("linuxea").age(18).build();
        System.out.println(classBuilder);

        // constructor builder
        BuilderTest constructorBuilder = new constructorBuilder().name("linuxea").age(18).build();
        System.out.println(constructorBuilder);

        // method builder
        BuilderTest methodBuilder = new methodBuilder().name("linuxea").age(18).build();
        System.out.println(methodBuilder);
    }
}
