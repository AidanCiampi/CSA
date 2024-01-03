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
        }
        return sum;
    }
        public int howManyYears (double startpop, double endpop){
            int years = 0;
            while (startpop < endpop){
                startpop *= 1.0113;
                years = years+1; 
            }
            return years; 
        }
        public static void printSum(int n){
            int sum = 0;
            int i = 1;
            while (i <= n){
                sum = sum + i;
                System.out.print(i);
                if (i < n) {
                    System.out.print( " + ");
                }
                i = i+1; 
            }
            System.out.println( " = " + sum);
        }
        public boolean isPerfectSquare(int n){
            int sum = 0; 
            int i = 1; 
            while (sum < n){
                sum = sum + i;
                i = i + 2; 
            }
            return sum == n; 
        }
    public static void main(String[] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(7));
        System.out.println(test.addOdds(11));
        System.out.println(test.addOdds(17));
        System.out.println(test.sumDigits(5765));
        System.out.println(test.sumDigits(343));
        System.out.println(test.sumDigits(90));
        System.out.println(test.howManyYears(111.2, 120));
        System.out.println(test.howManyYears(111.2,150));
        printSum(6);
        printSum(8);
        printSum(10);
        System.out.println(test.isPerfectSquare(9));
        System.out.println(test.isPerfectSquare(25));
        System.out.println(test.isPerfectSquare(11));
        System.out.println(test.isPerfectSquare(17));
        

    }
}
