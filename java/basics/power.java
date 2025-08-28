import java.util.Scanner;
public class power {
    public static void main (String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int pow=obj.nextInt();
        int res=1;
        for (int i=0;i<pow;i++){
           res*=num;

        }
        System.out.println(res);
        obj.close();
}
}