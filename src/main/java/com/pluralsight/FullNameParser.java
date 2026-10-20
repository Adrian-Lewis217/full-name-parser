package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Full name of user
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();

        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(0, firstSpace);
        String middleName = fullName.substring(firstSpace, lastSpace);
        String lastName = fullName.substring(lastSpace);

        if(middleName.isEmpty()){
            middleName = "(none)";
        }

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);


    }
}
