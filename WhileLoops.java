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
        int sum = 0;
        int n;
        while ( a > 0 ){
            n = a%10; 
            sum += n;   
            a = a/10;
        //    sum = a % 10; 
        //    a = a+sum; 
        //    a = a/10; 
        }
        return sum;
    }
        public int howManyYears (double startpop, double endpop){
            

        }
    public static void main(String[] args){
        WhileLoops test = new WhileLoops();
        // System.out.println(test.addOdds(7));
        // System.out.println(test.addOdds(11));
        // System.out.println(test.addOdds(17));
        System.out.println(test.sumDigits(5765));
        System.out.println(test.sumDigits(343));
        System.out.println(test.sumDigits(90));

    }
}
