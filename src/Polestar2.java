import java.util.ArrayList;
import java.util.List;

public class Polestar2 implements Vehicle {
    ArrayList<String> problems = new ArrayList<>(List.of("FLAT TIRE", "BROKEN WINDOW", "DEAD BATTERY", "BROKEN CHARGE PORT"));

    @Override
    public String getModel() {
        return "Polestar 2";
    }

    @Override
    public List<String> runDiagnostics() {
        return problems;
    }

    @Override
    public void repairProblem(String problem) {
        problems.remove(problem);
    }
}
