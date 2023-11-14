import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcaseHold = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        int totalWeightOfSuitcase = 0;
        for (Suitcase item: suitcaseHold
             ) {totalWeightOfSuitcase += item.totalWeight();
        }
        if ((totalWeightOfSuitcase + suitcase.totalWeight()) <= this.maximumWeight){
            this.suitcaseHold.add(suitcase);
        }


    }

    public void printItems(){
        for (int i = 0; i < suitcaseHold.size(); i++) {
                suitcaseHold.get(i).printItems();
        }
    }

    @Override
    public String toString(){
        int totalWeightOfSuitcase = 0;
        for (Suitcase item: suitcaseHold
        ) {totalWeightOfSuitcase += item.totalWeight();
        }
        return suitcaseHold.size() + " suitcases " + "(" + totalWeightOfSuitcase + " kg)";
    }

}
