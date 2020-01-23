package com.siedlecki;

import java.util.*;

public class Theatre {
    private final String name;
    private final double basePrice;
    public List<Seat> seats = new ArrayList<>();

    public static  Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.price>seat2.price) {
                return -1;
            } else if (seat1.getPrice()<seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public Theatre(String name, int numRows, int numSeatsInRow, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        int lastRow = 'A' + (numRows-1);
        for (char row = 'A'; row<=lastRow; row++) {
            for (int seatNum=0; seatNum<=numSeatsInRow; seatNum++){
                double price = basePrice;

                if ((row > (char) numRows/5) && ((seatNum<numSeatsInRow/5)||(seatNum>numSeatsInRow-(numSeatsInRow/5)))) {
                    price = basePrice*0.7;
                }
                price = Math.round(price);
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNum){
        Seat requestedSeat = new Seat(seatNum ,0);
        int searchResult = Collections.binarySearch(seats, requestedSeat, null);
        if (searchResult>=0){
            return seats.get(searchResult).reserve();
        }

        System.out.println("There is no such seat number");
        return false;
    }

    public void printSeats(){
        for (Seat seat : seats){
            System.out.println(seat.seatNumber
                    + " is reserved = " + seat.isReserved
                    + " price: " + seat.price );

        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }


    public class Seat implements Comparable<Seat> {
        private String seatNumber;
        private double price;
        public boolean isReserved;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.isReserved=false;
            this.price = price;
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

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }
    }
}
