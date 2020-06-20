package com.xiaozhang;

import com.xiaozhang.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
