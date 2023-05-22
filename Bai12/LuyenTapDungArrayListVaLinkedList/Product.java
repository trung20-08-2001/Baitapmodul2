package Bai12.LuyenTapDungArrayListVaLinkedList;

public class Product {
    private static int count = 0;
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product( String name, int price) {
        this.id = ++count;
        this.name = name;
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ". Tên sản phẩm: " + name + ". Giá: " + price;
    }
}
