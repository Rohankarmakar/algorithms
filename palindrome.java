import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to check : ");
        str = input.next();
        String str_l = str.toLowerCase();
        input.close();
        // System.out.println(str);
        if(pal_check(str_l, 0, str.length()-1)){
            System.out.println("The string "+ str +" is Palindromic.");
        }
        else{
            System.out.println("The string "+ str +" is not Palindromic.");
        }
    }

    public static boolean pal_check(String str, int f, int l){
        if(str.charAt(f) != str.charAt(l)){
            return false;
        }
        if(f == l || str.charAt(f) == str.charAt(l)){
            return true;
        }
        return pal_check(str, f+1, l-1);
    }    
}
