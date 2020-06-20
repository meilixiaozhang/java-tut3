package com.xiaozhang.concurrency;

public class DownloadStatus {
    public int getTotalBytes() {
        return totalBytes;
    }

    private int totalBytes;

    public void incrementTotalBytes() {
        totalBytes++;
    }
}
