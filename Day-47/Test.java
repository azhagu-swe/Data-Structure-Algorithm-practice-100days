
public class Test {
    public static void main(String[] args) {
        int number=6;
        for(int i=0;i<number;i++){
            for(int j=number;j>0;j--){
                if(j<=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
