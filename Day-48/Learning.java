public class Learning {

    public static void main(String[] args) {
        byte a=127, b=127;
        b=(byte)(a+b);
        System.out.println(b);
        b +=a;
        System.out.println(b);

    }
}