package com.xiaozhang.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
//        System.out.println(Thread.currentThread().getName());
//
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//      ============ Joining a thread ==================
            // block the current threads until the downloading threads has finished.
//          Downloading a file: Thread-0
//          wait 5 sec
//          Download complete.Thread-0
//          File is read to scan.
//          Downloading a file: Thread-1
//          ...
//          ...
//          Hold the thread to wait for the completion of another thread, when a thread is waiting, it cannot do other thibgs

//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("File is read to scan.");
//      ===================================================
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            // does not force the thread to stop, it only sends out an interrupt request
//            thread.interrupt();
//        }
//      ======================================================
//        var status = new DownloadStatus();
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread: threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        var totalBytes = tasks.stream()
//                .map(t->t.getStatus().getTotalBytes())
//                .reduce(Integer::sum);
//
//        System.out.println(totalBytes);
//      =================================================
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
