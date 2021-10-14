package guiswingopg;

public class Exchanger {
    double number;
    double calcNumber;
    
    char type;
    
    public Exchanger(double number, char type) {
        this.number = number;
        this.type = type;
    exchangeValues(this.number, this.type);
}
    
    
    
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
