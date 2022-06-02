package class02;

public class Code01_SwapNum {
    public static void main(String[] args) {
        int a = 888;
        int b = 111;

        System.out.println("a:" + a + " b:" + b);

        a = a ^ b;
        b = a ^ b;//a ^ b ^ b
        a = a ^ b;//a ^ b ^ a

        System.out.println("a:" + a + " b:" + b);
    }
}
