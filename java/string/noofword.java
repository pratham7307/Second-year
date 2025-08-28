package string;

import java.util.Scanner;

public class noofword {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String abc=obj.nextLine().trim();
        if (abc.isEmpty()){
            System.out.println("Number of words zero");
        }else{
            String[] words=abc.split("\\s+");
            System.out.println(words.length);
        }
        obj.close();
    }
}
