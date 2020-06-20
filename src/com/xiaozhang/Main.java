package com.xiaozhang;

import com.xiaozhang.concurrency.ThreadDemo;
import com.xiaozhang.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//      =============Exception================
//        try {
//            ExceptionsDemo.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//      ======================================

//      ===========Concurrency & Multi-threading ===========
        ThreadDemo.show();

    }
}
