package string;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String abc=obj.nextLine();
        char chars[]=abc.toCharArray(); 
    
    int start=0;
int end=chars.length-1;
while(start<end){
    char temp= chars[start];
    chars[start]=chars[end];
    chars[end]=temp;
    start++;
    end--;

}  String reversed=new String(chars);
 System.out.print(reversed);
obj.close();}
}
