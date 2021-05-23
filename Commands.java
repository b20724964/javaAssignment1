

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Commands {
	private Author[] authors;
	private Article[] articles;
	private PrintWriter writer;

	public Author[] takeAuthor(Author[] authors) {
		this.authors = authors;
		return this.authors;
	}

	public void createOutputFile() {
		try {
			this.writer = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while creating the file: " + e.getMessage());
		}
	}

	public void readArticle(Article[] articles) {
		this.articles = articles;

		for (int i = 0; i < articles.length; i++) {
			for (int j = 0; j < authors.length; j++) {
				if (articles[i].getPaperid() == authors[j].getArticle1().getPaperid()) {
					authors[j].getArticle1().setPapername(articles[i].getPapername());
					authors[j].getArticle1().setPublisherName(articles[i].getPublisherName());
					authors[j].getArticle1().setPublisYear(articles[i].getPublisYear());
				} else if (articles[i].getPaperid() == authors[j].getArticle2().getPaperid()) {
					authors[j].getArticle2().setPapername(articles[i].getPapername());
					authors[j].getArticle2().setPublisherName(articles[i].getPublisherName());
					authors[j].getArticle2().setPublisYear(articles[i].getPublisYear());
				} else if (articles[i].getPaperid() == authors[j].getArticle3().getPaperid()) {
					authors[j].getArticle3().setPapername(articles[i].getPapername());
					authors[j].getArticle3().setPublisherName(articles[i].getPublisherName());
					authors[j].getArticle3().setPublisYear(articles[i].getPublisYear());
				} else if (articles[i].getPaperid() == authors[j].getArticle4().getPaperid()) {
					authors[j].getArticle4().setPapername(articles[i].getPapername());
					authors[j].getArticle4().setPublisherName(articles[i].getPublisherName());
					authors[j].getArticle4().setPublisYear(articles[i].getPublisYear());
				} else if (articles[i].getPaperid() == authors[j].getArticle5().getPaperid()) {
					authors[j].getArticle5().setPapername(articles[i].getPapername());
					authors[j].getArticle5().setPublisherName(articles[i].getPublisherName());
					authors[j].getArticle5().setPublisYear(articles[i].getPublisYear());
				} else {

				}
			}

		}

	}

	public void list() {
		writer.println(
				"----------------------------------------------List---------------------------------------------");
		for (int i = 0; i < authors.length; i++) {
			writer.println("Author:" + authors[i].getId() + "\t" + authors[i].getName() + "\t"
					+ authors[i].getUniversity() + "\t" + authors[i].getDepartment() + "\t" + authors[i].getEmail());
			if (!(authors[i].getArticle1().getPaperid() == 0)) {
				writer.println("+" + authors[i].getArticle1().getPaperid() + "\t"
						+ authors[i].getArticle1().getPapername() + "\t" + authors[i].getArticle1().getPublisherName()
						+ "\t" + authors[i].getArticle1().getPublisYear());
			}
			if (!(authors[i].getArticle2().getPaperid() == 0)) {
				writer.println("+" + authors[i].getArticle2().getPaperid() + "\t"
						+ authors[i].getArticle2().getPapername() + "\t" + authors[i].getArticle2().getPublisherName()
						+ "\t" + authors[i].getArticle2().getPublisYear());
			}
			if (!(authors[i].getArticle3().getPaperid() == 0)) {
				writer.println("+" + authors[i].getArticle3().getPaperid() + "\t"
						+ authors[i].getArticle3().getPapername() + "\t" + authors[i].getArticle3().getPublisherName()
						+ "\t" + authors[i].getArticle3().getPublisYear());
			}
			if (!(authors[i].getArticle4().getPaperid() == 0)) {
				writer.println("+" + authors[i].getArticle4().getPaperid() + "\t"
						+ authors[i].getArticle4().getPapername() + "\t" + authors[i].getArticle4().getPublisherName()
						+ "\t" + authors[i].getArticle4().getPublisYear());
			}
			if (!(authors[i].getArticle5().getPaperid() == 0)) {
				writer.println("+" + authors[i].getArticle5().getPaperid() + "\t"
						+ authors[i].getArticle5().getPapername() + "\t" + authors[i].getArticle5().getPublisherName()
						+ "\t" + authors[i].getArticle5().getPublisYear());
			}
			writer.println("");
		}
		writer.println(
				"----------------------------------------------End----------------------------------------------\n");

	}

	public void compliteAll() {
		for (int i = 0; i < authors.length; i++) {
			for (int j = 0; j < articles.length; j++) {
				if (authors[i].getArticle1().getPaperid() == 0 && Integer
						.parseInt(String.valueOf(articles[j].getPaperid()).substring(0, 3)) == authors[i].getId()) {
					authors[i].setArticle1(articles[j]);
				} else if (authors[i].getArticle2().getPaperid() == 0 && Integer
						.parseInt(String.valueOf(articles[j].getPaperid()).substring(0, 3)) == authors[i].getId()) {
					authors[i].setArticle2(articles[j]);
				} else if (authors[i].getArticle3().getPaperid() == 0 && Integer
						.parseInt(String.valueOf(articles[j].getPaperid()).substring(0, 3)) == authors[i].getId()) {
					authors[i].setArticle3(articles[j]);
				} else if (authors[i].getArticle4().getPaperid() == 0 && Integer
						.parseInt(String.valueOf(articles[j].getPaperid()).substring(0, 3)) == authors[i].getId()) {
					authors[i].setArticle4(articles[j]);
				} else if (authors[i].getArticle5().getPaperid() == 0 && Integer
						.parseInt(String.valueOf(articles[j].getPaperid()).substring(0, 3)) == authors[i].getId()) {
					authors[i].setArticle5(articles[j]);
				}

			}
		}
		writer.println(
				"*************************************CompleteAll Successful*************************************\n");
	}

	public void sortedAll() { 
		for (int i = 0; i < authors.length; i++) {
			int[] articleIdList = { authors[i].getArticle1().getPaperid(), authors[i].getArticle2().getPaperid(),
					authors[i].getArticle3().getPaperid(), authors[i].getArticle4().getPaperid(),
					authors[i].getArticle5().getPaperid() };
			Article[] articleList = { authors[i].getArticle1(), authors[i].getArticle2(), authors[i].getArticle3(),
					authors[i].getArticle4(), authors[i].getArticle5(), };
			Arrays.sort(articleIdList);

			authors[i].setArticle1(new Article());
			authors[i].setArticle2(new Article());
			authors[i].setArticle3(new Article());
			authors[i].setArticle4(new Article());
			authors[i].setArticle5(new Article());

			authors[i].getArticle1().setPaperid(articleIdList[0]);
			authors[i].getArticle2().setPaperid(articleIdList[1]);
			authors[i].getArticle3().setPaperid(articleIdList[2]);
			authors[i].getArticle4().setPaperid(articleIdList[3]);
			authors[i].getArticle5().setPaperid(articleIdList[4]);

			for (int j = 0; j < 5; j++) {
				if (authors[i].getArticle1().getPaperid() == articleList[j].getPaperid()) {
					authors[i].setArticle1(articleList[j]);
				} else if (authors[i].getArticle2().getPaperid() == articleList[j].getPaperid()) {
					authors[i].setArticle2(articleList[j]);
				} else if (authors[i].getArticle3().getPaperid() == articleList[j].getPaperid()) {
					authors[i].setArticle3(articleList[j]);
				} else if (authors[i].getArticle4().getPaperid() == articleList[j].getPaperid()) {
					authors[i].setArticle4(articleList[j]);
				} else if (authors[i].getArticle5().getPaperid() == articleList[j].getPaperid()) {
					authors[i].setArticle5(articleList[j]);
				}
			}
		}
		writer.println(
				"*************************************SortedAll Successful*************************************\n");
	}

	public void del(int id) {
		Author[] copyAuthors = new Author[authors.length - 1];
		for (int i = 0, j = 0; i < authors.length; i++) {
			if (id != authors[i].getId()) {
				copyAuthors[j++] = authors[i];
			}
		}
		this.authors = copyAuthors;
		writer.println("*************************************del Successful*************************************\n");

	}

	public void closeOutputFile() {
		writer.close();
	}
}
