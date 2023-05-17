package Bai10.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList=new MyList<Integer>();
        System.out.println("Size "+integerMyList.getSize());
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(5);
        integerMyList.add(6);
        System.out.println("Size "+integerMyList.getSize());
        System.out.println("element 4: "+integerMyList.get(4));
        System.out.println("element 6: "+integerMyList.get(6));
        System.out.println("element 2: "+integerMyList.get(2));
        System.out.println("element 3: "+integerMyList.get(3));
        //System.out.println("element -1: "+integerMyList.get(-1));



    }
}
