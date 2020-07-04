package com.iamvickyav;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the operation of your choice");
        System.out.print("1. Addition \n2. Multiplication \n3. Secure CreditCard Number \n4. IFSC Code to Branch Name");
        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = Integer.parseInt(br.readLine());
        String cardNumber = "";
        String ifscCode = "";
        int[] array = null;

        if(choice ==1 || choice == 2) {
            System.out.println("Enter how many numbers you want");
            int n = Integer.parseInt(br.readLine());

             array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(br.readLine());
            }
        } else if (choice == 3){
            System.out.println("Enter Card Number");
            cardNumber = br.readLine();
        } else if (choice == 4) {
            System.out.println("Enter IFSC Code");
            ifscCode = br.readLine();
        }

        Calculator c = new Calculator();
        CardMask cm = new CardMask();
        IFSCCodeFinder finder = new IFSCCodeFinder();
        switch (choice) {
            case 1 :
                int result = c.add(array);
                System.out.println("Your answer is " + result);
                break;
            case 2 :
                int result2 = c.multiply(array);
                System.out.println("Your answer is" + result2);
                break;
            case 3 :
                String maskedCardNumber = cm.mask2(cardNumber);
                System.out.println(maskedCardNumber);
                break;
            case 4 :
                String result4 = finder.findDetails(ifscCode);
                System.out.println(result4);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
