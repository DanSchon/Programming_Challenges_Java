import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileLetterCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// create a file called newFile
		String fileName = "newFile.txt";
		PrintWriter pw = new PrintWriter(fileName);
		
		// add contents to the file
		String fileContent = "this is a line of text written on the file";
		pw.println(fileContent);
		pw.close();
		
		// read contents from the file
		String readFileContent;
		File file = new File(fileName);
		Scanner fileScanner = new Scanner(file);
		readFileContent = fileScanner.nextLine();
		fileScanner.close();
		
		// perform operations on read file contents object (String)
		char charToCount = 'a';
		int charCount = 0;
		for(int i = 0; i < readFileContent.length(); i++) {
			if(readFileContent.charAt(i) == charToCount) {
				charCount += 1;
			}
		}
		System.out.println(charCount);
	}

}
