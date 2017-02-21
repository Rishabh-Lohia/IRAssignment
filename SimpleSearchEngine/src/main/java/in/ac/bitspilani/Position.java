package in.ac.bitspilani;

import java.util.TreeSet;

public class Position {
	private int docId;
	private TreeSet<Integer> wordNumbers;
	
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	
	public TreeSet<Integer> getWordNumber() {
		return wordNumbers;
	}
	public void setWordNumber(TreeSet<Integer> wordNumbers) {
		this.wordNumbers = wordNumbers;
	}
	public Position(){
		wordNumbers = null;
	}
	
	@Override
	public String toString() {
		return "Position [docId=" + docId + ", wordNumbers=" + wordNumbers + "]";
	}
	public void insertIntoWordList(int wordNumber){
		if(wordNumbers==null)
			wordNumbers = new TreeSet<Integer>();
		wordNumbers.add(wordNumber);
	}
	
	
}
