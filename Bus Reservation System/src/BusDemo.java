import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        // ArrayList - collections
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        // Add buses
        buses.add(new Bus(1, true, 48));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 48));

        int userOpt = 1;
        Scanner sc = new Scanner(System.in);

        // Display bus info
        for (Bus b : buses) {
            b.displayBusInfo();
        }

        while (userOpt == 1) {
            System.out.println("Enter 1 to Book And 2 to Exit");
            userOpt = sc.nextInt();

            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("✅ Your Booking is Confirmed");
                } else {
                    System.out.println("❌ Sorry. Bus is Full. Try Another Bus Or Date.");
                }
            }
        }
    }
}
