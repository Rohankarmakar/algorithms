import java.util.Scanner;

public class SuperStrings {
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to check : ");
        str = input.next();
        input.close();

        printSuperString(str, 0, "");
    }
    public static void printSuperString(String str, int i, String cur){
        if(i == str.length()){
            System.out.println(cur);
            return;
        }
        printSuperString(str, i+1, cur+str.charAt(i));
        printSuperString(str, i+1, cur);
    }
}
