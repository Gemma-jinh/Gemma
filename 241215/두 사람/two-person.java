import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int age_a = sc.nextInt();
        char gender_a = sc.next().charAt(0);
        int age_b = sc.nextInt();
        char gender_b = sc.next().charAt(0);
        if ((age_a >=19 && gender_a == 'M') || (age_b >=19 && gender_b == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}