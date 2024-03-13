import java.util.Arrays;

public class study0312 {
    public static void main(String[] args) {
        // 아래 배열의 모든 값들을 다른 배열에 복사하기(for문 이용)


        int[] intArray1 = {1, 2, 3, 4, 5};
        int[] intArray2 = intArray1.clone();

        for (int i = 0; i < intArray2.length; i++) {
            System.out.print(intArray2[i] + " ");
        }
    }
}

/*  int[] intArray1 = {1, 2, 3, 4, 5};
    int[] intArray2 = new int[intArray1.length];
    for (int i = 0; i < intArray2.length; i++) {
        intArray2[i] = intArray1[i];
    }
    System.out.print(intArray1[i] + " ");
    System.out.print(intArray2[i] + " ");           */


