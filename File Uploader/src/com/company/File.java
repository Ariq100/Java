package com.company;
import java.time.LocalDate;

public class File {
    private static String id;
    private String fileName;
    private float fileSize;
    private String fileType;
    private LocalDate fileCreated;

    public File(String fileName, float fileSize, String fileType)
    {
        if(FileTypeChecker(fileType) && FileSizeChecker(fileSize))
        {
            this.id = idCreator(fileType);
            this.fileCreated = date();
            this.fileName = fileName;
            this.fileSize = fileSize;
            this.fileType = fileType;
        }
        else
        {
            System.out.println("Error!!");
            System.out.println("The file type should be in jpg or png or doc or txt format and the filesize should be above\nbelow 5mb and above 0 mb.");
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public float getFileSize() {
        return fileSize;
    }

    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        File.id = id;
    }

    public boolean FileTypeChecker(String fileType)
    {
        try
        {
            if (fileType == "png" || fileType == "doc" || fileType == "txt" || fileType == "jpg")
            {
                return true;
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public String idCreator(String fileType)
    {
        String id = getId();

        if (fileType == "png")
        {
            return "png_" + id;
        }
        else if (fileType == "doc")
        {
            return "doc_" + id;
        }
        else if (fileType == "txt")
        {
            return "txt_" + id;
        }
        else if (fileType == "jpg")
        {
            return "jpg_" + id;
        }

        return id;
    }

    public LocalDate date()
    {
        LocalDate date = LocalDate.now();
        return date;
    }

    public boolean FileSizeChecker(float fileSize)
    {
        try
        {
            if (fileSize > 0 && fileSize <= 5)
            {
                return true;
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
