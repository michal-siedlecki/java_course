package com.siedlecki.listmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Small", 8, 10);

        List<Theatre.Seat> seatListCopy = new ArrayList<>(theatre.seats);
        printSeats(seatListCopy);
        System.out.println();

        Collections.shuffle(seatListCopy);
        printSeats(seatListCopy);

        Theatre.Seat minSeat = Collections.min(theatre.seats);
        Theatre.Seat maxSeat = Collections.max(theatre.seats);

        System.out.println(minSeat.getSeatNumber());
        System.out.println(maxSeat.getSeatNumber());

        System.out.println("bubble sort:");
        bubbleSort(seatListCopy);
        printSeats(seatListCopy);

    }

    public static void printSeats(List <Theatre.Seat> list) {
        int seatCountInRow = 0;
        for (Theatre.Seat seat : list) {
            seatCountInRow++;
            System.out.print(seat.getSeatNumber());
            System.out.print(" ");
            if (seatCountInRow==11){
                seatCountInRow = 0;
                System.out.println();
            }
        }
    }

    public static void bubbleSort(List<Theatre.Seat> list) {
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<list.size(); j++) {
                if (list.get(i).compareTo(list.get(j))<0) {
                    Collections.swap(list, j, i);
                }
            }
        }
    }


}
