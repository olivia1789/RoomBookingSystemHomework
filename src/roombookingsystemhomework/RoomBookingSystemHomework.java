
package roombookingsystemhomework;

import java.util.ArrayList;
import java.util.Scanner;


public class RoomBookingSystemHomework {

    public static Scanner input = new Scanner(System.in);
    private static ArrayList<BookingObjects> bookingSchedule = new ArrayList<>();
    private static ArrayList<BookingObjects> refreshmentSchedule = new ArrayList<>();
    public static void main(String[] args) {
        
        System.out.println("Welcome to Book A Room there are 5 different rooms to choose from ");
        while (true) {
            System.out.println("What would you like to do next");
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
                    Details();
                    break;
                case 2:
                    BookRoom();
                    break;
                case 3:
                    
                    break;
                case 4:
                    viewBookingSchedule();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    
                    System.exit(0);
            }
//        EmailVerification();
//        RequestResources();
    }
    }
    public static void Details(){
        System.out.println("We have 5 different rooms "
                + "\nRoom 1 which accommodates 2 people"
                + "\nRoom 2 which accommodates 4 people"
                + "\nRoom 3 which accommodates 8 people"
                + "\nRoom 4 which accommodates 15 people and has wheelchair access"
                + "\nRoom 5 which accommodates 50 people ");
        System.out.println("We offer a wide range of refreshment options"
                + "\nDRINKS: Water, Tea, Coffee and Hot Chocalate"
                + "\nFOOD: Pastry Selection, Sandwidch Selection, Cheese Board, Fruit Board and Chocolate Board ");
    }
    public static void BookRoom(){
        System.out.println("Please enter what room you would like to book e.g room 2");
        input.nextLine();
        String room = input.nextLine();
        System.out.println("Please enter the date you want to book the room for e.g 5/6/2020");
        //input.nextLine();
        String date = input.nextLine();
        System.out.println("Please enter what time slots you would like to book e.g if you were wanting 5 to 8 pm enter 5pm 6pm 7pm");
        //input.nextLine();
        String time = input.nextLine();
        
        EmailVerification();
                
        BookingObjects userBooking = new BookingObjects(room,date,time);
        bookingSchedule.add(userBooking);
        
        System.out.println(userBooking.toString());
    
    }
    public static void viewBookingSchedule(){
        //print the room bookings 
        
        if(bookingSchedule.isEmpty()){
            System.out.println("There are currently no rooms booked");
        }
        else{
            for (int i = 0; i < bookingSchedule.size(); i++) {
                System.out.println(bookingSchedule.get(i).toString());
                
            }
        }
    }
    public static void EmailVerification(){
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
        if (emailVerified == true){
            System.out.println("Booking succesful ");
        }

    }
    public static void RequestResources(){
        System.out.println("Would you like any extra recourses? E.g. a projector, pens, whiteboard, or some paper");
        String choice = input.nextLine();
        if (choice.equals("yes")) {
            System.out.println("What resources would you like?");
            String requestedResources = input.nextLine();
            System.out.println(requestedResources + " will be put in to your selected room");
        }

    }

}
