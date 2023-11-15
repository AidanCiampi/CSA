public class TwoSpinners {
    	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
    private int rollP = 0;
    private int rollC = 0;

 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    //add code here
            return = (int)(Math.random()*(max -1) + min);
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    // add code here

	}

 	public static void main(String[] args) {
     	  TwoSpinnersds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }
