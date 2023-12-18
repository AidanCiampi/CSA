public class ForLoops {
    public int addEvens(int n ){
      int sum = 0; 

        for (int i = 2; i <= n; i = i+2){
            sum = sum + i;
        }
        return sum;
    }
    public void printSquareBack (int n ){
        for (int i = n; i >= 1; i = i-1){
            int x = i*i; 
            System.out.print(x + "," + " ");
        }
        System.out.println();
    }
    public void sillyNumbers(){
        for (int i = 1; i <= 3; i++){
            for (int j = 0;j <= 9; j++){
                for (int x = 1; x <=3; x = x+1){
                    System.out.print(j);
                }
            }
            
            System.out.println();
        }

    }
    public void sillyNumbers2(){
        for (int i = 1; i <= 4; i++){
            for (int j = 9; j <= 9; j--){
                for (int x = 9; x <= -1; x++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){ 
        ForLoops test = new ForLoops();
        System.out.println(test.addEvens(8));
        System.out.println(test.addEvens(16));
        System.out.println(test.addEvens(12));
        test.printSquareBack(8);
        test.sillyNumbers(); 
        test.sillyNumbers2();
        }
}
