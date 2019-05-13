package com.mirolyubov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();

        Arrays.stream(entity.getClass().getDeclaredMethods())
                .peek(System.out::println)
                .forEach(e -> Arrays.stream(e.getAnnotations())
                .forEach(System.out::println));
    }
}
