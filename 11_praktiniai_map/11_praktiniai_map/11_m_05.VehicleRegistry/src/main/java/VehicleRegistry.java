import java.util.ArrayList;
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
        return plateOwners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate){
        if (plateOwners.containsKey(licensePlate)){
            plateOwners.remove(licensePlate);
            return true;
        }
        else {return false;}
    }

    public void printLicensePlates(){
        for (LicensePlate plate:plateOwners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList <String> plateOwnersAll = new ArrayList<>();
        for (LicensePlate plate: plateOwners.keySet()) {
            if (!plateOwnersAll.contains(plateOwners.get(plate))) {
                plateOwnersAll.add(plateOwners.get(plate));
            }
        }
        for (String owner: plateOwnersAll
             ) {
            System.out.println(owner);

        }
    }
}

