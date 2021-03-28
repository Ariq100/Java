package com.company;
import java.time.LocalDateTime;

public class FileMaker {
    private static int id;
    private String fileName;
    private String fileType;
    private LocalDateTime fileCreated;
    private String fileId;

    public FileMaker(String fileName, String fileType) {
        if (fileTypeChecker(fileType))
        {
            this.id += ++this.id;
            setFileName(fileName);
            setFileType(fileType);
            setFileCreated(LocalDateTime.now());
            setFileId(idCreator(fileType));
        }
        else
        {
            System.out.println("Please Enter the file type correctly.");
        }
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public LocalDateTime getFileCreated() {
        return fileCreated;
    }

    public void setFileCreated(LocalDateTime fileCreated) {
        this.fileCreated = fileCreated;
    }

    private String idCreator(String filetype)
    {
        return fileType + "_" + this.id;
    }

    private Boolean fileTypeChecker(String fileType)
    {
        if(fileType == "txt" || fileType == "doc" || fileType == "py")
        {
            return true;
        }

        return false;
    }

    public void showInfo()
    {
        System.out.println("______________File Created______________");
        System.out.println(getFileName());
        System.out.println(getFileType());
        System.out.println(getFileCreated() + "\n");
    }
}