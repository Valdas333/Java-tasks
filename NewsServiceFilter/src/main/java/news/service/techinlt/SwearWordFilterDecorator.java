package news.service.techinlt;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class SwearWordFilterDecorator implements NewsService {
    private final NewsService decoratedNewsService;
    private final List<String> swearWords;

    public SwearWordFilterDecorator(NewsService decoratedNewsService) {
        this.decoratedNewsService = decoratedNewsService;
        this.swearWords = List.of("rupūs miltai", "velniai rautų", "velnias", "velniais");
    }

    private String filterSwearWords(String text) {
        text = text.trim();
        for (String swearWord : swearWords) {
            swearWord = swearWord.trim();
            text = text.replaceAll("(?i)" + Pattern.quote(swearWord), "***");
        }
        return text;
    }


    @Override
    public List<Article> getArticles() {
        // Filter and replace swear words in articles
        return decoratedNewsService.getArticles()
                .stream()
                .filter(article -> !containsSwearWord(article.getHeading()))
                .map(article -> new MyArticleImpl(article.getHeading(), filterSwearWords(article.getBrief())))
                .collect(Collectors.toList());
    }

    private boolean containsSwearWord(String text) {
        return swearWords.stream().anyMatch(swearWord -> text.toLowerCase().contains(swearWord.toLowerCase()));
    }
}




