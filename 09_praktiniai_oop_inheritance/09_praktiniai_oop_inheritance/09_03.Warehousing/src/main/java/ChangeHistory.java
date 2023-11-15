import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory()
    {
        history = new ArrayList<>();
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public String toString(){
        return history.toString();
    }

    public double maxValue(){
        double maxValue = 0;
        for (Double value:
             history) {if (value > maxValue){
                 maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue(){
        double minValue = history.get(0);
        for (Double value:
                history) {if (value < minValue){
            minValue = value;
        }
        }
        return minValue;
    }

    public double average(){
        double sum = 0;
        for (Double value:history
             ) {sum += value;
        }
        return sum/history.size();
    }

}
