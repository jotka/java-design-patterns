package pl.finsys.structural.bridge.example2;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 21.05.13
 * Time: 09:46
 */
public class VehicleBike extends Vehicle {

    public VehicleBike(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("VehicleBike ");
        workShop1.work();
        workShop2.work();
    }

}
