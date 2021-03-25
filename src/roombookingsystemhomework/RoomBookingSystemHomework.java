
package roombookingsystemhomework;

import java.util.Scanner;


public class RoomBookingSystemHomework {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        EmailVerification();
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

}
