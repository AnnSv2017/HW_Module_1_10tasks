import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        while(x > 0){
            System.out.print(x%10);
            x /= 10;
        }
    }
}