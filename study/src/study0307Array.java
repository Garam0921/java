import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class study0307Array {
    public static void main(String[] args) {
// 7. 아래 배열의 총합과 평균을 구하시요
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int sum = 12+34+56+32+84+99+73+69; {
            System.out.println("sum: "+sum);
        }
        System.out.print("");

        int avg = (12+34+56+32+84+99+73+69)/8; {
        System.out.println("avg: " + avg);
        }
        System.out.print("");


// 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
// 예) hello를 입력하면 olleh를 출력

        String str = "hello";
        String x = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            x = x + str.charAt(i);        }

        System.out.println(x);
    }
}

// for (int i = str.length() - 1; i >= 0; i--)
// for (int i=0; i< str.length; i++)

//
//// <정답>
//
//// 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
//int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
//Scanner scan = new Scanner(System.in);
//        System.out.print("0~10까지 숫자를 입력해주세요 : ");
//int num = scan.nextInt();
////        for(int i=0; i< intList1.length; i++) {
////            if (intList1[i] > num) {
////                System.out.print(intList1[i] + " ");
////            }
////        }
//
//// 새로운 배열에 담기
////        int[] intList2 = new int[intList1.length];
////        int count = 0;
////        for(int i=0; i< intList1.length; i++) {
////            if (intList1[i] > num) {
////                intList2[count] = intList1[i];
////                count = count + 1;
////            }
////        }
////        System.out.print(Arrays.toString(intList2));
//
//// 새로운 배열에 담기 : ArrayList 사용하기
////        ArrayList<Integer> intList3 = new ArrayList<Integer>();
////        for(int i=0; i< intList1.length; i++) {
////            if (intList1[i] > num) {
////                intList3.add(intList1[i]);
////            }
////        }
////        System.out.print(intList3.toString());
//
//// 7. 아래 배열의 총합과 평균을 출력
//int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
//int sum = 0;
//        for (int i=0; i<numberList.length; i++) {
//sum = sum + numberList[i];
//        }
//int average = sum / numberList.length;
//        System.out.println(sum + " " + average);
//
//// 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
//// 예) hello 를 입력하면 olleh 를 출력
//Scanner sc1 = new Scanner(System.in);
//        System.out.print("문자열을 입력해주세요 : ");
//String inputStr = sc1.nextLine();
//
//char[] charList1 = inputStr.toCharArray(); // 입력받은 문자열을 char 배열에 담음
//char[] charList2 = new char[charList1.length]; // 거꾸로 저장할 새로운 배열을 만듬
//int index = charList2.length - 1; // 새로운 배열의 위치를 나타내는 변수
//        for (int i=0; i< charList1.length; i++) {
//charList2[index] = charList1[i];
//index = index - 1;
//        }
//        // 배열형태로 출력
//        System.out.println(Arrays.toString(charList2));
//        // 문자열로 출력하기 위해 반복문 사용
//        for (int i=0; i< charList2.length; i++) {
//        System.out.print(charList2[i]);
//        }
//                System.out.println();
//    }
//            }
//
