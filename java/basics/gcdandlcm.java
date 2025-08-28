import java.util.Scanner;

public class gcdandlcm {
    static int gcd(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; }

    static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;   
        int g=gcd(a,b);  
        return Math.abs((a / g) * b);       
    }

    
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println(gcd(a, b));
    System.out.println(lcm(a,b));
obj.close();}
}
