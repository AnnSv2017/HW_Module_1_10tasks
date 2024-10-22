import java.util.Scanner;

public class Task_3 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int x = in.nextInt();
        System.out.print(x + " ");
        int prev = x;
        for(i=1; i<n; i++){
            x = in.nextInt();
            if(x > prev){
                System.out.print(x + " ");
                prev = x;
            }
        }
    }
}
