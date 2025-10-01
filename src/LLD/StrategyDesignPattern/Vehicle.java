package LLD.StrategyDesignPattern;

public class Vehicle {
    StrategyInterface driveobject;

    public Vehicle(StrategyInterface driveobj) {
        this.driveobject = driveobj;
    }
    public void drive(){
        driveobject.drive();
    }
}
