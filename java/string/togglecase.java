package string;

import java.util.Scanner;

public class togglecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String abcd=sc.nextLine();
        String toggled=toggle(abcd);
        System.out.println(toggled);
        sc.close();
    }
    public static String toggle(String str){
         StringBuilder sb=new StringBuilder();
         for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(c);
            }
         }return sb.toString();
    }
}
