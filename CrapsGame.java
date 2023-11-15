// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public String diceRoll(int a, int b){
    point =  a + b;
    if (point == 7 || point == 11){
      return "1"; 
    }
    if (point == 2 || point == 3 || point == 12){
      return "-1";
      
    }
  }
  public int processRoll(int total)
  {

    __________________________________________
    ...

    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

