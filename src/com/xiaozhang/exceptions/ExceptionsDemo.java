package com.xiaozhang.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
//        sayHello(null);  // Exception in thread "main" java.lang.NullPointerException -> unchecked exception
//      ===============================================
//        try {
//            var reader = new FileReader("file.txt"); // Unhandled exception: java.io.FileNotFoundException -> checked exception
//            System.out.println("File Opened");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());  // file.txt (No such file or directory)
//        }
//      ------------------------------------------------
        // 自动生成的try/catch
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse(""); // parse exception
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException | ParseException e) {  // FileNotFoundException < IOException 可以只写这个IOException
            System.out.println("Could not read data");
        } // catch (ParseException e) {
//            e.printStackTrace();
//        }
//      --------------------------------------------------
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
