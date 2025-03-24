package recervation;
import java.util.Scanner;

import reservation.Bookinginfo;

import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Bookinginfo> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 45));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 45));

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (userOpt == 1) {
            System.out.println("Enter 1 to book, 2 to Exit");
            userOpt = scanner.nextInt();
            
            if (userOpt == 1) {
                Bookinginfo booking = new Bookinginfo(scanner);
                if (booking.isAvailable(buses, bookings)) {
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed");
                } else {
                    System.out.println("Sorry...! Try Another bus or date");
                }
            } else {
                System.out.println("Exiting... Thank you!");
            }
        }

        scanner.close();
    }
}
