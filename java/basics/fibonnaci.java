import java.util.Scanner;

public class fibonnaci {
    public static void main(String args[]){
          Scanner obj =new Scanner(System.in);
          int num=obj.nextInt();
          int a=0;
          int b=1;
          int next=0;
          System.out.println(a);
            System.out.println(b);
          for (int i=1;i<num;i++){
            next=a+b;
            System.out.println(next);
            a=b;
            b=next;
          }
          obj.close();
    }
}
