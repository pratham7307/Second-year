import java.util.Scanner;
public class employee{
    public static void main(String args[]){
        Scanner boy=new Scanner(System.in);
        System.out.println("enter your name");
        String name= boy.nextLine();
        int age=boy.nextInt();
        System.out.println("Enter your salary:");
        double salary = boy.nextDouble();      

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        boy.close();  
    
    }
}