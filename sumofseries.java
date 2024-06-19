import java.util.Scanner;
public class sumofseries {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long sum = 0;
        for (int i = 1;i <= N;i++) {
            sum += Long.parseLong(String.valueOf(2).repeat(i));
        } 
        System.out.println(sum);
    }
}