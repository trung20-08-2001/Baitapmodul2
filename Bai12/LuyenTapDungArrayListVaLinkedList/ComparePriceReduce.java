package Bai12.LuyenTapDungArrayListVaLinkedList;

import java.util.Comparator;

public class ComparePriceReduce implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
