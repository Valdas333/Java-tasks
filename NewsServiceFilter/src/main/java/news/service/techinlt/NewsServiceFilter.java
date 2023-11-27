package news.service.techinlt;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.List;

public class NewsServiceFilter implements NewsService {

    @Override
    public List<Article> getArticles() {
        NewsService originalNewsService = new NewsServiceImpl();
        NewsService filteredNewsService = new SwearWordFilterDecorator(originalNewsService);
        return filteredNewsService.getArticles();  // Call getArticles() to get the filtered list
    }
}


