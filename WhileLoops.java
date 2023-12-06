public class WhileLoops {
    public int addOdds (int n){
        int a = 1;
        int sum = 0;
        while (a <= n ){
          sum = sum + a;
          a = a+2;
        }
        return sum; 
    }
    public int sumDigits (int a){
        int b = 1;
        int sum = 0;
        while ( b < a)


    }
    public static void main(String[] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(7));
        System.out.println(test.addOdds(11));
        System.out.println(test.addOdds(17));
    }
}
