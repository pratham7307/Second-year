package string;

import java.util.Scanner;

public class countvandc {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String abc=obj.nextLine().toLowerCase();
        int cv=0;
        int cc=0;
        for(int i=0;i<abc.length();i++){
            char ch= abc.charAt(i); 
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    cv+=1;
                }else{
                    cc+=1;
                }
            }else{
                System.out.println("Not alphabet");
            }
        }
        System.out.println(cv);
        System.out.println(cc);
        obj.close();
    }
    
}
