import java.util.Scanner;

/**
 * Created by KPS on 7/6/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a Binary number :");
        long binary = scanner.nextLong();
        int sum = 0,j=1;
        while (binary!=0){
            sum+= (binary%10)*j;
            j=j*2;
            binary=binary/10;
        }
        System.out.println(sum);
    }
}
