package guiswingopg;

public class Exchanger {
    //Decleartion of class variables
    double number;
    double calcNumber;
    
    char type;
    
    //Constructor that takes 2 paramteters and sets the class variables accordingly. Also calls the exchangeValues method
    public Exchanger(double number, char type) {
        this.number = number;
        this.type = type;
    exchangeValues(this.number, this.type);
}
    //This method is what does the calculations. it runs a switch/case on the char that is has.
    //Then it uses either Math.toRadians or Math.toDegrees accordingly. Atlast it returns the value and stores it in the class varaible.
    public double exchangeValues(double number, char type) {
        switch(type) {
            case 'd':
                calcNumber = Math.toRadians(number);
                break;
            case 'r':
                calcNumber = Math.toDegrees(number);
                break;    
        }
        return calcNumber;
    }  
}
