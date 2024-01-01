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
    public static void alternate(int num){
        for(int i = 0; i <= num; i++){ 
            for(int j = 0; j < i; j++){ 
                System.out.print(i);
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        eights();
        alternate(6);
        alternate(5);
    }
}
