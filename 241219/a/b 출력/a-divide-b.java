import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a/b+ ".");
        a = a%b;
        int i = 1;
        while(i<=20) {
            System.out.print((10*a)/b);
            a=(10*a)%b;
            i++;
        }
    }
}