package Pattern;

public class pattern10 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }for(int k=i;k<=2*n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
