package com.mirolyubov;

public class Entity {

    @Secured(value = 1)
    public void method() {

    }

    @Secured(value = 2, string = "")
    @Annotation2
    private void method2() {

    }

    public void method3() {

    }
}
