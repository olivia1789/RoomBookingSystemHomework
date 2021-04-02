
package roombookingsystemhomework;

import java.io.*;
import java.util.*;

public class RoomBookingSystemHomework {

    public static Scanner input = new Scanner(System.in);
    private static String dirtyRoom;
    public static ArrayList<String> bookingSchedule = new ArrayList<>();
    public static ArrayList<String> refreshmentSchedule = new ArrayList<>();
    public static ArrayList<String> CleaningSchedule = new ArrayList<>();
    public static String bookedRoomsDirectory;
    public static String RefreshmentScheduleDirectory;
    public static String CleanersScheduleDirectory;

    public static void main(String[] args) {

        System.out.println("Welcome to Book A Room there are 5 different rooms to choose from ");
        while (true) {
            System.out.println("\n\nWhat would you like to do next");
            System.out.println("1- View details about rooms and refreshments ");
            System.out.println("2- Book a room");
            System.out.println("3- Book refreshments");
            System.out.println("4- View current bookings");
            System.out.println("5- View catering schedule");
            System.out.println("6- View cleaner schedule");

            System.out.println("0- Exit");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    RoomDetails();
                    RefreshmentDetails();
                    break;
                case 2:
                    BookRoom();
                    break;
                case 3:
                    BookRefreshments();
                    break;
                case 4:
                    viewBookingSchedule();
                    break;
                case 5:
                    viewRefreshmentSchedule();
                    break;
                case 6:
                    viewCleanersSchedule();
                    break;
                case 0:

                    System.exit(0);
            }
        }
    }

    public static void RoomDetails() {
        System.out.println("\n\nWe have 5 different rooms "
                + "\nRoom 1 which accommodates 2 people"
                + "\nRoom 2 which accommodates 4 people"
                + "\nRoom 3 which accommodates 8 people"
                + "\nRoom 4 which accommodates 15 people and has wheelchair access"
                + "\nRoom 5 which accommodates 50 people ");
    }

    public static void RefreshmentDetails() {
        System.out.println("\nWe offer a wide range of refreshment options"
                + "\nDRINKS: Water, Tea, Coffee and Hot Chocalate"
                + "\nFOOD: Pastry Selection, Sandwidch Selection, Cheese Board, Fruit Board and Chocolate Board ");
    }

    public static void BookRoom() {
        System.out.println("\nPlease enter what room you would like to book e.g room 2");
        input.nextLine();
        String room = input.nextLine();
        dirtyRoom = room;
        System.out.println("Please enter the date you want to book the room for e.g 05/06/2020");
        String date = input.nextLine();
        System.out.println("Please enter what time slots you would like to book e.g if you were wanting 5 to 8 pm enter 5pm 6pm 7pm");
        String time = input.nextLine();
        cleaners();

        RequestResources();
        EmailVerification();

        BookingObjects userBooking = new BookingObjects(room, date, time);
        getDir();
        try {
            FileWriter writeToFile = new FileWriter(bookedRoomsDirectory, true); // true makes name add on to text file not replace it
            PrintWriter printToFile = new PrintWriter(writeToFile);
            printToFile.println(userBooking);
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

        System.out.println(userBooking.toString());

    }

    public static void viewBookingSchedule() {
        //print the room bookings 

        readRoomsFile();
        for (int i = 0; i < bookingSchedule.size(); i++) {
            System.out.println(bookingSchedule.get(i));

        }
    }

    public static void EmailVerification() {
        boolean emailVerified = false;
        while (emailVerified == false) {
            System.out.println("Please enter your email address to confirm booking");
            String userEmail = input.nextLine();
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"; //^ matches the starting of the sentence.[a-zA-Z0-9+_.-] matches one character from the English alphabet (both cases), digits, “+”, “_”, “.” and, “-” before the @ symbol.  + indicates the repetition of the above-mentioned set of characters one or more times.@ matches itself.[a-zA-Z0-9.-] matches one character from the English alphabet (both cases), digits, “.” and “–” after the @ symbol.$ indicates the end of the sentence.
            emailVerified = userEmail.matches(regex);
            if (emailVerified) {
                System.out.println("Given email address is valid");
            } else {
                System.out.println("Given email address is not valid \nTry again");
            }
        }
        if (emailVerified == true) {
            System.out.println("Booking succesful ");
        }

    }

    public static void RequestResources() {
        System.out.println("Would you like any extra recourses? E.g. a projector, pens, whiteboard, or some paper");
        String choice = input.nextLine();
        if (choice.equals("yes")) {
            System.out.println("What resources would you like?");
            String requestedResources = input.nextLine();
            System.out.println(requestedResources + " will be put in to your selected room");
        }

    }

    public static void BookRefreshments() {
        System.out.println("Would you like a reminder of our refreshment options?");
        input.nextLine();
        String reminder = input.nextLine();
        if (reminder.equals("yes")) {
            RefreshmentDetails();
        }
        System.out.println("What refreshments would you like?");
        String refreshments = input.nextLine();
        System.out.println("What is the date which you want the refreshments to arrive e.g 04/06/2021");
        String refreshmentDate = input.nextLine();
        System.out.println("What time would you like the refreshments to arrive? e,g 7:30 ");
        String refreshmentTimings = input.nextLine();
        System.out.println("What room would you like the refreshments to go to? e.g room 4");
        String refreshmentRoom = input.nextLine();

        EmailVerification();

        refreshmentObjects refreshmentOrder = new refreshmentObjects(refreshments, refreshmentTimings, refreshmentRoom, refreshmentDate);
        getDirRefreshments();
        try {
            FileWriter writeToFile = new FileWriter(RefreshmentScheduleDirectory, true); // true makes name add on to text file not replace it
            PrintWriter printToFile = new PrintWriter(writeToFile);
            printToFile.println(refreshmentOrder);
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
        System.out.println(refreshmentOrder.toString());

    }

    public static void viewRefreshmentSchedule() {
        //print the room bookings         

        readRefreshmentFile();
        for (int i = 0; i < refreshmentSchedule.size(); i++) {
            System.out.println(refreshmentSchedule.get(i));

        }
    }

    public static void noDoubleBookings() {
//        //room date time
//        for (int i = 0; i < bookingSchedule.size(); i++) {
//                //System.out.println(bookingSchedule.get(i).toString());
//                if (bookingSchedule.contains(room)){
//                    if(bookingSchedule.contains(date)){
//                        if (bookingSchedule.contains(time)){
//                            System.out.println("Sorry that room is already booked at that time");
//                        }
//                    }
//                }
//        }
    }

    public static void cleaners() {
        System.out.println("What time shall you leave the room? e.g 8pm");
        String timeRoomClear = input.nextLine();

        CleanersObjects cleanersTimes = new CleanersObjects(timeRoomClear, dirtyRoom);

        getDirCleaners();
        try {
            FileWriter writeToFile = new FileWriter(CleanersScheduleDirectory, true); // true makes name add on to text file not replace it
            PrintWriter printToFile = new PrintWriter(writeToFile);
            printToFile.println(cleanersTimes);
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

    }

    public static void viewCleanersSchedule() {
        if (CleaningSchedule.isEmpty()) {
            System.out.println("\nThere are currently no rooms that need cleaning");
        } else {
            readCleanersFile();
            for (int i = 0; i < CleaningSchedule.size(); i++) {
                System.out.println(CleaningSchedule.get(i));

            }
        }
    }

    public static void getDir() {
        bookedRoomsDirectory = System.getProperty("user.dir") + "\\BookingSchedule.txt"; //BookingSchedule is name of text file
    }

    public static void getDirRefreshments() {
        RefreshmentScheduleDirectory = System.getProperty("user.dir") + "\\RefreshmentSchedule.txt";
    }

    public static void getDirCleaners() {
        CleanersScheduleDirectory = System.getProperty("user.dir") + "\\CleanersSchedule.txt";
    }

    public static void readRoomsFile() {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(bookedRoomsDirectory));
            while ((inputLine = read.readLine()) != null) {
                bookingSchedule.add(inputLine);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void readRefreshmentFile() {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(RefreshmentScheduleDirectory));
            while ((inputLine = read.readLine()) != null) {
                refreshmentSchedule.add(inputLine);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void readCleanersFile() {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(CleanersScheduleDirectory));
            while ((inputLine = read.readLine()) != null) {
                refreshmentSchedule.add(inputLine);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
