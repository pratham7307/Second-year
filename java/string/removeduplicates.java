package string;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String input=obj.nextLine();
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
            }
        }

        for (char c : seen) {
            result.append(c);
        }

        System.out.println(result.toString());
        obj.close();
    }}