/**
 * expo
 */
import java.util.Scanner;
public class expo {

    public static void main(String[] args) {
        System.out.println("Enter value of a and b : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        long result = expFunc(a,b);
        System.out.println("The result is "+result);
    }
    public static int expFunc(int a, int b){
        if(b == 0){
            return 1;
        }
        return a*expFunc(a, b-1);        
    }
}
