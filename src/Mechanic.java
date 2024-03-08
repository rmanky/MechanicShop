import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mechanic {
    Random random = new Random();

    public void repairVehicle(Vehicle vehicle) {
        List<String> problems = new ArrayList<>(vehicle.runDiagnostics());

        System.out.println("Starting repair of vehicle: " + vehicle.getModel());

        for (String problem : problems) {
            int skillCheck = random.nextInt(0, 100);

            if (skillCheck > 50) {
                vehicle.repairProblem(problem);
                System.out.println("I repaired problem: " + problem);
            } else {
                System.out.println("I failed to repair problem: " + problem);
            }
        }

        System.out.println("Finished with vehicle: " + vehicle.getModel());
    }
}
