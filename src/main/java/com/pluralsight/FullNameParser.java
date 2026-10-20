package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Full name of user
        String fullName = "Adrian Christopher Lewis";
        /*System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();*/

        String firstName = fullName.indexOf(" ");
        String middleName;
        String lastName;
        String firstSpace = fullName.indexOf(" ");

        if(middleName.isEmpty()){
            middleName = "(none)";
        } else {
            middleName = fullName.substring();
    }

    }
}
