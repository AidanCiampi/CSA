public class Fraction {
   private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
    public Fraction(){

    
    
    numerator = 3;
    denominator = 4;
    }

	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract()
	public Fraction subtract (Fraction other)
    {
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator * other.denominator;

        Fraction answer = new Fraction (n,d);
        return answer; 
    }
	// TODO multiply()
	public Fraction multiply(Fraction other)
    {
        int n = this.numerator * other.numerator;
        int d = this.denominator * other.denominator;
        Fraction result = new Fraction(n,d);
        return result;
    }
	// TODO toString()
	public String toString(){
        return numerator + "/" + denominator;  
    }

    

	// TODO reciprocal()
	public Fraction reciprocal(){

    
    
        Fraction result = new Fraction (denominator, numerator);
        return result;

        

        }
        
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
        Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
       
        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);

        Fraction f6 = f2.reciprocal();
        System.out.println(f6);
    
		
	
		
		//Add code to multiply f1 and f2 here
		
		//Add code to call reciprocal here
		
		//create 2 new fractions and add them here.
		
		Fraction f7 = new Fraction (8,9);
        Fraction f8 = new Fraction (3,7);
        Fraction f9 = f7.add(f8);
		System.out.println(f7 + " + " + f8 + " = " + f9);
		

	}

} 

