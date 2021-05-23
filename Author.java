

public class Author {
	private int id;
	private String name="";
	private String university="";
	private String department="";
	private String email="";
	private Article article1= new Article();
	private Article article2= new Article();
	private Article article3= new Article();
	private Article article4= new Article();
	private Article article5= new Article();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Article getArticle1() {
		return article1;
	}
	public void setArticle1(Article article1) {
		this.article1 = article1;
	}
	public Article getArticle2() {
		return article2;
	}
	public void setArticle2(Article article2) {
		this.article2 = article2;
	}
	public Article getArticle3() {
		return article3;
	}
	public void setArticle3(Article article3) {
		this.article3 = article3;
	}
	public Article getArticle5() {
		return article5;
	}
	public void setArticle5(Article article5) {
		this.article5 = article5;
	}
	public Article getArticle4() {
		return article4;
	}
	public void setArticle4(Article article4) {
		this.article4 = article4;
	}
	
}
