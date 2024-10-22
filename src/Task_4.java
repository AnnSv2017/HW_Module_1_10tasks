import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        String sortedA = String.valueOf(arrA);
        String sortedB = String.valueOf(arrB);
        if(sortedA.equals(sortedB)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
