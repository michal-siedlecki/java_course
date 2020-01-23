package com.siedlecki.listmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String name;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int numSeatsInRow) {
        this.name = name;
        int lastRow = 'A' + (numRows-1);
        for (char row = 'A'; row<=lastRow; row++) {
            for (int i=0; i<=numSeatsInRow; i++){
                Seat seat = new Seat(row + String.format("%02d", i));
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNum){
        Seat requestedSeat = new Seat(seatNum);
        int searchResult = Collections.binarySearch(seats, requestedSeat, null);
        if (searchResult>=0){
            return seats.get(searchResult).reserve();
        }
//        int iterationNum=0;
//        for (Seat seat : seats) {
//            iterationNum++;
//            if(seat.seatNumber.equals(seatNum)){
//                System.out.println("array length: " + this.seats.size());
//                System.out.println("iterations: " + iterationNum);
//                return seat.reserve();
//            }
//        }
        System.out.println("There is no such seat number");
        return false;
    }

    public boolean reserveSeatBinary(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void printSeats(){
        for (Seat seat : seats){
            System.out.println(seat.seatNumber + " is reserved = " + seat.isReserved);
        }
    }



    class Seat implements Comparable<Seat> {
        private String seatNumber;
        public boolean isReserved;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            this.isReserved=false;
        }

        public boolean reserve() {
            if (!this.isReserved) {
                this.isReserved = true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            } else {
                System.out.println("The seat is already reserved");
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }
    }
}
