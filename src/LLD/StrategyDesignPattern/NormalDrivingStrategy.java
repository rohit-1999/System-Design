package LLD.StrategyDesignPattern;

public class NormalDrivingStrategy implements StrategyInterface{
    @Override
    public void drive() {
        System.out.println("Normal Driving Capability");
    }
}
