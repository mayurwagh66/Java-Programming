import java.util.Scanner;

public class Iseven {

    public static void Iseven( int a){
        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Iseven(a);

    }
}
