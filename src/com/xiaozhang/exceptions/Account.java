package com.xiaozhang.exceptions;

public class Account {
    public void deposit(float value) {
        if (value <= 0)
            throw new IllegalArgumentException(""); // defensive programming
    }
}
