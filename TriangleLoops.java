public class TriangleLoops {
    public void eights(){
        for (int i =0; i<=4; i++){
            for (int j = 8; j >=2; j=j-2){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
    public static void main(String[] args){ 
        TriangleLoops test = new TriangleLoops();
        test.eights();
    }
}
