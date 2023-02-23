package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyFilesInCatalog {
	
	public static void CopyFile(File fileIn, File fileOut) throws IOException {
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut);) {
			is.transferTo(os);
		} 
	}
	
	public static void copyFiles(File folderIn, File folderOut, String extension) throws IOException {
		
		File[] files = folderIn.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			String fleName = files[i].getName();
			int dotIndex = files[i].getName().lastIndexOf(".") + 1;
			String fileExtension = fleName.substring(dotIndex);
			
			if (files[i].isFile() && extension.equals(fileExtension)) {
				File fileOut = new File(folderOut, fleName);
		        CopyFile(files[i], fileOut);
			}
			
		}
		
	}

}
