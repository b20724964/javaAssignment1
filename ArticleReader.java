
public class ArticleReader extends BaseReader{
	public Article[] articles(String fileString) {
		String[][] articlesReader = readerFileTxt(fileString);
		Article[] articles = new Article[articlesReader.length];

		for (int i = 0; i < articles.length; i++) {
			articles[i] = new Article();
		}

		for (int i = 0; i < articlesReader.length; i++) {
			try {
				articles[i].setPaperid(Integer.parseInt(articlesReader[i][1]));
				articles[i].setPapername(articlesReader[i][2]);
				articles[i].setPublisherName(articlesReader[i][3]);
				articles[i].setPublisYear(Integer.parseInt(articlesReader[i][4]));
			} catch (Exception e) {
				
			}

		}

		return articles;
	}
}
