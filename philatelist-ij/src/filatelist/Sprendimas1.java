package filatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Optional;

public class Sprendimas1 implements Philatelist {
    private ArrayList<PostStamp> myStamps;

    public Sprendimas1() {
        this.myStamps = new ArrayList<>();
    }

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()){
            throw new IllegalArgumentException();
        }
        if (!myStamps.contains(postStamp)){
        myStamps.add(postStamp);
        }

    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        double mostExpensiveValue = myStamps.get(0).getMarketPrice();
        PostStamp mostExpensiveStamp = null;
        for (PostStamp stamp: myStamps) {
            if (stamp.getMarketPrice() > mostExpensiveValue){
                mostExpensiveStamp = stamp;
            }

        }
        return mostExpensiveStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        double avgPrice = 0;
        for (PostStamp stamp:
             myStamps) { avgPrice += stamp.getMarketPrice();}
        return avgPrice/myStamps.size();
    }



    @Override
    public int getNumberOfPostStampsInCollection() {

        return myStamps.size();
    }
}