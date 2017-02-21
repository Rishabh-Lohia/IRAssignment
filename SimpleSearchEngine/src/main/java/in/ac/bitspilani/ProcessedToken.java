package in.ac.bitspilani;

public class ProcessedToken {
	private String word;
	private int docId;
	private int wordNumber;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	
	public int getWordNumber() {
		return wordNumber;
	}
	public void setWordNumber(int wordNumber) {
		this.wordNumber = wordNumber;
	}
	public ProcessedToken(String word, int docId, int wordNumber) {
		super();
		this.word = word;
		this.docId = docId;
		this.wordNumber = wordNumber;
	}
	@Override
	public String toString(){
		return word + ": Document# " + Integer.toString(docId) +" Word# "+ Integer.toString(wordNumber);
	}
	
}