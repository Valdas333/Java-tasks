package filatelist;


import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;
import philatelist.PostStamp;

public class Sprendimas extends PhilatelistBaseTest {

    @Override
    protected Philatelist getPhilatelist() {
        return new Sprendimas1();
    }

}
