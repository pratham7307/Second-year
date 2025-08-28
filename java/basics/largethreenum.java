import java.util.Scanner;

public class largethreenum {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
       System.out.println("enter the number:");
       int a=obj.nextInt();
       int b=obj.nextInt();
       int c=obj.nextInt();
       if(a>b && a>c){
        System.out.println(a);
       }else if(b>a && b>c){
        System.out.println(b);}
        else{
        System.out.println(c);
        }
       

       obj.close();}
    }

