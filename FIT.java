import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int weeklyDistance = x * 2 * 5;
            System.out.println(weeklyDistance);
        }
        scanner.close();
    }
}
