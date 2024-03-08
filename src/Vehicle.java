import java.util.List;

public interface Vehicle {
    String getModel();

    List<String> runDiagnostics();

    void repairProblem(String problem);
}
