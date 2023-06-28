// 배열 (Array) : 같은타입 여러변수 -> 하나의 묶음으로 다루는 것

import java.util.Arrays;

// #1. 배열의 출력
class Array1 {
    public static void main(String[] args) {
        int[] iArray1 = new int[10]; // 0 ~ 9
        int[] iArray2 = new int[10]; // 0 ~ 9

        int[] iArray3 = {100, 95, 80, 70, 60}; // 배열의초기화

        char[] chArray = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArray1.length; i++) { // i -> 0 ~ 9 index number
            iArray1[i] = i + 1; // 배열에 1 ~ 10 값 넣음
        }

        for (int i = 0; i < iArray2.length; i++) { // i -> 0 ~ 9 index number
            iArray2[i] = (int)(Math.random() * 10) + 1; // 1 ~ 10까지 난수 삽입
        }

        for (int i = 0; i < iArray1.length; i++) {
            System.out.print(iArray1[i] + ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArray2));
        // Arrays.toString() -> 배열의모든요소 String type으로 반환
        System.out.println(Arrays.toString(iArray3));
        System.out.println(Arrays.toString(chArray));

        // 배열 바로 출력 -> 참조변수 반환
        System.out.println(iArray3);
        // char type 배열 바로 출력 -> 구분자없이 배열의모든요소 예외출력
        System.out.println(chArray);
    }
}

// #2. 배열의 활용
// #2_1. 총합과 평균
class Array2 {
    public static void main(String[] args) {
        int sum = 0; // 총합변수
        float average = 0f; // 평균변수 (float -> 접미사 f)

        int[] score = {100, 88, 100, 100, 90};

        // 총합변수 <- 배열요소 넣기
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // 평균값 구하기
        average = sum / (float)score.length; // average float type에 맞춰 형변환

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}