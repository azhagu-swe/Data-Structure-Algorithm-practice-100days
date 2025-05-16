public class Diagonal {

    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int d1=0,d2=0;
        for(int i=0;i<arr.length;i++){
            d1 +=arr[i][i];
            d2 +=arr[i][arr.length-i-1];
        }
        System.out.println("Diagonal 1: "+d1 +"\nDiagonal 2 :"+d2);

    }
}