public class Strings{
    public static String scroll(String x){ //x = jump
        char a = x.charAt(0);
        String b = x.substring(1);
        return b+a;
}
    public static String convertName(String x){ //x = the clown, bozo
      int a = x.indexOf(",");
        String last = x.substring(0,a).trim();
        String first = x.substring(a+1).trim(); 
        return first+ " " + last; 
        
    }
    public static String negative(String x){
        String change = x.replace( "0", "1");
        String change1 = x.replace("0","1");
        }
        
    
public static void main(String[] args) {
System.out.println(scroll("Hello World"));
System.out.println(scroll("happy"));
System.out.println(scroll("h"));
System.out.println(convertName(" Reubenstein, Lori Renee "));
System.out.println(convertName("Biden,Joe"));
System.out.println(convertName("the Clown, Bozo"));
System.out.println(negative("0010111001"));
System.out.println(negative("11111111"));
    }
}