package com.sil.java.junit;

public class Sample {

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public String method1(){
        return "Hi, How are you?";
    }

    public int sum (int a, int b){
        return a+b;
    }

    public boolean isValid(int a){
        if(a%2==0){
            return true;
        }

        return false;
    }
}
