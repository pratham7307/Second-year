import java.util.Scanner;

public class palindromecheck {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        int rem=0;
        int org=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (org==rev){
            System.out.println("PALLINDROME");
        }else{
            System.out.println("NOT PALLINDROME");
        }
        obj.close();
    }
    
}
