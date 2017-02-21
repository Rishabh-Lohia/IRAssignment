package in.ac.bitspilani;

import java.util.List;

public class IndexBuilder {
	
	public static void addToIndex(List<ProcessedToken> lemma){
		for(int i = 0; i<lemma.size(); i++){
			String term = lemma.get(i).getWord();
			int docId = lemma.get(i).getDocId();
			int wordNumber = lemma.get(i).getWordNumber();
			if(!App.index.containsKey(term)){
				App.index.put(term, new PostingsList());
			}
			App.index.get(term).insertIntoList(term, docId, wordNumber);
		}
	}
}
