package Homeworks.HW02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함
        Scanner scanner = new Scanner(System.in);
        Set<String> sentence = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("문자열을 입력해 주세요: ");
            String input = scanner.nextLine();

            if (!sentence.contains(input)) {
                sentence.add(input);
            } else {
                System.out.println("중복 문자열입니다. 다시 입력하세요.");
                i--;
            }
        }

        System.out.println("저장된 문자열 화면출력:");
        for (String str : sentence) {
            System.out.println(str);
        }
    }
}