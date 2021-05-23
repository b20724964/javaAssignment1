

public class AuthorReader extends BaseReader{
	public Author[] authors(String fileString) {
		String[][] authorReader = readerFileTxt(fileString);
		Author[] authors = new Author[authorReader.length];
		
		
		for (int i=0; i<authors.length;i++) {
			authors[i]= new Author();
		}
		
		for (int i = 0; i < authorReader.length; i++) {
			
			Article article1= new Article();
			Article article2= new Article();
			Article article3= new Article();
			Article article4= new Article();
			Article article5= new Article();
			
			try {
				authors[i].setId(Integer.parseInt(authorReader[i][1]));
				authors[i].setName(authorReader[i][2]);
				authors[i].setUniversity(authorReader[i][3]);
				authors[i].setDepartment(authorReader[i][4]);
				authors[i].setEmail(authorReader[i][5]);
				article1.setPaperid(Integer.parseInt(authorReader[i][6]));
				authors[i].setArticle1(article1);
				article2.setPaperid(Integer.parseInt(authorReader[i][7]));
				authors[i].setArticle2(article2);
				article3.setPaperid(Integer.parseInt(authorReader[i][8]));
				authors[i].setArticle3(article3);
				article4.setPaperid(Integer.parseInt(authorReader[i][9]));
				authors[i].setArticle4(article4);
				article5.setPaperid(Integer.parseInt(authorReader[i][10]));
				authors[i].setArticle5(article5);
			}catch (Exception e) {

			}
			
			
		}
		
		return authors;
	}
}
