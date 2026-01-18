import java.util.Scanner;

public class Palindrome {
 
    public static void palindromecheck(int a){
        int reversed = 0;
        int palindrome = a;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reversed = reversed * 10 + remainder;   
            palindrome = palindrome / 10;
        }
        if(reversed == a){
            System.out.println(a + " is a palindrome number.");
        }
        else{
            System.out.println(a + " is not a palindrome number.");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int palindrome = sc.nextInt();

        palindromecheck(palindrome);

}
}