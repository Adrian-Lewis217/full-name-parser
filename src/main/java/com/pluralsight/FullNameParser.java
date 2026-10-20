package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Full name of user
        String fullName = "Adrian Christopher Lewis";
        /*System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();*/

        int firstSpace = fullName.indexOf(" ");
        String middleName;
        String lastName;
        String firstName = fullName.substring(0, firstSpace);

        if(middleName.isEmpty()){
            middleName = "(none)";
        } else {
            middleName = fullName.substring();
    }

    }
}
