package com.zooexample;

import javax.inject.Inject;


public class Elephant implements Animal {
    
    @Inject
    Elephant (){}

    @Override
    public void talk() {
        System.out.println("WOOOOOOOO");
    }
    
}
