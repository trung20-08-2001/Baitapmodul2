package Bai11.KiemTraDoiXung;

import MyCollection.MyQueue;

import java.util.Stack;

public class CheckPalindrome {
    public boolean checkPalindrome(String str) {
        Stack<Character> newStack = new Stack<>();
        MyQueue<Character> queue = new MyQueue<>();
        for (int i = 0; i < str.length(); i++) {
            newStack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        for (int i = 0; i < queue.size(); i++) {
            if (newStack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }
}
