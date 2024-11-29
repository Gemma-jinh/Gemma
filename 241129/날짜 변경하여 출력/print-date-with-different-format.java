import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\."); //구분자를 정규표현식으로 받기때문에 .을 이용하기 위해선 앞에 \\을 붙여야 한다.
        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}