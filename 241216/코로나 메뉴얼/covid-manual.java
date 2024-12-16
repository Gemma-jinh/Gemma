import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char disease_a = sc.next().charAt(0);
        int temp_a = sc.nextInt();
        char disease_b = sc.next().charAt(0);
        int temp_b = sc.nextInt();
        char disease_c = sc.next().charAt(0);
        int temp_c = sc.nextInt();
        
        if((disease_a=='Y' && temp_a >=37) && (disease_b=='Y' && temp_b>=37)) {
            System.out.println('E');
        } else if ((disease_a=='Y' && temp_a >=37) &&(disease_c=='Y' && temp_c>=37)) {
             System.out.println('E');
        } else if ((disease_b == 'Y' && temp_b>=37) &&(disease_c=='Y' && temp_c>=37)) {
             System.out.println('E');
        } else {
             System.out.println('N');
        }
    }
}