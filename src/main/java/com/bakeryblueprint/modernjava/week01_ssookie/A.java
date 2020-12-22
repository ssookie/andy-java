package com.bakeryblueprint.modernjava.week01_ssookie;

public interface A {
    default void hello() {
        System.out.println("Hello From A");
    }
}
