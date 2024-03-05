import java.util.Arrays;

public class study0305 {
    public static void main(String[] args) {
        // break = 제어문의 중괄호를 탈출시키는 키워드
        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i>5) {
                break;
            }
        }

        // 이중 for문에서의 break 사용법
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 100; // 매우 큰 수를 셋팅해서 바깥 for문 탈출
                    break;
                }
                System.out.println(i + "," + j);
            }
        }
        //바깥 for문까지 탈출하는 다른 방법

        out:
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out;
                }
                System.out.println(i + "," + j);
            }
        }

        // continue 사용법
        for (int i=0; i< 10; i++) {
            if (i % 2 == 1) {  // 홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println(i + "," + j);
            }

            // 문자열 수정
            String str1 = new String("안녕");
            String str2= str1;
            System.out.println(str1);
            System.out.println(str2);

            // 배열 참조 자료형
            int[] array1 = new int[] {3, 4, 5};
            int[] array2 = array1;
            array1[0] = 6;
            array1[1] = 7;
            array1[2] = 8;
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

        }
    }
}
