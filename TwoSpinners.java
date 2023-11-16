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
	private int round = 0;

 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    //add code here
            result = (int)(Math.random()*(max -1) + min);
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound(){
		int rollP = spin(1,10);
		int rollC = spin(1,10);
		if (rollP > rollC){
			System.out.println("Player Won:" + (rollP - rollC) + " points \n");
		} else if (rollP < rollC){
			System.out.println("Computer Won: " + (rollP - rollC) + " points \n ");
		} else if (rollP == rollC){
			if (round < 2){
				round++; 
				playRound();
			}else {
				System.out.println("Draw");
			}
		}

	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }
