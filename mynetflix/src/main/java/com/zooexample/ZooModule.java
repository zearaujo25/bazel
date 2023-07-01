package com.zooexample;

import dagger.Provides;
import dagger.Module;

@Module
public interface ZooModule {
    @Provides
    public static Animal provideAnimal(Elephant elephant){
        return elephant;
    }
}
