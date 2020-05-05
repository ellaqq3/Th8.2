package com.example.th82;

public class Bottle {

    private String name;
    private float size;
    private float price;


    public Bottle(String a, float b, float c){
        name = a;
        size = b;
        price = c;
    }

    public String getName(){
        return name;
    }

    public float getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }
}
