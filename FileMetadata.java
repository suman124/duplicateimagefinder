package com.suman.model;

import java.util.Date;

public class FileMetadata {

    private int width;
    private int height;
    private Date creationDate;
    private String creationDateStr;
    private String dateTimeDigitized;
    private String dateTimeOriginal;
    private long fileSize;
    private String fileName;
    private String filePath;
    private String error;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDateStr() {
        return creationDateStr;
    }

    public void setCreationDateStr(String creationDateStr) {
        this.creationDateStr = creationDateStr;
    }

    public String getDateTimeDigitized() {
        return dateTimeDigitized;
    }

    public void setDateTimeDigitized(String dateTimeDigitized) {
        this.dateTimeDigitized = dateTimeDigitized;
    }

    public String getDateTimeOriginal() {
        return dateTimeOriginal;
    }

    public void setDateTimeOriginal(String dateTimeOriginal) {
        this.dateTimeOriginal = dateTimeOriginal;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "FileMetadata{" +
                "width=" + width +
                ", height=" + height +
                ", creationDate=" + creationDate +
                ", creationDateStr='" + creationDateStr + '\'' +
                ", dateTimeDigitized='" + dateTimeDigitized + '\'' +
                ", dateTimeOriginal='" + dateTimeOriginal + '\'' +
                ", fileSize=" + fileSize +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
