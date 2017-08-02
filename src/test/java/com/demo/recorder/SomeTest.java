package com.demo.recorder;

import org.junit.Test;

import java.util.Properties;

public class SomeTest {

    @Test
    public void test(){
        Properties properties = System.getProperties();

        System.out.println(properties.getProperty("os.name"));
        System.out.println(properties.getProperty("os.version"));
    }

}
