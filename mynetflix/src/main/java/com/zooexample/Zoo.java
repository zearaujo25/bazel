package com.zooexample;
import javax.inject.Inject;

public class Zoo {
    private Animal animal;

    @Inject
    public Zoo(Animal animal){
      this.animal = animal;  
    }

    public void talk(){
        animal.talk();
    }
}
