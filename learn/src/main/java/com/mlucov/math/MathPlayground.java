package com.mlucov.math;

import java.nio.file.FileAlreadyExistsException;
import java.util.Random;

public class MathPlayground {

    public static void main(String[] args) {
        double random = Math.random();

        double res = Math.ceil(random * 100);
//        System.out.println(res.intValue());

        Random r = new Random();

        r.setSeed(System.currentTimeMillis());


    }


    private void testRandom() {
        RandomClass randomClass = new RandomClass();

        try {
            randomClass.checkThrow();
        } catch (FileAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
