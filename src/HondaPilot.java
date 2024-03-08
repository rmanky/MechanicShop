import java.util.ArrayList;
import java.util.List;

public class HondaPilot extends AbstractVehicle {
    HondaPilot() {
        setProblems("FLAT TIRE", "BROKEN WINDOW", "SMASHED REAR VIEW MIRROR");
    }

    @Override
    public String getModel() {
        return "Honda Pilot";
    }
}
