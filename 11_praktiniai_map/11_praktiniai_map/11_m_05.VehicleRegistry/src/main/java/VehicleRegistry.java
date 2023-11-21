import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate,String> plateOwners = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner){
        if (!plateOwners.containsKey(licensePlate)){
            plateOwners.put(licensePlate,owner);
            return true;
        }
        else {return false;}
    }

    public String get(LicensePlate licensePlate){
        if (plateOwners.containsKey(licensePlate)){
            return plateOwners.get(licensePlate);
        }
        else return null;
    }
}
