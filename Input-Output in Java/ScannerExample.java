import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args) {
        //creating object of Scanner class to
        //read input from keyboard
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an integer and a String");

        int a = scn.nextInt();

        String b = scn.nextLine();

        System.out.println("You have entered: "+a+" "+"and name as "+b);

    }
}
