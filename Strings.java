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
         x = x.replace( "0", "A");
         x = x.replace("1","0");
         x = x.replace("A","1");
         return x;
        }
   
   
    public static String convertDate(String x){
        String day = x.substring(3,5) + "-" + x.substring(0,2) + "-" +x.substring(6,10);
        return day;
    }
    public static String convertDate2(String x){
        int day = x.indexOf("/");
        int month = x.lastIndexOf("/");
        x = x.replace("/", " ");
        String m = x.substring(0,day);
        if(m.length() > 2){
             m = "0"+m;
        }
        String d = x.substring(day+1,month);
        if(d.length() > 2){
            d = "0"+d;
       }
        String year = x.substring(month+1);
        String date = " " + d + "-" + m + "-" + year;
       
        return date; 

    }

   
        //     String day = x.substring(1,2) + x.substring(3,5);
    //     day = day.replace("0","");
    //     String month = x.substring(3,5);
    //     month = month.replace("0","");
    //     String year = x.substring(6,10);
    //     String date = month + "-" + day + "-" + year;
    //     return date;
    // }
        
    
public static void main(String[] args) {
System.out.println(scroll("Hello World"));
System.out.println(scroll("happy"));
System.out.println(scroll("h"));
System.out.println(convertName(" Reubenstein, Lori Renee "));
System.out.println(convertName("Biden,Joe"));
System.out.println(convertName("the Clown, Bozo"));
System.out.println(negative("0010111001"));
System.out.println(negative("11111111"));
System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));
    }
}