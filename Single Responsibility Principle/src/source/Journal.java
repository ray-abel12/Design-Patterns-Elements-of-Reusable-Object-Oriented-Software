package source;

import java.util.ArrayList;
import java.util.List;


public class Journal {
	
	public List<String> entries = new ArrayList<String>();
	public static int counter= 0;
	//private final static Logger Logger=Logger.getLogger(Journal.class.getName());
	
	
	public void addEntries(String text) {
		entries.add(""+(++counter)+" "+text);
	}
	public void removeEntries(int index) {
		entries.remove(index);
	}
	@Override
	public String toString() {
		//System.out.print(entries.toString());
		return String.join(System.lineSeparator(),entries);
	}

}
