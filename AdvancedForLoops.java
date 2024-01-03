public class AdvancedForLoops {
    public static void eights() { 
        int num = 8;
        int spaces = 0;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) { 
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print(num);
            }
            System.out.println(); 
            num -= 2;
            spaces += 1;
        }
    }
    public static void alternate(int n){
        for(int i = 0; i <= n; i++){
            if (i%2 != 0){
                for(int j = 1; j <= i; j++){
                    System.out.print(j);
                }
            }
            else{
                for(int y = i; y>=1; y--){
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
    public static void isosceles(int num){
        for(int i = 1; i <= num; i++){ 
            for(int j = 1; j <= num-i; j++){ 
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for (int j = i-1; j>=1; j--){
                System.out.print(j);
            }
        System.out.println();
        }
    }
    public static void upSideDown (int x, int y){
        for(int i =0; i<= x-y; i++){
            for( int j =0; j<=i; j++){
                System.out.print(" ");
            }
            for (int j = x-i; j>=y; j--){
                System.out.print(j);
            }
            for(int j=y+1;j<=x-i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        System.out.println("Eights");
        eights();
        System.out.println();
        System.out.print("alternate");
        alternate(6);
        alternate(5);
        alternate(7);
        alternate(8);
        System.out.println();
        System.out.println("isosceles");
        isosceles(5); 
        isosceles(6); 
        isosceles(7); 
        System.out.println();
        System.out.println("upSideDown");
        upSideDown(9,5);
        upSideDown(8,6);
        upSideDown(6,4);
        upSideDown(4,2);
    }
}
