package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final ChildbearingPredator childbearingPredator;

    public Lion(ChildbearingPredator childbearingPredator, String sex) throws Exception {
        this.childbearingPredator = childbearingPredator;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return childbearingPredator.getKittens();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return childbearingPredator.eatMeat();
    }
}
//ничего не меняла
