package com.zooexample;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = DaggerMyZoo.create().zoo();
        zoo.talk();
    }
}
