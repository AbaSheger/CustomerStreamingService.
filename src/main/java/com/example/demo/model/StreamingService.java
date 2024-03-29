package com.example.demo.model;

import org.springframework.stereotype.Component;
@Component
public class StreamingService {

    private int id;
    private String name;
    private String quality;
    private String price;



    public StreamingService() {

    }


  public StreamingService(int id, String name, String quality, String price) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getPrize() {
        return price;
    }

    public void setPrize(String prize) {
        this.price = prize;
    }
}
