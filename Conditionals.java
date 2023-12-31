public class Conditionals {
    
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;

    }
    public boolean negPos(int a, int b, boolean negative){
        if (negative && a * b > 0){
            return a < 0 && b < 0;
        }
        return (!negative && a < 0 ^ b < 0);
    }
       
    public boolean pickUpPhone (boolean isMorning, boolean isMom, boolean isAsleep){
        if (isMorning && isMom && !isAsleep){
            return true;
        }
        return !(isMorning || isAsleep);
    }
    public String setAlarm(int day, boolean onVacation){
       if (onVacation && (day ==0 || day ==6)){
        return "off";
       } else if (day== 0 || day == 6 || onVacation){
        return "10:00";
       }
       return "7:00";
    }
    public boolean oneDigitSame(int a, int b, int c){
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
    public int blackjack(int a, int b){
        if (a <= 21 && b <=21){
            if (a < b){
                return b;
            }
            return a;
        } else if (a > 21 && b > 21){
            return 0;
        }
        else if (a > b){
            return b;
        }
        else if (b > a){
            return a;
        }
        return 0;
    }
    public static void main(String[] args){
        Conditionals condition = new Conditionals();
        // Chimp
        System.out.println ("Chimp: \n");
        System.out.println(condition.chimpTrouble(true, true));
        System.out.println(condition.chimpTrouble(false, false));
        System.out.println(condition.chimpTrouble(true, false));
        System.out.println(condition.chimpTrouble(false,true));
        System.out.println("\n");
        // Coords
        System.out.println("Coords: \n");
        System.out.println(condition.negPos(1, -1, false));
        System.out.println(condition.negPos(-1, 1, false));
        System.out.println(condition.negPos(1, 1, false));
        System.out.println(condition.negPos(-1, -1, false));
        System.out.println(condition.negPos(-4, -5, true));
        System.out.println(condition.negPos(-4, 5, true));
        System.out.println(condition.negPos(4, 5, true));
        System.out.println(condition.negPos(4, -5, true));
        System.out.println("\n");
        // Phone
        System.out.println("Phone: \n");
        System.out.println(condition.pickUpPhone(false, false, true));
        System.out.println(condition.pickUpPhone(true, true, true));
        System.out.println(condition.pickUpPhone(true, true, false));
        System.out.println(condition.pickUpPhone(false, true, false));
        System.out.println(condition.pickUpPhone(true, false, false));
        System.out.println(condition.pickUpPhone(false, false, false));
        System.out.println("\n");
        // Days
        System.out.println("Days: \n");
        System.out.println(condition.setAlarm(1, false));
        System.out.println(condition.setAlarm(5, false));
        System.out.println(condition.setAlarm(0, false));
        System.out.println(condition.setAlarm(2, true));
        System.out.println(condition.setAlarm(4, true));
        System.out.println(condition.setAlarm(6, true));
        System.out.println("\n");
        // 1 digit
        System.out.println("1 Digit: \n");
        System.out.println(condition.oneDigitSame(23, 19, 13));
        System.out.println(condition.oneDigitSame(23, 19, 12));
        System.out.println(condition.oneDigitSame(23, 19, 3));
        System.out.println(condition.oneDigitSame(423, 13, 3));
        System.out.println(condition.oneDigitSame(23, 29, 25));
        System.out.println("\n");
        // Blackjack
        System.out.println("Blackjack: \n");
        System.out.println(condition.blackjack(19, 21));
        System.out.println(condition.blackjack(21, 19));
        System.out.println(condition.blackjack(19, 22));
        System.out.println(condition.blackjack(8, 8));
        System.out.println(condition.blackjack(25, 24));
        System.out.println(condition.blackjack(17, 9));
        System.out.println(condition.blackjack(12, 18));
        System.out.println("\n");
        }
    }
    

