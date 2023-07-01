package com.baeldung;

import com.baeldung.Greeter;
import org.apache.commons.lang3.StringUtils;


public class BazelApp
{
    public static void main(String[] args) {
        System.out.println("Test");
        Greeter.greet();
        System.out.println(StringUtils.abbreviate("AAASADSADSADSAVVV",5));
    }
}

