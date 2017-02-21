package in.ac.bitspilani;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class App {
	public static HashMap<String, PostingsList> index;
	public static void main(String[] args){
		index = new HashMap<String, PostingsList>();;
		File folder = new File("/home/rishabh/Downloads/Information Retrieval/Assignment 1/reuters/test");
		File[] listOfFiles = folder.listFiles();
		StanfordLemmatizer slem = new StanfordLemmatizer();
		for (int i = 0; i < listOfFiles.length; i++){
			int docId = Integer.parseInt(listOfFiles[i].getName());
			IndexBuilder.addToIndex(slem.lemmatize(docId));
			System.out.println(Integer.toString(listOfFiles.length - i) +  " documents left.");
		}
		Iterator it = index.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " " + pair.getValue().toString());
		}
		
	}
}
