package LLD.StrategyDesignPattern;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDrivingStrategy());
    }
}
