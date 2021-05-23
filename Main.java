


public class Main {
	public static void main(String[] args) {

		CommandReader commandReader = new CommandReader();
		String[][] commandsList = commandReader.readCommands(args[1]);

		AuthorReader authorReader = new AuthorReader();
		Author[] authors = authorReader.authors(args[0]);

		Commands commands = new Commands();
		commands.takeAuthor(authors);
		commands.createOutputFile();
		
		ArticleReader articleReader = new ArticleReader();
		
		for (int i = 0; i < commandsList.length; i++) {
			if (commandsList[i][0].equals("read")) {
				
				Article[] articles = articleReader.articles(commandsList[i][1]);
				commands.readArticle(articles);

			} else if (commandsList[i][0].equals("list")) {
				commands.list();
			} else if (commandsList[i][0].equals("completeAll")) {
				commands.compliteAll();
			} else if (commandsList[i][0].equals("sortedAll")) {
				commands.sortedAll();
			} else if (commandsList[i][0].equals("del")) {
				commands.del(Integer.parseInt(commandsList[i][1]));
			} 
		}
		commands.closeOutputFile();
		
	}
}
