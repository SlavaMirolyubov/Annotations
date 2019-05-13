package com.mirolyubov;

public class Entity {

    @Secured(value = 1)
    public void method() {

    }

    @Secured(value = 2, string = "")
    private void method2() {

    }

    @Annotation2
    public void method3() {

    }
}
