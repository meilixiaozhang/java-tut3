package com.xiaozhang.concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
            // block the current threads until the downloading threads has finished.
//          Downloading a file: Thread-0
//          wait 5 sec
//          Download complete.Thread-0
//          File is read to scan.
//          Downloading a file: Thread-1
//          ........
//          Hold the thread to wait for the completion of another thread, when a thread is waiting, it cannot do other thibgs

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File is read to scan.");
        }
    }
}
