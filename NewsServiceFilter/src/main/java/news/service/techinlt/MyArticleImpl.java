package news.service.techinlt;

import lt.vtvpmc.Article;

public class MyArticleImpl implements Article {
    private final String heading;
    private final String brief;

    public MyArticleImpl(String heading, String brief) {
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getBrief() {
        return brief;
    }
}
