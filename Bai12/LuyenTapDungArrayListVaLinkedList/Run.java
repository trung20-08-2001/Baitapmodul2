package Bai12.LuyenTapDungArrayListVaLinkedList;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ManagerProduct managerProduct=new ManagerProduct();
        while (true){
            System.out.println("-----------QUẢN LÍ SẢN PHẨM--------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp giá giảm dần");
            System.out.println("7. Sắp xếp giá tăng dần");
            System.out.println("8. Thoát");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    managerProduct.add();
                    break;
                case 2:
                    managerProduct.editProduct();
                    break;
                case 3:
                    managerProduct.delete();
                    break;
                case 4:
                    managerProduct.display();
                    break;
                case 5:
                    managerProduct.findProductByName();
                    break;
                case 6:
                    managerProduct.sortPriceReduce();
                    break;
                case 7:
                    managerProduct.sortPriceIncrease();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
