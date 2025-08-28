import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a);
        System.out.println(b);
        obj.close();
    }
}
