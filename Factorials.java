public class Factorials {
    public long calcFactorial (int x){
        long sum = 1;
        int i = 1; 
        while (i < x){
            i = i+1; 
            sum=sum*i;
        }
        return sum; 
    }
    public double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int x = 1;  
        while (e-olde>0.001){
            olde = e;
            e += 1.0 / (calcFactorial(x)); 
            x = x+1; 
        }
        return e; 
    }
    public double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int y = 1; 
        while (e - olde > 0.001){
            olde = e;
            e += Math.pow(x,y) / (calcFactorial (y)); 
            y = y+1; 
        }
        return e; 
    }

    public static void main(String[] args){ 
        
        Factorials test = new Factorials();
        for (int x =1; x<= 20; x++ ){
            System.out.println(test.calcFactorial(x));
        }
        
        System.out.printf("e is %2.3f \n", test.calcE());
        for (int x = 1; x <= 5; x++){
            System.out.printf("e is %2.3f \n", test.calcEX(x));
        
        }
    }
}
