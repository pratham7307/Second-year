import java.util.Scanner;
public class sumnatural{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }System.out.println(sum);
        obj.close();
    }
}
