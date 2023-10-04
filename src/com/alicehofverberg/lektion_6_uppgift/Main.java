package com.alicehofverberg.lektion_6_uppgift;

public class Main {
    public static void main(String[] args) {

        try {

            System.out.println(number(2));
        }catch (Exception exception){
            System.out.println("Something went wrong");
        }

    }

    public static int number(int x ){

        return x/0;

    }

}
