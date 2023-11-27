package news.service.techinlt;

import lt.vtvpmc.BaseNewsServiceTest;

public class NewsServiceTest extends BaseNewsServiceTest {
    @Override
    protected lt.vtvpmc.NewsService getNewsService() {
        return new NewsServiceFilter();
    }
}
