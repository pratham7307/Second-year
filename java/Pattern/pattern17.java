package Pattern;

public class pattern17 {
    public static void main(String[] args) {
        float n=7.0f;
        int a=1;
        for(int i=0;i<=n/2;i++){
            for(int j=i;j<=(n/2);j++){
                System.out.print(" ");
            }for(int k=0;k<a;k++){
                System.out.print("*");
            }
        
        System.out.println();
        a+=2;}
        int m=5;
        for(int i=1;i<n/2;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }for(int k=0;k<m;k++){
                System.out.print("*");
            }
            System.out.println();
            m-=2;
        }}}
