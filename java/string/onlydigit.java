package string;

public class onlydigit {
    public static void main(String[] args) {
          String test1 = "123456";
        String test2 = "123abc";

        System.out.println(isDigitsOnly(test1)); 
        System.out.println(isDigitsOnly(test2));
    }public static boolean isDigitsOnly(String str) {
        return str.matches("\\d+");
    }
}
    
