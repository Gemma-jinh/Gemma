import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        for (int i =a+n; i<=a+(n*n); i+=n) {
            System.out.println(i);
        }
    }
}