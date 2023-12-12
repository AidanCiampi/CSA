public class Factorials {
    public int calcFactorial (int x){
        int sum = 1;
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
        double x = 1.0;  
        while (e-olde>0.001){
            x = 1 / (x+1); 
            e = x; 
        }
        return e; 
    }

    public static void main(String[] args){
        Factorials test = new Factorials();
        System.out.println(test.calcFactorial(4));
        System.out.println(test.calcFactorial(8));
        System.out.println(test.calcE());
    }
}
