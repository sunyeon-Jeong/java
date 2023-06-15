import java.util.Scanner;

// 1. 연산자결합규칙
class Operator1 {
    public static void main(String[] args) {
        int x, y;

        // (대입)연산순서 : 오른쪽 -> 왼쪽
        x = y = 3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// 2. 증감연산자
class Operator2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        // 후위형
        j = i++;
        System.out.println("j = i++; 실행 후, i = " + i + " j = " + j);

        // 값 초기화
        i = 5;
        j = 0;

        // 전위형
        j = ++i;
        System.out.println("j = ++i; 실행 후, i = " + i + " j = " + j);
    }
}

class Operator3 {
    public static void main(String[] args) {
        int i = 5, j = 5;

        // 후위형 : i값 출력 -> 1증가
        System.out.println(i++);

        // 전위형 : j값 1 증가 -> 출력
        System.out.println(++j);

        // 한번 출력 후 -> i값 증가됨
        System.out.println("i = " + i + " j = " + j);
    }
}

// 3. 부호연산자
class Operator4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // + 연산자 하는일 없음
        System.out.println(i);

        i = -10;
        i = -i; // - 연산자 -> 부호변경
        System.out.println(i);
    }
}

// 4. 형변환연산자
class Operator5 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;

        // 형변환 -> 일시적 (피연산자 변수값 그대로 유지)
        System.out.println("score = " + score);
        System.out.println("d = " + d);
    }
}

// 5. 사칙연산자
class Operator6 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        System.out.println(a + b); // 덧셈
        System.out.println(a - b); // 뺄셈
        System.out.println(a * b); // 곱셈
        System.out.println(a / b); // 나눗셈
        System.out.println(a / (float)b); // 2.5 자동형변환 -> 실수형
    }
}

// 6. 산술변환
class Operator7 {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5 / (float)2);
    }
}

class Operator8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;

        // a, b -> int로 변환 -> byte c에 저장 불가 -> 형 명시 필수
        byte c = (byte)(a * b);

        // 데이터손실 issue
        System.out.println(c);
    }
}

// 7. Math.round()
class Operator9 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;

        System.out.println(shortPi);
    }
}

// 8. 나머지연산자
class Operator10 {
    public static void main(String[] args) {
        int x = 10, y = 8;

        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);

        // 나머지연산자 -> 부호 무시하고 결과출력
        System.out.println(-10 % 8);
        System.out.println(10 % 8);
    }
}

// 9. 문자열비교
class Operator11 {
    public static void main(String[] args) {
        String str1 = new String("mallang");
        String str2 = "chunsik";
        String str3 = "chunsik";

        // 대소문자 구별
        boolean result1 = str1.equals("mallang");
        System.out.println(result1);
        // 대소문자 구별X
        boolean result2 = str2.equalsIgnoreCase("Chunsik");
        System.out.println(result2);

        // (==) -> 객체가 다르면 False
        // equals() -> 객체가 달라도 내용만 같으면 True
        boolean result3 = str2.equals(str3);
        System.out.println(result3);
    }
}

// 10. 논리연산자
class Operator12 {
    public static void main(String[] args) {
        // 사용자입력 받기 위한 객체생성
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';

        System.out.printf("문자를 하나 입력하시오 >>>");

        String input = scanner.nextLine();

        // input -> 문자로 형변환
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}

// 11. 논리부정연산자
class Operator13 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b = %b%n", b);
        System.out.printf("!b = %b%n", !b);
        System.out.printf("!!b = %b%n", !!b);
        System.out.printf("!!!b = %b%n", !!!b);
    }
}

// 12. 조건연산자
class Operator14 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 7;
        int result;

        result = (num1 - num2 > 0) ? num1 : num2;

        System.out.println("두 정수 중, 더 큰 수 : " + result);
    }
}