package com.db.learn.SpringLearnUdemy.domain;


//https://www.udemy.com/course/spring-framework-web-development-2020/learn/lecture/16739766?start=15#announcements

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(){
        id=0;
        name="";
        price=0;
    }
    public Product(int id, String name, double price) throws Exception {
        this.id=id;
        this.name=name;
        set_price(price);
    }

    public int get_id(){
        return id;
    }
    public void set_name(String name){
        if(name != ""){
            this.name=name;
        }
    }
    public String get_name(){
        return name;
    }
    public double get_price(){
        return price;
    }
    public void set_price(double price) throws Exception {
        if(price > 0) {
            this.price = price;
        } else throw new Exception(" ERROR message :Price must have positive values!");
    }
}
