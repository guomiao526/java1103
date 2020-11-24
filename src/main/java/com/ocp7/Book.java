package com.ocp7;

public class Book {

    public static String publishName = "gotop"; // static(類別屬性), 放入公用變數, 較節省記憶體
    private String name;
    private int price;

    public Book() {
        System.out.println("執行Book 建構子1");
    }

    public Book(String name, int price) {
        System.out.println("執行Book建構子2");
        this.name = name;
        this.price = price;
    }
// 建立一個物件類別-> 1.建立屬性(物件屬性). 2.建立方法(getter/setter + toString())

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }     

    @Override
    public String toString() {
        return "Book{" + "publishName=" + publishName + ", name=" + name + ", price=" + price + '}';
    }

}
