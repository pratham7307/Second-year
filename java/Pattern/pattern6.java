package Pattern;

public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=2*i;j++){
                System.out.print(" ");
            }for(int k=i;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
