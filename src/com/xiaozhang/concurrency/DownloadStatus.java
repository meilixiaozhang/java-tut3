package com.xiaozhang.concurrency;

import java.util.Objects;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public synchronized void incrementTotalBytes() {
            totalBytes++;
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
