import java.util.ArrayList;
import java.util.List;

public class Q50 implements Vehicle {
    ArrayList<String> problems = new ArrayList<>(List.of("FLAT TIRE", "BROKEN WINDOW", "OUT OF GAS", "SLASHED TIRES", "BROKEN SIDE MIRROR"));

    @Override
    public String getModel() {
        return "Q50";
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
