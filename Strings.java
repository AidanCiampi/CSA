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
        if(m.length() < 2){
             m = "0"+m;
        }
        String d = x.substring(day+1,month);
        if(d.length() < 2){
            d = "0"+d;
       }
        String year = x.substring(month+1);
        String date = " " + d + "-" + m + "-" + year;
       
        return date; 

    }
    public static boolean startsWith(String s, String prefix){
        return (s.indexOf(prefix))==0;
    }
   
    public static boolean endsWith(String s, String suffix){
        int a = suffix.length();
        int b = s.length();
        if(a>b){
            return false;
        }
        int c = b-a;
        String x = s.substring(c);
        if (x.equals(suffix)){
            return true;
        }
        else{
                return false;
            }
        }
    public static String removeTag(String a, String b){
        int x = a.indexOf("<" + b + ">");
        int y = a.indexOf("</" + b + ">");
        if (x == -1 || y == -1){
            return a;
        }
        if (x >= y){
            return a;
        }
        return a.substring(x + b.length()+2, y);
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
System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));
System.out.println("\nstartsWith");
System.out.println(startsWith("architecture", "arch"));
System.out.println(startsWith("architecture", "a"));
System.out.println(startsWith("arch", "architecture"));
System.out.println(startsWith("architecture", "rch"));
System.out.println(startsWith("architecture", "architecture"));
System.out.println("\nendsWith");
System.out.println(endsWith("astronomy", "nomy"));
System.out.println(endsWith("astronomy", "y"));
System.out.println(endsWith("astronomy", "nom"));
System.out.println(endsWith("nomy", "astronomy"));
System.out.println(endsWith("astronomy", "astronomy"));
System.out.println("\nremoveTag");
System.out.println(removeTag("<b>Hello World</b>", "b"));
System.out.println(removeTag("<b>Hello World</b>", "head"));
System.out.println(removeTag("Hello World</b>", "b"));
System.out.println(removeTag("<b>Hello World", "b"));
System.out.println(removeTag("</img>Hello World<img>", "img"));
System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
"title"));
System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}