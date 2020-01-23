package com.siedlecki;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Small", 8, 10, 12);

        theatre.reserveSeat("A01");
        theatre.printSeats();

        List<Theatre.Seat> copiedSeats = new ArrayList<>(theatre.seats);
        Collections.sort(copiedSeats, Theatre.PRICE_ORDER);
        printSeats(copiedSeats);

    }

    public static void printSeats(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(seat.getSeatNumber() + " " + seat.getPrice());
        }
    }



}
