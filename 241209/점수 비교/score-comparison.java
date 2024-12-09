import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // A의 수학점수 영어점수를 a, b B의 수학점수 영어점수를 c, d라 하면
        if (a > c && b > d) {
            System.out.println(1);
        } else {
             System.out.println(0);
        }
    }
}