public class practice {
    public static String addCommas(String x){
         int n = x.length(); 
         if(n >3){
            for(int i = n; i>3; i= i-3){
                String s =x.substring(i-3);
            } 
        }
        return s
    }
    public static void main(String[] args) {
     System.out.println(addCommas(123456789));
    }
}