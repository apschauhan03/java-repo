

interface Building {
    boolean authentication(int id);

    int lift();

    String getAddress();
}

// Abstract base class
abstract class AbstractBuilding implements Building {
    protected int floor;
    protected boolean hasLift;
    protected String address;
}

// ResidentialBuilding class
class ResidentialBuilding extends AbstractBuilding {
    ResidentialBuilding(int floor, boolean hasLift, String address) {
        this.floor = floor;
        this.hasLift = hasLift;
        this.address = address;
    }

    public boolean authentication(int id) {
        // Assume everyone with a valid ID can enter
        return id > 0;
    }

    public int lift() {
        return hasLift ? floor : 0;
    }

    public String getAddress() {
        return this.address;
    }
}

// OfficeBuilding class
class OfficeBuilding extends AbstractBuilding {
    private String companyName;

    OfficeBuilding(int floor, boolean hasLift, String address, String companyName) {
        this.floor = floor;
        this.hasLift = hasLift;
        this.address = address;
        this.companyName = companyName;
    }

    public boolean authentication(int id) {
        // Only IDs divisible by 3 are allowed (dummy logic)
        return id % 3 == 0;
    }

    public int lift() {
        return hasLift ? floor : 0;
    }

    public String getAddress() {
        return this.address + ", Office of " + companyName;
    }
}

// MallBuilding class
class MallBuilding extends AbstractBuilding {
    private int shops;

    MallBuilding(int floor, boolean hasLift, String address, int shops) {
        this.floor = floor;
        this.hasLift = hasLift;
        this.address = address;
        this.shops = shops;
    }

    public boolean authentication(int id) {
        // Public access
        return true;
    }

    public int lift() {
        return hasLift ? floor : 0;
    }

    public String getAddress() {
        return this.address + " (Shops: " + shops + ")";
    }
}

// SmartBuilding class
class SmartBuilding extends AbstractBuilding {
    private boolean biometricAccess;

    SmartBuilding(int floor, boolean hasLift, String address, boolean biometricAccess) {
        this.floor = floor;
        this.hasLift = hasLift;
        this.address = address;
        this.biometricAccess = biometricAccess;
    }

    public boolean authentication(int id) {
        return biometricAccess && id >= 1000;
    }

    public int lift() {
        return hasLift ? floor : 0;
    }

    public String getAddress() {
        return "Smart Building: " + this.address;
    }
}

public class BuildingProblem {
    public static void main(String[] args) {
        Building[] buildings = new Building[] {
                new ResidentialBuilding(5, true, "10-D MIG Green View Apartments, Noida"),
                new OfficeBuilding(10, true, "Sector 125, Noida", "Zeta Tech"),
                new MallBuilding(3, true, "Sector 18, Noida", 45),
                new SmartBuilding(7, true, "Cyber Park, Gurgaon", true)
        };

        int[] sampleIds = { 101, 3, 500, 999 };

        for (int i = 0; i < buildings.length; i++) {
            System.out.println("\n--- Building " + (i + 1) + " ---");
            System.out.println("Address: " + buildings[i].getAddress());
            System.out.println("Lift available to floor: " + buildings[i].lift());
            System.out.println("Auth with ID " + sampleIds[i] + ": "
                    + (buildings[i].authentication(sampleIds[i]) ? "Allowed" : "Denied"));
        }
    }
}
