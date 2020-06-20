package com.xiaozhang.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//            while (!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();
//      =====================================================
//        var status = new DownloadStatus();
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i=0; i<10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread:threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());
//      ================================================
//      synchronized collection
//        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());
//
//        var thread1 = new Thread(()->{
//            collection.addAll(Arrays.asList(1,2,3));
//        });
//        var thread2 = new Thread(()->{
//            collection.addAll(Arrays.asList(4,5,6));
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(collection);
//      ================================================
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"a");
        map.get(1);
        map.remove(1);
    }
}
