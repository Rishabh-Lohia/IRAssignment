package in.ac.bitspilani;

import java.io.File;
public class App {
	
	public static void main(String[] args){
		File folder = new File("/home/rishabh/Downloads/Information Retrieval/Assignment 1/reuters/test");
		File[] listOfFiles = folder.listFiles();
		StanfordLemmatizer slem = new StanfordLemmatizer();
		for (int i = 0; i < listOfFiles.length; i++){
			int docId = Integer.parseInt(listOfFiles[i].getName());
			System.out.println(slem.lemmatize(docId));
		}
		
	}
}
