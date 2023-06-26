package competetion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		PrintWriter fileOut = null;
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileReader("C:/pratice doc/newFile.txt"));
			fileOut = new PrintWriter(new FileWriter("newfile" + ".txt"));

			while (fileIn.hasNextLine()) {
				String oneLine = fileIn.nextLine();
				System.out.println(oneLine);
				fileOut.println(oneLine + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileOut != null)
				fileOut.close();
			if (fileIn != null)
				fileIn.close();
		}
		try {

			fileIn = new Scanner(new FileReader("C:/Users/ajith/eclipse-workspace/people/workSpace/newfile.txt"));

			while (fileIn.hasNextLine()) {
				String oneLine = fileIn.nextLine();
				System.out.println(oneLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileIn != null)
				fileIn.close();
		}
	}
}
