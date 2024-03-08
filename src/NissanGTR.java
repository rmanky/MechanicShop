import java.util.ArrayList;
import java.util.List;

public class NissanGTR extends AbstractVehicle {
    NissanGTR() {
        setProblems("FLAT TIRE", "BROKEN WINDOW", "SMASHED REAR VIEW MIRROR");
    }

    @Override
    public String getModel() {
        return "Nissan GTR";
    }
}
