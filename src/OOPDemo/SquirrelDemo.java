package OOPDemo;

import OOPDemo.*;

public class SquirrelDemo {
    public static void main(String[] args) {
        
        // Define squirrel objects
        Squirrel alvin;
        Squirrel simon;
        Squirrel theodore;
        
        // Create instances (constructor called)
        alvin = new Squirrel("Red", "Medium", 8, 100.0);
        simon = new Squirrel("Blue", "Tall", 2, 240.5);
        theodore = new Squirrel("Green", "Grande", 15, 66.6);

        // Method calls
        alvin.climb();
        alvin.run();
        simon.findNut(3);
        theodore.eatNut();
        theodore.findNut(23);
        simon.run();
        System.out.println("Theodore's nut count: " + theodore.getNutCount());
        simon.kill();

        System.out.println("Simon's IQ: " + simon.iqDouble);

    }
}
