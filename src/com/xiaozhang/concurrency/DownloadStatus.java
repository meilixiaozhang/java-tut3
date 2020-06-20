package com.xiaozhang.concurrency;

import java.util.Objects;

public class DownloadStatus {


    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public synchronized void incrementTotalFile() {
            totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
