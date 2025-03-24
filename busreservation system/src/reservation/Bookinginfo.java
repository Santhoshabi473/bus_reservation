package reservation;

import java.util.*;

import recervation.Bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bookinginfo {
    String Passengername;
    Date date;
    int busNo;

    public Bookinginfo(Scanner scanner) {
        System.out.println("Enter Passenger Name: ");
        Passengername = scanner.next();
        System.out.println("Enter Bus No: ");
        busNo = scanner.nextInt();
        System.out.println("Enter Date (dd-MM-yyyy): ");
        String dateInput = scanner.next();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateformat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Bookinginfo> bookings) {
        int capacity = 0;
        
        for (Bus bus : buses) {
            if (bus.getbusNo() == busNo) {
                capacity = bus.getCapacity();
                break; // Exit loop once the bus is found
            }
        }
        
        int bookedCount = 0;
        for (Bookinginfo b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                bookedCount++;
            }
        }
        
        return bookedCount < capacity;
    }
}
