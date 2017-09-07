/** author Bethlehem Teshome
 * 09/05/2017
 */ import java.util.Scanner;
public class username {
    public static void main(String[] args){
        String name;
        String password;
        Scanner kb= new Scanner (System.in);
        System.out.println("Enter your username");
        name= kb.nextLine();
        System.out.println(" Enter your password");
        password= kb.nextLine();
        System.out.println ("Hello" + name + "Welcome to CSC200 class! And your password is"+ password);


    }
}

