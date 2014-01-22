package pl.finsys.structural.bridge.example2;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 21.05.13
 * Time: 09:46
 */
public class WorkshopProduce implements Workshop {

    @Override
    public void work() {
        System.out.print("Produced");
    }

}

