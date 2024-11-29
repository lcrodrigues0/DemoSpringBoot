package com.example.demo;

public class Photo {
    private String fileName;
    private String id;

    public Photo() {
    }

    public Photo(String fileName, String id) {
        this.id = id;
        this.fileName = fileName;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }
}
