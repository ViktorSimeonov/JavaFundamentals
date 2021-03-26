package _6_ObjectsAndClasses;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class test_ObjectsClasses {
    static class Reservation {
        String holderName;
        String phoneNumber;
        int seats;
    }

    public static void main(String[] args) {
        List<Reservation> reservations = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] nameAndSeats = input.split("\\s+");
            Reservation r = new Reservation();
            r.holderName = nameAndSeats[0];
            r.phoneNumber = nameAndSeats[1];
            r.seats = Integer.parseInt(nameAndSeats[2]);
            reservations.add(r);

            input = scanner.nextLine();
        }
        String guestName = scanner.nextLine();
        int reservationIndex = -1;
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            if (guestName.equals(reservation.holderName)) {
                reservationIndex = i;
            }
        }
        if (reservationIndex != -1) {
            Reservation x = reservations.get(reservationIndex);
            System.out.println(x.seats);
        } else {
            System.out.println("Sorry, no reservation for " + guestName);
        }
    }
}
/*
Joro 0899756388 4
Martin 0898764922 7
Peter 07789453827 3
end
Martin

// output
        7*/
