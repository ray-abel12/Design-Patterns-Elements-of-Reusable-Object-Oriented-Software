package source;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		Journal diary = new Journal();
		diary.addEntries("i strated programming today");
		diary.addEntries("programming today");
		System.out.println(diary);
		
		Persistence p = new Persistence();
		String filename= "C:\\Users\\RAY_ABEL\\Documents\\journal.txt";
		p.saveToFile(diary, filename, true);
		Runtime.getRuntime().exec("notepad.exe " + filename);

	}

}
