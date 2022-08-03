import java.util.Scanner;

public class PermuteString {
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to compute permutations : ");
        str = input.next();
        input.close();

        permuteStr(str, 0, str.length()-1);
    }
    public static void permuteStr(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        for(int i=l; i<=r; i++){
            str = swap(str, l, i);
            permuteStr(str, l+1, r); 
            str = swap(str, l, i);
        }
    }//r -> extreme right index, l->extreme left
    
    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
