package pl.finsys.structural.bridge.example2;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 21.05.13
 * Time: 09:45
 */
public class VehicleCar extends Vehicle {

    public VehicleCar(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("VehicleCar ");
        workShop1.work();
        workShop2.work();
    }
}