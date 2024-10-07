package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));


    }


    public static boolean checkForPalindrome(String text){
        // we put space for other things except a-z,A-Z and 0-9
        String cleanedString = text.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();

        /*
        String reverse = new StringBuffer(cleanedString).reverse().toString();
        if(!cleanedString.equals(reverse)){
            return false;
        }
        return true;
        */

        LinkedList<Character> charList = new LinkedList<>();
        for(char c : cleanedString.toCharArray()){
            charList.add(c);
        }
        System.out.println(charList.toString());
        while(charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;

    }

    public static String convertDecimalToBinary(int number){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (number>0){
            int remainder = number % 2;
            binaryList.addFirst(remainder);
            number = number /2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int digit: binaryList){
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }
}

