package in.ac.bitspilani;

import java.util.List;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;
import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class App {
	/*public static ArrayList<String> Tokenizer(String fd){
		//ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>(); 
		PTBTokenizer<CoreLabel> ptbt = null;
		try {
			ptbt = new PTBTokenizer<CoreLabel>(new FileReader(fd),
			          new CoreLabelTokenFactory(), "");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("asd");
			e.printStackTrace();
		}
	      while (ptbt.hasNext()) {
	        CoreLabel label = ptbt.next();
	        result.add(label.toString());
	      }
		return result;
	}*/
	
	public static void main(String[] args){
		String filePath = new String();
		filePath = "/home/rishabh/Downloads/Information Retrieval/Assignment 1/reuters/test/14903";
		StanfordLemmatizer slem = new StanfordLemmatizer();
		String contents = null;
		try {
			contents = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(slem.lemmatize(contents));
	}
}
