import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Mechanic mechanic

        // [GTR, BMW, POLESTAR, Q50]

        // --> go through the list
        // --> mechanic.repair(vehicle)
        //   vehicle.runDiagnostics() -> "FLAT TIRE","PAINT CHIP","BLOWN TURBO"
        //      --> vehicle.fixProblem("FLAT TIRE")'
        //   finished repairing vehicle

        Mechanic mechanic = new Mechanic();

        List<Vehicle> garage = List.of(new NissanGTR(), new Polestar2(), new Q50(), new HondaPilot());

        printGarage(garage);

        System.out.print("\n\n\n");

        for (Vehicle vehicle : garage) {
            mechanic.repairVehicle(vehicle);
        }

        System.out.print("\n\n\n");

        printGarage(garage);
    }

    private static void printGarage(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getModel() + ": " + vehicle.runDiagnostics());
        }
    }
}