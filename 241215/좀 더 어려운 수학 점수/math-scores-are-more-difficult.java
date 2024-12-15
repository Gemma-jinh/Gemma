import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Math_a = sc.nextInt();
        int Eng_b = sc.nextInt();
        //학생 A 영어 수학 점수
        int Math_c = sc.nextInt();
        int Eng_d = sc.nextInt();
        //학생 B 영어 수학 점수
        if (Math_a > Math_c) {
            System.out.println("A");
        } else if ((Math_a == Math_c) && (Eng_b > Eng_d)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}