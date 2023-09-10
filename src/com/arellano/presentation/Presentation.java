package com.arellano.presentation;

import com.arellano.designpatterns.singleresponsibility.Cat;
import com.arellano.designpatterns.singleresponsibility.Dog;

public class Presentation {
    public void animalesCaracteristicas(Dog dog){
        System.out.println(dog);
    }

    public void animalesCaracteristicas(Cat cat){
        System.out.println(cat);
    }
}
