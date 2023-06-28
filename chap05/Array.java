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

// #2_2. 최대값과 최소값
class Array3 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        // 배열의 첫번째 요소 -> 각각 max min 초기화
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

// #2_3. 섞기(shuffle)
class Array4 {
    public static void main(String[] args) {
        int[] numArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 숫자형 배열 -> 문자열로 출력
        System.out.println(Arrays.toString(numArray));

        for (int i = 0; i < 100; i++) {
            int num = (int)(Math.random() * 10); // 0 ~ 9까지 난수
            int tmp = numArray[0];
            numArray[0] = numArray[num];
            numArray[num] = tmp;
        }

        System.out.println(Arrays.toString(numArray));
    }
}

// #2_4. 로또번호 만들기
class Array5 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값 배열

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp1 = 0; // 두  값을 변경할때 사용
        int tmp2 = 0; // 난수에 사용

        for (int i = 0; i <6; i++) {
            tmp2 = (int)(Math.random() * 45); // 0 ~ 44 난수
            tmp1 = ball[i];
            ball[i] = ball[tmp2];
            ball[tmp2] = tmp1;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}