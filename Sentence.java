public class Sentence {

	private String currSent;

	/** Constructs a new Sentence object. */
	public Sentence(String p) {
		currSent = p;
	}

	/** Returns a string containing the current sentence. */
	public String toString() {
		return currSent;
	}
	


	/** Returns the index of the nth occurrence of str in the current sentence;
	 * returns -1 of the nth occurrence does not exist.
	 * Precondition:  str.length() > 0 and n > 0
	 * Postcondition: the current sentence if not modified.
	 */
	public int findNthTime(String str, int n) {
		int x = 0; 				/**Starting point with letters*/
		for(int a =0; a<n; a++){		/**loop to find starting and end point of string*/	
			int i = x; 
			if (a==0)
			x = currSent.indexOf(str);
			else x = currSent.indexOf(str, i+str.length());
			if (x ==-1){			/**Returns -1 if can't find word*/
				return -1;
			}
		
		}
			return x; /**otherwise returns where it was found*/
	}	
	/** Modifies the current sentence by replacing the nth occurrence of str with repl
	 * If the nth occurrence does not exist, the current sentence is unchanged.
	 * Precondition: str.length() > 0 and n > 0
	 *
	 */
	public void replaceNthTime(String str, int n, String repl) {
		/*  part b - you must call findNthTime here */
		if(findNthTime(str, n) != -1)
        currSent = currSent.substring(0, findNthTime(str, n)) + repl + currSent.substring(findNthTime(str, n)+str.length());
	}

	/** Returns the index of the last occurrence of str in the current sentence:
	 * returns -1 if str is not found.
	 * Precondition:  str.length() > 0
	 * Postcondition: the current sentence is not modified.
	 */
	public int findLastTime(String str) {
		/* part c - you must call findNthTime here */
		
	}
	public static void main(String[] args) {
		Sentence sentence1 = new Sentence("A cat ate late.");
		System.out.println(sentence1.findNthTime("at",1));
		sentence1.replaceNthTime("at", 1, "rane");
		System.out.println(sentence1);
		
		Sentence sentence2 = new Sentence("A cat ate late.");
		System.out.println(sentence2.findNthTime("at",6));
		sentence2.replaceNthTime("at", 6, "xx");
		System.out.println(sentence2);
		
		Sentence sentence7 = new Sentence("A cat ate late.");
		System.out.println(sentence7.findNthTime("at",3));
		sentence7.replaceNthTime("at", 3, "xx");
		System.out.println(sentence7);
		
		Sentence sentence3 = new Sentence("A cat ate late.");
		System.out.println(sentence3.findNthTime("bat",2));
		sentence3.replaceNthTime("bat", 2, "xx");
		System.out.println(sentence3);
		
		Sentence sentence4 = new Sentence("aaaa");
		sentence4.replaceNthTime("aa", 1, "xx");
		System.out.println(sentence4);
		
		Sentence sentence5 = new Sentence("aaaa");
		sentence5.replaceNthTime("aaa", 2, "bbb");
		System.out.println(sentence5);
		
		Sentence sentence6 = new Sentence("A cat ate late.");
		System.out.println(sentence6.findLastTime("at"));
		System.out.println(sentence6.findLastTime("cat"));
		System.out.println(sentence6.findLastTime("bat"));
	}

}
    
