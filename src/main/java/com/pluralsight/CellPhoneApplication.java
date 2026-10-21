package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone deviceOne;
        deviceOne = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        deviceOne.setSerialNumber(serialNumber);
        scanner.nextLine(); // scanner buffer

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        deviceOne.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        deviceOne.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        deviceOne.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        deviceOne.setOwner(owner);
    }
}
