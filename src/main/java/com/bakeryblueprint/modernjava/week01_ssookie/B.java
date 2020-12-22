package com.bakeryblueprint.modernjava.week01_ssookie;

public interface B extends A {
    default void hello() {
        System.out.println("Hello From B");
    }
}
