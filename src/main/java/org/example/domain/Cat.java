package org.example.domain;

import org.example.validation.CountPaws;

@CountPaws(message = "invalid cat")
public class Cat {
    private final int countPaws;

    public Cat(int countPaws) {
        this.countPaws = countPaws;
    }

    public int getCountPaws() {
        return countPaws;
    }
}
