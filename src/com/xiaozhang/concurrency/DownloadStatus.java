package com.xiaozhang.concurrency;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {

    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public synchronized void incrementTotalFiles() {
            totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
