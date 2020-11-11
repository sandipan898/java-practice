import java.util.*;

public class UserInputDemo {
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");  
        // reading string
        String str= sc.nextLine();   
        System.out.print("You have entered: "+str);             
    }  
}
