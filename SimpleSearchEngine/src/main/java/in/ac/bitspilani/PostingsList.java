package in.ac.bitspilani;

import java.util.TreeMap;

public class PostingsList {
	private String term;
	private TreeMap<Integer, Position> postings = null;
	public PostingsList() {
		super();
	}
	
	public void insertIntoList(String word, int docId, int wordNumber){
		this.term = word;
		if(postings==null)
			postings = new TreeMap<Integer, Position>();
		if(!postings.containsKey(docId))
			postings.put(docId, new Position());
		postings.get(docId).setDocId(docId);
		postings.get(docId).insertIntoWordList(wordNumber);
		
	}
	
	
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public TreeMap<Integer, Position> getPostings() {
		return postings;
	}
	public void setPostings(TreeMap<Integer, Position> postings) {
		this.postings = postings;
	}

	@Override
	public String toString() {
		return "PostingsList [term=" + term +  ", postings=" + postings
				+ "]";
	}
	
	
	
}
