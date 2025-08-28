import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        if (num<2){
            System.out.println("NOT PRIME");
        }else{
            for(int i=1 ; i<Math.sqrt(num); i++){
                 if (num%i==0){
                    count++;
                 }}
            if (count==1){
                System.out.println("PRIME");
            }
            
        }
        obj.close();
    }
}
