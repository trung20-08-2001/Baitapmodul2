package Bai17.QuanLiSanPhamLuuVaoFileNhiPhan;

import java.io.Serializable;

public class Product implements Serializable {
    private static int count = 0;
    private int id;
    private String name;
    private double price;
    private String whereProduction;

    public Product() {
        this.id=++count;
    }

    public Product( String name, double price,String whereProduction) {
        this.id = ++count;
        this.name = name;
        this.price = price;
        this.whereProduction=whereProduction;
    }

    public static int getCount() {
        return count;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getWhereProduction() {
        return whereProduction;
    }

    public void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }

    public String toString() {
        return "ID: " + id + ", Tên sản phẩm: " + name + ", Giá: " + price+", Nơi sản xuất: "+whereProduction;
    }
}

