package com.zooexample;

import dagger.Component;

@Component(modules = {ZooModule.class})
public interface MyZoo {
    Zoo zoo();
}
