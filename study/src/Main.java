import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num == 0) ? "0" : (num > 0) ? "양수" : "음수";
        System.out.println(result);
    }
}