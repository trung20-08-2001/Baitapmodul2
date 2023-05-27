package Bai17.QuanLiSanPhamLuuVaoFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();


    public String getName() {
        String name = "";
        boolean checkName;
        do {
            checkName = true;
            try {
                System.out.println("Nhập tên sản phẩm:");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    checkName = false;
                    System.out.println("Không được để trống.");
                }
            } catch (Exception e) {
                checkName = false;
                e.printStackTrace();
            }
        } while (!checkName);
        return name;
    }


    public double getPrice() {
        double price = 0;
        boolean checkPrice;
        do {
            checkPrice = true;
            try {
                System.out.println("Nhập giá:");
                price = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                checkPrice = false;
                System.out.println("Số không hợp lệ");
            }
        } while (!checkPrice);
        return price;
    }

    public String getWhereProduction() {
        String whereProduction = "";
        boolean checkWhereProduction;
        do {
            checkWhereProduction = true;
            try {
                System.out.println("Nhập nơi sản xuất:");
                whereProduction = scanner.nextLine();
                if (whereProduction.isEmpty()) {
                    checkWhereProduction = false;
                    System.out.println("Không được để trống.");
                }
            } catch (Exception e) {
                checkWhereProduction = false;
                e.printStackTrace();
            }
        } while (!checkWhereProduction);
        return whereProduction;
    }


    public void add() {
        Product newProduct = new Product(getName(), getPrice(), getWhereProduction());
        productList.add(newProduct);
    }

    public void writeDataToFile() {

        try (FileOutputStream fos=new FileOutputStream("C:\\Users\\trung\\IdeaProjects\\Md2\\Baitap\\src\\Bai17\\QuanLiSanPhamLuuVaoFileNhiPhan\\dataProduct.txt",true);
             ObjectOutputStream oos=new ObjectOutputStream(fos)) {
            if (!productList.isEmpty()) {
                    oos.writeObject(productList);
            } else {
                oos.writeObject("Không có sản phẩm nào.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int checkId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void findById() {
        int id = 0;
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Nhập mã sản phẩm cần tìm.");
                id = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                check = false;
                System.out.println("Nhập sai rồi.");
            }
        } while (!check);
        int index = checkId(id);
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\trung\\IdeaProjects\\Md2\\Baitap\\src\\Bai17\\QuanLiSanPhamLuuVaoFileNhiPhan\\dataProduct.txt", true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            if (index != -1) {
                oos.writeObject("Đây là sản phẩm bạn cần tìm:");
                oos.writeObject(productList.get(index));
            } else {
                oos.writeObject("Mã sản phẩm không hợp lệ.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
