package com.xiaozhang.concurrency;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {

    private boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }

    public synchronized void incrementTotalFile() {
            totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
