public class MathEx {
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(342));
        System.out.println(swap(592));
        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        dayOfWeek(0,1);
    }
    public static int swap (int y){
        int onesvalue = y%10;
        int tensvalue = y%100/10;
        int hundredsvalue = y/100;
        int answer = hundredsvalue*100 + onesvalue*10 + tensvalue;
        return answer;
    }

    
    public static void timeLeft (int curHour, int curMin, int depHour, int depMin){ 
        int curTime = curHour*60 + curMin;
        int depTime = depHour*60 + depMin;
        int waitTime = depTime - curTime;
        System.out.println(waitTime/60 + " Hours and " + waitTime%60 + " minutes");
    }
    public static void dayOfWeek (int day, int date){
        int 



    }
    
}
    
