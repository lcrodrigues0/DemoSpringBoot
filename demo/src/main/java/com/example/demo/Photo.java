package com.example.demo;

import jakarta.validation.constraints.NotEmpty;

public class Photo {
    private String fileName;
    private String id;

    private byte[] data;

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

    public byte[] getData(){
        return this.data;
    }

    public void setData(byte[] data){
        this.data = data;
    }
}
