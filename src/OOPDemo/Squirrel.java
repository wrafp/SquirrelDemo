package OOPDemo;

public class Squirrel {
    // instance variables
    String colourString; 
    String sizeString;
    int nutsInt;
    boolean isAlive;
    double iqDouble;


    // constructor
    /**
     * Create an instance of a Squirrel
     * @param newColourString
     * @param newSizeString
     * @param newNutsInt
     * @param newIQDouble
     */
    public Squirrel(String newColourString, String newSizeString, int newNutsInt, double newIQDouble) {
        this.isAlive = true;
        this.colourString = newColourString;
        this.sizeString = newSizeString;
        this.nutsInt = newNutsInt;
        this.iqDouble = newIQDouble;
    }

    // instance methods
    public void run() {
        System.out.println("run!!");
    }

    public void findNut(int numberNuts) { // modifying instance variable, encapsulation
        this.nutsInt += numberNuts;
    }

    public int getNutCount() {
        return this.nutsInt;
    }

    public void eatNut() {
        this.nutsInt--;
    }

    public void climb() {
        System.out.println("Climb that tree!!");
    }

    public void kill() {
        this.isAlive = false;
    }



}