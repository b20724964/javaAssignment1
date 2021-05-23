

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseReader {
	public String[][] readerFileTxt(String fileString) {
		try {
			Scanner myReader = new Scanner(new File(fileString));
			ArrayList<String[]> lines = new ArrayList<>();

			while (myReader.hasNextLine()) {
				String[] splitted = myReader.nextLine().split(" ");
				lines.add(splitted);
			}

			String[][] result = new String[lines.size()][];
			for (int i = 0; i < result.length; i++) {
				result[i] = lines.get(i);
			}

			return result;
		} catch (Exception e) {
			System.out.println("File not found: " + e.getMessage());
		}
		return null;

	}
}
