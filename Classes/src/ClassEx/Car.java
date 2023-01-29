package ClassEx;

public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;
    
    Car(String model, int speed, String color){
    	this.model = model;
    	this.speed = speed;
    	this.color = color;
    	this.type="Sedan";
    	this.speedLimit = 180;
    	
    }
    //overloading in functions
    Car(){
    	System.out.println("Empty constructor");
    }
    // davranışlar
    void increaseSpeed(int increment) {
        this.speed += increment;
       
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }
    
    void printSpeed() {
        System.out.println("Speed : " + this.speed);
    }
    
    void printInfo() {
        System.out.println("Model \t: " + this.model);
        System.out.println("Color \t: " + this.color);
        System.out.println("Type \t: " + this.type);
        System.out.println("Speed \t: " + this.speed);
    }
    // ...
}
