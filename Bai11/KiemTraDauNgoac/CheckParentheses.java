package Bai11.KiemTraDauNgoac;

import MyCollection.MyQueue;

public class CheckParentheses {
    public boolean checkParentheses(String str) {
        boolean check = false;
        int openParentheses = 0;
        int closeParentheses=0;
        MyQueue<Character> queue = new MyQueue<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        while(!queue.isEmpty()){
            if (queue.remove() == '(') {
                check = false;
                openParentheses += 1;
            }
            if(queue.isEmpty()){
                break;
            }
            if (queue.remove() == ')') {
                check = true;
                closeParentheses += 1;
            }
        }
        if (check && openParentheses==closeParentheses)
            return true;
        else{
            return false;
        }
    }
}
