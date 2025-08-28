import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rem=0;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev+=rem;
            num=num/10;
        }
          System.out.println(rev);
obj.close();
    }
}
