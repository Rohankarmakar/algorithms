import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of peoples : ");
        int n = input.nextInt();
        System.out.println("Enter the value of K : ");
        int k = input.nextInt();
        input.close();

        System.out.println("The Safe position is : "+ solver(n,k));
    }

    public static int solver(int n, int k){
        if(n == 1){
            return 0;
        }
        return (solver(n-1, k) + k)%n;
    }
}
