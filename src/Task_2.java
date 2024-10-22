import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder res = new StringBuilder();
        char prev = s.charAt(0);
        int i, count = 1;
        for(i=1; i<s.length(); i++){
            if(prev == s.charAt(i)){
                count++;
            }
            else{
                res.append(prev).append(count);
                prev = s.charAt(i);
                count = 1;
            }
        }
        res.append(prev).append(count);
        System.out.println(res);
    }
}
