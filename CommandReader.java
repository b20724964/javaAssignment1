

public class CommandReader extends BaseReader{
	public String[][] readCommands(String fileString) {
		String[][] commandsList= readerFileTxt(fileString);
		
		return commandsList;
	}
}
