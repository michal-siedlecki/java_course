package com.siedlecki;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Room room = new Room(new Bed(new Dimmensions(90,210,45),false),
//                new Desk(new Dimmensions(160,70,89),
//                        new DeskLamp(new LightSwitch(false),new Bulb(false))));
//
//        room.describeRoom();
//        room.coverBed();
//        room.turnLightOn();
//        room.describeRoom();
//        room.turnLightOff();
//        room.getBed().unCover();
//        room.describeRoom();
        Printer printer = new Printer(23,50,false);
        printer.getTonerLevelPercent();
        printer.fillUpToner(788);
        printer.getTonerLevelPercent();
        printer.print(45);
        printer.getPrintedPagesNum();
        printer.getTonerLevelPercent();

        Printer duplexprinter = new Printer(100,0,true);
        duplexprinter.print(56);
        duplexprinter.fillUpToner(56);
        duplexprinter.getPrintedPagesNum();
        duplexprinter.getTonerLevelPercent();
        duplexprinter.print(200);
        duplexprinter.getPrintedPagesNum();





    }
}
