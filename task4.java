import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] rooms = {"101", "102", "103", "104", "105"};
        boolean[] booked = new boolean[5];

        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booked Rooms");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");
                    boolean available = false;
                    for (int i = 0; i < rooms.length; i++) {
                        if (!booked[i]) {
                            System.out.println("Room " + rooms[i]);
                            available = true;
                        }
                    }
                    if (!available) {
                        System.out.println("No rooms available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Room Number to Book: ");
                    String roomBook = sc.next();

                    boolean foundBook = false;
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].equals(roomBook)) {
                            foundBook = true;
                            if (!booked[i]) {
                                booked[i] = true;
                                System.out.println("Room " + roomBook + " booked successfully!");
                            } else {
                                System.out.println("Room already booked.");
                            }
                        }
                    }

                    if (!foundBook) {
                        System.out.println("Invalid room number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Room Number to Cancel: ");
                    String roomCancel = sc.next();

                    boolean foundCancel = false;
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].equals(roomCancel)) {
                            foundCancel = true;
                            if (booked[i]) {
                                booked[i] = false;
                                System.out.println("Booking cancelled successfully!");
                            } else {
                                System.out.println("Room is not booked.");
                            }
                        }
                    }

                    if (!foundCancel) {
                        System.out.println("Invalid room number.");
                    }
                    break;

                case 4:
                    System.out.println("\nBooked Rooms:");
                    boolean anyBooked = false;
                    for (int i = 0; i < rooms.length; i++) {
                        if (booked[i]) {
                            System.out.println("Room " + rooms[i]);
                            anyBooked = true;
                        }
                    }
                    if (!anyBooked) {
                        System.out.println("No rooms are booked.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Hotel Reservation System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}