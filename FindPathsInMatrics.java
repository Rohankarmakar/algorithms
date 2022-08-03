import java.util.Scanner;
public class FindPathsInMatrics{
    public static void main(String args[]){
    //    System.out.println("This is the snippet for the java");
        int x,y,ways;//x,y  end ; 1,1 starting position
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the position of destination (row col): ");
       x = input.nextInt();
       y = input.nextInt();

       input.close();
       ways = pathFinder(x,y);
       System.out.println("Total ways are: "+ ways);
    }
    static int pathFinder(int x, int y){
        if(1 == x || 1 == y){
            return 1;
        }
        return pathFinder(x-1, y) + pathFinder(x, y-1);
    }
}