package SocialNetworkTask;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class SocialNetworkBase extends BaseSocialNetworkTest {
    @Override
    protected SocialNetwork getSocialNetwork() {
        return new SocialSprendimas();
    }
}
