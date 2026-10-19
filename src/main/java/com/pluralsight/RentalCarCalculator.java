package com.pluralsight;

import java.util.*;
public class RentalCarCalculator {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        //                                                                                               -- Pickup date
        System.out.print("What day will you pick up your car? MM/DD: ");
        String pickupDate = myScanner.nextLine();

        //                                                                                               -- Days needed

        System.out.print("How many days will you need the rental for? ");
        int daysRental = myScanner.nextInt();

        myScanner.nextLine();

        boolean addedFeature = false;

        //                                                                                                   -- ez pass

        System.out.print("Do you want an electronic toll tag? $3.95/day to use: ");
        String hasTollTag = myScanner.nextLine();

        if (hasTollTag.equalsIgnoreCase("yes")){
            addedFeature = true;
        } else {
            addedFeature = false;
        }

        //                                                                                                      -- gps

        System.out.print("Do you want a GPS? $2.95/day to use: ");
        String hasGPS = myScanner.nextLine();

        if (hasGPS.equalsIgnoreCase("yes")){
            addedFeature = true;
        } else {
            addedFeature = false;
        }

        //                                                                                                  -- roadside

        System.out.print("Do you want roadside assistance? $3.95/day to use: ");
        String hasRoadsideAssistance = myScanner.nextLine();

        if (hasRoadsideAssistance.equalsIgnoreCase("yes")){
            addedFeature = true;
        } else {
            addedFeature = false;
        }

        //                                                                                                     -- age

        System.out.print("What is your age? ");
        int age = myScanner.nextInt();

        myScanner.nextLine();

        //Step3

        double basicCarRental = 29.99;
        double totalCost = 0;
        double underageSurcharge = 0;

        double featuresCost = 0;

        if (age < 25){
            underageSurcharge = basicCarRental * 0.30;
        } else {
            underageSurcharge = 0;
        }
        if (hasTollTag.equalsIgnoreCase("yes")){
            featuresCost = featuresCost + 3.95;
        } else {
            featuresCost = featuresCost + 0;
        }
        if (hasGPS.equalsIgnoreCase("yes")){
            featuresCost = featuresCost + 2.95;
        } else {
            featuresCost = featuresCost + 0;
        }
        if (hasRoadsideAssistance.equalsIgnoreCase("yes")){
            featuresCost = featuresCost + 3.95;
        } else {
            featuresCost = featuresCost + 0;
        }
        totalCost = (basicCarRental + underageSurcharge) + featuresCost;

        System.out.printf("%nThank you for your information. Your total will be $%.2f per day of rental!", totalCost);
        System.out.printf("%nThank you!");


    }
}
