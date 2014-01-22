package pl.finsys.structural.bridge.example2;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 21.05.13
 * Time: 09:47
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new VehicleCar(new WorkshopProduce(), new WorkshopAssemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new VehicleBike(new WorkshopProduce(), new WorkshopAssemble());
        vehicle2.manufacture();
    }
}
