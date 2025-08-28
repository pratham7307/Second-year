import java.util.Scanner;

public class multiplicationtable {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        System.out.println("Multiplication Table Of "+num);
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        obj.close();
    }
}
