package com.isuniquename;

import com.isuniquename.networks.Github;
import com.isuniquename.networks.Twitter;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        //Collecting input
        final Scanner scanner = new Scanner(System.in);
        String name = null;

        do {
            System.out.println("Enter the name: ");
            name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            final NameChecker nameChecker = new NameChecker(name);
            nameChecker
                    .checkOn(new Twitter(name))
                    .checkOn(new Github(name))
                    .check();

        } while (!name.trim().isEmpty());


    }
}
