import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int midExam = sc.nextInt();
        int finalExam = sc.nextInt();
        if (midExam < 90) {
            System.out.println(0);
        } else if (finalExam >= 95) {
            System.out.println(100000);
        } else if (finalExam >= 90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }
    }
}