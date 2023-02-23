package task;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File folderIn = new File("./src/Input catalog");
		File folderOut = new File("./src/Output catalog");
		String extension = "docx";
				
		try {
			CopyFilesInCatalog.copyFiles(folderIn, folderOut, extension);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
