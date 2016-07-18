package com.example;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class UploadAction extends ActionSupport {

    private File myFile;
    private String myFileContentType;
    private String myFileFileName;
    private String destPath;

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }

    
    @Override
    public String execute() throws IOException {
        destPath = "F:/NetBeansProjects/JavaEE_bookDemo/JavaEE_bookDemo/web/FilesUpLoad2/";

        try {
          //  System.out.println("Src File name: " + myFile);
           //System.out.println("Dst File name: " + myFileFileName);

            File destFile = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

        } catch (IOException e) {
            return ERROR;
        }

        return SUCCESS;

    }

}
