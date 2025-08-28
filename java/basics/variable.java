public class variable {
    public static void main(String[] args) {
        // int a=10;
        // float b=19.54f;
        // char c='A';
        // String d="surya";
        // System.out.println(a);
        //  System.out.println(b);
        //   System.out.println(c);
        //  System.out.println(d);
        int a = 10;
        // int b = 23;
        // int temp = a;
        // a =b;
        // b = temp;
        // System.out.println(a + " " + b);
        for (int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(i==0 || i==a || j==0||j==a){ 
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }System.out.println();

    }
}}
