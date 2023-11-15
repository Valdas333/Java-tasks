import java.util.ArrayList;
import java.util.Arrays;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
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
        return maxValue <= 0 ? maxValue : 0;
    }

    public double minValue(){
        double minValue = 0;
        for (Double value:
                history) {if (value > minValue){
            minValue = value;
        }
        }
        return minValue <= 0 ? minValue : 0;
    }

    public double average(){
        double sum = 0;
        for (Double value:history
             ) {sum += value;
        }
        return sum/history.size();
    }

}
