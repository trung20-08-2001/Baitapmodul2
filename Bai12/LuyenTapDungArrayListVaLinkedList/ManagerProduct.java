package Bai12.LuyenTapDungArrayListVaLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerProduct {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Product> productLinkedList = new LinkedList<>();


    public Product createProduct() {
        System.out.println("Nhâp tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(name, price);
    }

    public void add() {
        Product product = createProduct();
        productLinkedList.add(product);
        System.out.println(productLinkedList.size());
    }

    public int checkId(int id) {
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public void editProduct() {
        while (true) {
            System.out.println("Nhập Id của sản phẩm muốn sửa:");
            int id = Integer.parseInt(scanner.nextLine());
            int index = checkId(id);
            if (index >= 0) {
                System.out.println("Nhập tên muốn sửa:");
                String name = scanner.nextLine();
                System.out.println("Nhập giá muốn sửa:");
                int price = Integer.parseInt(scanner.nextLine());
                productLinkedList.get(index).setName(name);
                productLinkedList.get(index).setPrice(price);
                System.out.println("Hoàn thành sủa.");
                break;
            } else {
                System.out.println("Id không chính xác.");
            }
        }
    }

    public void delete() {
        while (true) {
            System.out.println("Nhập Id của sản phẩm muốn sửa:");
            int id = Integer.parseInt(scanner.nextLine());
            int index = checkId(id);
            if (index >= 0) {
                productLinkedList.remove(index);
                System.out.println("Hoàn thành xóa.");
                break;
            } else {
                System.out.println("Id không chính xác.");
            }
        }
    }

    public void findProductByName() {
        System.out.println("Nhập tên muốn tìm.");
        String name = scanner.nextLine();
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getName() == name) {
                System.out.println("Thông tin sản phẩm:");
                System.out.println(productLinkedList.get(i));
                break;
            }
        }
    }

    public void sortPriceIncrease(){
        Collections.sort(productLinkedList,new ComparePriceIncrease());
    }

    public void sortPriceReduce(){
        Collections.sort(productLinkedList,new ComparePriceReduce());
    }

    public void display(){
        for (Product product:productLinkedList){
            System.out.println(product);
        }
    }
}
