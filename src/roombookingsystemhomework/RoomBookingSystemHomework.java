
package roombookingsystemhomework;

import java.util.Scanner;


public class RoomBookingSystemHomework {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to Book A Room  ");
        while (true) {
            System.out.println("What would you like to do next");
            System.out.println("1- Book a room");
            System.out.println("2- View catering schedule");
            System.out.println("3- View cleaner schedule");
            

            System.out.println("0- Exit");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;               
                case 0:
                    
                    System.exit(0);
            }
        EmailVerification();
        RequestResources();
    }
    }
    
    public static void EmailVerification(){
        boolean emailVerified = false;
        while (emailVerified == false) {
            System.out.println("Please enter your email address");
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
