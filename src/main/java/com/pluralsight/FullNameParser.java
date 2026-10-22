package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* My first code that didn't work for middle name
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
        System.out.println(lastName);*/

        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();

        String firstName = "";
        String middleName = "";
        String lastName = "";

        int firstSpaceIndex = input.indexOf(' ');

        if (firstSpaceIndex == -1) {
            firstName = input;
            lastName = input;
            System.out.println("Name format is wrong");
            return;
        } else {
            firstName = input.substring(0, firstSpaceIndex);

            input = input.substring(firstSpaceIndex).trim();

            int lastSpaceIndex = input.indexOf(' ');

            if (lastSpaceIndex == -1) {
                lastName = input;
            } else {
                middleName = input.substring(0, lastSpaceIndex);
                lastName = input.substring(lastSpaceIndex + 1);
            }
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "(none)" : middleName));
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}