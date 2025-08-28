import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int count=0;
        for (int i=a;i<=b;i++){
            if(i<2){
            }else{for(int j=1;j<=Math.sqrt(i);i++){
                if(i%j==0){
                    count+=1;
                }
            }if(count==1){
                System.out.println(i);
            }
            }
        }obj.close();
    }
}
