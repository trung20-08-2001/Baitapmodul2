package BTSlack.Day29_5_2023.Sang.Bai4;

public class CheckFibonacci {
    public static boolean checkFibonacci(int[] arr) {
        //Kiểm tra chuỗi số có tạo thành dãy Fibonacci hay không.
        if (arr.length <= 2 || arr[0] != 0 || arr[1] != 1) {
            return false;
        } else {
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] != arr[i - 1] + arr[i - 2])
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] arr1={0, 1, 1, 2, 9, 5, 8, 13, 21, 34};
        System.out.println(checkFibonacci(arr));
        System.out.println(checkFibonacci(arr1));
    }
}
