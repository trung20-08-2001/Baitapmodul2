package Bai10.TrienKhaiCacPhuongThucCuaArrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> test=new MyList<>();
        test.add(4);
        test.add(6);
        test.add(3);
        test.add(9);
        test.add(5);
        test.add(8);
        test.add(2);
        test.add(1);
        test.add(7);
        test.add(1,10);
        test.add(3,11);
        test.remove(3);
        test.remove(1);
        test.print();
        System.out.println();
        System.out.println("Vị trí của 5 là "+test.indexOf(5));
        System.out.println("Vị trí của 9 là "+test.indexOf(9));
        System.out.println("Vị trí của 12 là "+test.indexOf(12));
        System.out.println("Vị trí 2 = "+test.get(2));
        System.out.println("Vị trí 4 = "+test.get(4));
        System.out.println("Vị trí 7 = "+test.get(7));
        System.out.println("Vị trí 8 = "+test.get(8));
        System.out.println("Trong mảng có số 9: "+test.contains(9));
        System.out.println("Trong mảng có số 2: "+test.contains(2));
        System.out.println("Trong mảng có số 45: "+test.contains(45));
        System.out.println("Trong mảng có số 1: "+test.contains(1));
        test.clear();
        System.out.println(test.getSize());
        test.print();
    }
}
