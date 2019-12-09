package com.siedlecki;

class Car {
    private String name;
    private boolean engine;
    private String cylinders;
    private int wheels;

    public Car(String name, boolean engine, String cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "a car has started it's engine..";
    }
    public void accelerate(){
        System.out.println(this.name + " accelerates");
    }
    public void beak() {
        System.out.println(this.name + " breaks");
    }
}

class Skoda extends Car {
    public Skoda() {
        super("Skoda", true, "V4", 5);
    }

    @Override
    public String startEngine() {
        return "Skoda has started it's engine ...";
    }
}

class Bmw extends Car {
    public Bmw() {
        super("BMW", true, "V8", 5);
    }

    @Override
    public String startEngine() {
        return "after button is pressed BMW stared it's engine.....";
    }
}


class Mini extends Car {
    public Mini() {
        super("Mini moris", true, "V6", 4);
    }

    @Override
    public String startEngine() {
        return "Mini moris can't start it's engine it seems broken....";
    }
}

class Porshe extends Car {
    public Porshe() {
        super("Porshe", true, "V8", 4);
    }

    @Override
    public String startEngine() {
        return "Porshe start it's engine ....";
    }
}

class Noname extends Car{

    public Noname() {
        super("name", false, "cylinedrs", 2);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=0; i<11; i++){
            Car car = randomCar();
            System.out.println("Car number #" + i
                    + ": " + car.getName() +
                    " Let star it => " + car.startEngine());
        }
    }

    public static Car randomCar(){
        int randomNum = (int) (Math.random()*5);
        switch (randomNum){
            case 0:
                return new Dacia();
            case 1:
                return new Skoda();
            case 2:
                return new Bmw();
            case 3:
                return new Mini();
            case 4:
                return new Noname();
        }
        return null;
    }


    static class Dacia extends Car {
        public Dacia() {
            super("Dacia", true, "V4", 4);
        }

        @Override
        public String startEngine() {
            return "Dacia start it's engine ....";
        }
    }
}
