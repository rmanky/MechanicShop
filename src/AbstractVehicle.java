import java.util.ArrayList;
import java.util.List;

public abstract class AbstractVehicle implements Vehicle {
    private List<String> problems;

    protected void setProblems(String... problems) {
        this.problems = new ArrayList<>(List.of(problems));
    }

    @Override
    abstract public String getModel();

    @Override
    public List<String> runDiagnostics() {
        return problems;
    }

    @Override
    public void repairProblem(String problem) {
        problems.remove(problem);
    }
}
